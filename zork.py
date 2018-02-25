"""
extra credit:
   move: run
       run past monster
       40% success
       use random
   Implement the board using nested lists
       (each item of the list is a list.)
"""

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

    # boolean items
    sword = False
    sword_num = 0
    magic_stone = False

    # introduction
    print("There are 3 floors and 5 rooms and a monster in each floor.")
    print("You can only defeat a monster with a sword.")
    print("However, on the third floor, there is a boss monster guarding the prize.")
    print("You can only defeat the boss monster if you have a sword and a magic stone.")
    print("After you defeat each monster, the item you used will disappear.\n")

    # beginning position
    print("You are placed in one of the rooms on the first floor.\n", current_room)

    while current_room != "prize":
        user_input = input("What do you want to do?")
        if user_input == "help":
            print("The possible commands are: left, right, up, down, grab, and fight.")
            user_input = input("What do you want to do?")

        if user_input == "down":
            if current_room != "downstairs":
                print("Can't go downstairs; there are no stairs.")
            else:
                if user_floor == b:
                    user_floor = a
                elif user_floor == c:
                    user_floor = b
                current_room = user_floor[user_room]
                print("You went downstairs\n", current_room)

        elif user_input == "up":
            if current_room != 'upstairs':
                print("Can't go upstairs; there are no stairs.")
            else:
                if user_floor == a:
                    user_floor = b
                elif user_floor == b:
                    user_floor = c
                current_room = user_floor[user_room]
                print("You went upstairs\n", current_room)

        elif user_input == "left":
            if user_room != 0:
                if current_room != "monster":
                    global go_right
                    go_right = True
                    user_room = user_room - 1
                    print("You moved to the room on the left")
                    current_room = user_floor[user_room]
                    print(current_room)
                else:
                    print("You have been killed by the monster.\nGame Over!")
                    break
            else:
                print("There is a wall on your left.")

        elif user_input == "right":
            if user_room != 4:
                if current_room != "monster":
                    global go_left
                    go_left = True
                    go_right = False
                    user_room = user_room + 1
                    print("You moved to the room on the right")
                    current_room = user_floor[user_room]
                    print(current_room)
                else:
                    print("You have been killed by the monster.\nGame Over!")
                    break
            else:
                print("There is a wall on your right.")

        elif user_input == "grab":
            if current_room == 'magic stones' or 'sword':
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

        # need to add stuff to this
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
                    print("You don't have enough items to defeat the monster.")
                    leave = input("You may 'exit' or 'pass'.")
                    if leave == "exit":
                        if go_right:
                            user_room = user_room + 1
                            current_room = user_floor[user_room]
                            go_right = False
                        elif go_left:
                            user_room = user_room - 1
                            current_room = user_floor[user_room]
                            go_left = False
                        else:
                            go_left = False
                            go_right = False
                        print("You have left the room")
                        print(current_room)
                    elif leave == "pass":
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
                    leave = input("You may 'exit' or 'pass'.")
                    if leave == "exit":
                        if go_left:
                            user_room = user_room - 1
                            print("You moved to the room on the left")
                            current_room = user_floor[user_room]
                        elif go_right:
                            user_room = user_room + 1
                            print("You moved to the room on the left")
                            current_room = user_floor[user_room]
                        print("You have left the room")
                        print(current_room)
                    elif leave == "pass":
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
