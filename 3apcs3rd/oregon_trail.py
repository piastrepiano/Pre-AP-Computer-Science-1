import random

# Use globals to keep track of player health, food pounds, miles to go, current day, current month
health = 5
food = 500
distance = 2000
# how many miles traveled
distance_traveled = 0
# Player starts in NYC on 03/01
current_month = 3
current_day = 1
days_used = 0
# Use global list to keep track of which months have 31 days and use this in the add_day function
# [1, 3, 5, 7, 8, 10, 12]
days_in_months = [31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
# The player's health randomly decreases 2 times during the month.
shuffle = True
days_picked = []


# beginning: user is asked their name.
def get_name():
    user_name = input("What is your name?")
    print("-" * 25 + "\nMarch 1st - New York City\n" + "-" * 25)
    print("Hello,", user_name + "!")
    # intro
    print("You will be traveling through the Oregon Trail!")
    print("Your goal is to travel across 2000 miles from New York City to Oregon by a covered wagon before Dec 31st.")
    print("However, the trail is arduous. Each day costs you food and health.")
    print("You can hunt and rest, but you have to get there before winter!")
    print("You may begin your journey...\n")
    return user_name


# Each turn, the player asked what action choose: travel, rest, hunt, status, help, quit
# Create a function select_action which uses a while loop to call add_day function
def select_action(user_name):
    if distance == 0:
        print("Congratulations!\nYou reached your destination, Oregon!")
    else:
        # Game ends if food runs out, days run out, or health runs out
        while food > 0 ^ current_month < 13 and current_day != 31 ^ health > 0:
            global days_used
            select = input("What do you want to do, " + user_name + "?")
            days_used = 0
            if select == "help":
                help_command()
            elif select == "status":
                status()
            elif select == "travel":
                travel()
            elif select == "rest":
                rest()
            elif select == "hunt":
                hunt()
            elif select == "quit":
                quit()
            else:
                print("That is not an option...")
                select_action(user_name)
            add_day(days_used)
        else:
            print("GAME OVER!!!")
            if food <= 0:
                print("You ran out of food.")
            elif current_month >= 12:
                print("You failed to reach your destination by December 31.")
            elif health <= 0:
                print("Your health reached to 0.")


# help: lists all the commands.
def help_command():
    print("-" * 8, "OPTION MENU", "-" * 7)
    print(" " * 10, "travel\n", " " * 10, "rest\n", " " * 10, "hunt\n", " " * 9, "status")
    print(" " * 11, "help\n", " " * 10, "quit")
    print("-" * 28)
# status: lists food, health, distance traveled, and day.


def status():
    print("-" * 10, "STATUS", "-" * 10)
    print("Date:", current_month, "/", current_day)
    print("Food:", food, "lbs\nHealth:", health, "\nDistance:", distance, "miles\n" + "-" * 28)
# travel: moves you randomly between 30-60 miles and takes 3-7 days (random).
# Make the rate of food consumption be a function of activity SO travelling is usual 51 lb


def travel():
    global distance
    global days_used
    global distance_traveled
    global food
    distance_traveled = random.randint(30, 60)
    distance = distance - distance_traveled
    days_used += random.randint(3, 7)
    print("-" * 8, "TRAVEL LOG", "-" * 8)
    print("Days travelled:", days_used, "days\nDistance:", distance_traveled, "miles")
    print("-" * 28)
    # The player eats 5lbs of food a day
    food -= days_used * 51
# rest: increases health 1 level (up to 5 maximum) and takes 2-5 days (random).
# if a player rest they take up less food.


def rest():
    global health
    global food
    global days_used
    days_used += random.randint(2, 5)
    print("-" * 8, "TRAVEL LOG", "-" * 8)
    print("Days rested:", days_used)
    food -= days_used * 31
    if health < 5:
        health += 1
        print("Your health increased by 1")
    else:
        print("Maximum health reached")
    print("-" * 28)


# hunt: adds 100 lbs of food and takes 2-5 days (random).
# if a player hunts for a turn they take up more food
def hunt():
    global food
    global days_used
    food += 100
    days_used += random.randint(2, 5)
    print("-" * 8, "TRAVEL LOG", "-" * 8)
    print("Days hunted:", days_used, "days.\nFood collected: 100 lbs")
    print("-" * 28)
    food -= days_used * 71


# randomly chooses two dates when health is decreased
def shuffle_health():
    global shuffle
    a = random.randint(1, 30)
    days_picked.append(a)
    b = random.randint(a + 1, 30)
    days_picked.append(b)
    shuffle = False


# Create a function add_day which updates the day
# player eats each day
def add_day(days):
    global current_day
    global current_month
    global health
    global shuffle
    # updates the day
    check_day = current_day + days
    if days_in_months[current_month - 1] == 31 and check_day > 31:
        days = check_day - 31
        current_day = 0
        current_day += days
        current_month += 1
        shuffle = True
    elif days_in_months[current_month - 1] == 30 and check_day > 30:
        days = check_day - 30
        current_day = 0
        current_day += days
        current_month += 1
        shuffle = True
    else:
        current_day += days
    # health decrease randomly 2 levels
    # two dates are chosen if the list is empty and boolean is true
    if not days_picked and shuffle:
        shuffle_health()
    # when boolean is false
    if not shuffle:
        # keeps from checking when list is empty
        if not days_picked:
            print(end='')
        elif current_day > days_picked[0]:
            days_picked.remove(days_picked[0])
            health -= 2
            print("Your health suddenly decreased by two.")
            # rechecked for second date in case second date is near first and gets skipped
            if not days_picked:
                print(end='')
            elif current_day >= days_picked[0]:
                health -= 2
                print("Your health suddenly decreased by two again")


def main():
    select_action(get_name())


main()
