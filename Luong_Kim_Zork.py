import random

# floor
a = ['sword', 'monster', 'sword', 'upstairs', 'nothing']
b = ['upstairs', 'magic stones', 'monster', 'downstairs', 'sword']
c = ['downstairs', 'monster', 'sword', 'boss monster', 'prize']

bag = []

# boolean exit (left or right)
go_left = False
go_right = False


def main():
    # user position
    user_floor = a
    user_room = 0
    current_room = user_floor[user_room]

    # boolean items for fight statements
    sword = False
    magic_stone = False
    # count how many swords in the bag
    sword_num = 0

    # introduction
    print('"Your mission is to collect the prize that awaits for you in a three story dungeon.')
    print(" There are a few things you must know about this dungeon before entering")
    print(" On each move, you are given 8 possible commands. (Type help to list all possible commands)")
    print(" In each floor, there are 5 rooms and a monster.")
    print(" A monster can only be defeated with a sword.")
    print(" Once defeated, the item you used will disappear.")
    print(" On the 3rd floor, there is a boss guarding the prize.")
    print(" The boss can only be defeated with a sword and a magic stone")
    print(' That is everything you need to know! You may enter in the portal..."\n')
    # beginning position
    print("Enters in the portal...")
    print("You are placed in a rooms on the 1st floor.\nThere's a", current_room, "in this room.")

    while current_room != "prize":
        user_input = input("What would you like to do?")
        if user_input == "help":
            print("The possible commands are: left, right, up, down, grab, run, and fight.")
            user_input = input("What would you like to do?")

        if user_input == "down":
            if current_room != "downstairs":
                print("Can't go downstairs; there are no stairs.")
            else:
                if user_floor == b:
                    user_floor = a
                elif user_floor == c:
                    user_floor = b
                current_room = user_floor[user_room]
                print("You went downstairs\n\nThis room contains a", current_room)

        elif user_input == "up":
            if current_room != 'upstairs':
                print("Can't go upstairs; there are no stairs.")
            else:
                if user_floor == a:
                    user_floor = b
                elif user_floor == b:
                    user_floor = c
                current_room = user_floor[user_room]
                print("You went upstairs\n\nThis room contains a", current_room)

        elif user_input == "left":
            if user_room != 0:
                if current_room != "monster" or current_room != "boss monster":
                    global go_right
                    go_right = True
                    user_room = user_room - 1
                    current_room = user_floor[user_room]
                    print("You moved to the room on the left\n\nThis room contains a", current_room)
                else:
                    print("You have been killed by the monster.\nGame Over!")
                    break
            else:
                print("There is a wall on your left.")

        elif user_input == "right":
            if user_room != 4:
                if current_room != "monster" or current_room != "boss monster":
                    global go_left
                    go_left = True
                    go_right = False
                    user_room = user_room + 1
                    current_room = user_floor[user_room]
                    print("You moved to the room on the right\n\nThis room contains a", current_room)
                else:
                    print("You have been killed by the monster.\nGame Over!")
                    break
            else:
                print("There is a wall on your right.")

        elif user_input == "grab":
            if current_room == 'magic stones' or current_room == 'sword':
                if len(bag) == 4:
                    print("You cannot add anymore items in your bag.")
                else:
                    if current_room != "nothing":
                        bag.append(current_room)
                        if current_room == 'magic stones':
                            magic_stone = True
                        elif current_room == 'sword':
                            sword = True
                            sword_num += 1
                        print("You added a", current_room)
                        user_floor[user_room] = "nothing"
                        current_room = user_floor[user_room]
                    else:
                        print("There is no magic stones or swords.")
            else:
                print("There is no magic stones or swords.")

        elif user_input == "run":
            if current_room == "monster" or current_room == "boss monster":
                percent = random.randint(1, 100)
                if percent <= 40:
                    if go_right:
                        user_room = user_room - 1
                        go_right = False
                    elif go_left:
                        user_room = user_room + 1
                        go_left = False
                    else:
                        go_right = False
                        go_left = False
                    current_room = user_floor[user_room]
                    print("You have successfully escaped from the monster.\n\nThis room contains a", current_room)
                elif percent >= 41:
                    print("You have been killed by the monster.")
                    print("Game Over!")
                    break
            else:
                print("You cannot run. There is nothing to run away from.")

        elif user_input == "fight":
            if current_room == 'monster':
                if sword:
                    bag.remove("sword")
                    print("You have defeated the monster. You no longer have the object you used.")
                    user_floor[user_room] = "nothing"
                    current_room = user_floor[user_room]
                    sword_num -= 1
                    sword = False
                    if sword_num >= 1:
                        bag.append("sword")
                        sword = True
                else:
                    print("You don't have any items to fight the monster.")
                    leave = input("You may 'continue', 'exit', or 'pass'.")
                    if leave == "exit":
                        if go_right:
                            user_room = user_room + 1
                            go_right = False
                        elif go_left:
                            user_room = user_room - 1
                            go_left = False
                        else:
                            go_left = False
                            go_right = False
                        current_room = user_floor[user_room]
                        print("You have left the room\n\nThis room contains a", current_room)
                    elif leave == "pass" or "continue":
                        print("You have been killed by the monster.")
                        print("Game Over!")
                        break
            elif current_room == 'boss monster':
                print("The boss monster is in this room.")
                if sword and magic_stone:
                    bag.remove("sword")
                    bag.remove("magic stones")
                    user_floor[user_room] = "nothing"
                    current_room = user_floor[user_room]
                    print("You have defeated the monster. You no longer have the objects you used.")
                else:
                    print("You don't have enough items to defeat the monster.")
                    leave = input("You may 'continue', 'exit' or 'pass'.")
                    if leave == "exit":
                        if go_left:
                            user_room = user_room - 1
                        elif go_right:
                            user_room = user_room + 1
                        current_room = user_floor[user_room]
                        print("You have left the room\n\nThis room contains a", current_room)
                    elif leave == "pass" or "continue":
                        print("You have been killed by the monster.")
                        print("Game Over!")
                        break
            else:
                print("There is no monster to fight")
        else:
            print("That is not a command.")
    else:
        print("Game Completed! You collected the prize!")


main()