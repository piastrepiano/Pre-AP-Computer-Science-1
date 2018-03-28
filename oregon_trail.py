"""
    Player starts in NYC on 03/01 with
                                2,000 miles
                                500lbs food (The player eats 5lbs of food a day.)
                                5 health (The player's health randomly decreases 2 times during the month.)
            must get to Oregon by 12/31
        # The player's health randomly decreases 2 times during the month.
        percent = random.randint(1, 100)
        # 2 days in a month around 6%
        if percent <= 6:
            health -= 2
    Game ends if food runs out, days run out, or health runs out
"""
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


# beginning: user is asked their name.
def get_name():
    user_name = input("What is your name?")
    print("March 1st - New York City\n" + "-" * 25)
    print("Hello,", user_name + "!")
    # intro
    print("You will be traveling through the Oregon Trail!")
    print("Your goal is to travel from New York City to Oregon(2000 miles) by Dec 31st. However, the trail is arduous.")
    print("Each day costs you food and health. You can hunt and rest, but you have to get there before winter!")
    print("You may begin your journey...\n")


# Each turn, the player asked what action choose: travel, rest, hunt, status, help, quit
# Create a function select_action which uses a while loop to call add_day function
def select_action():
    # Game ends if food runs out, days run out, or health runs out
    while food > 0 or (current_month != 12 and current_day != 31) or health > 0:
        global days_used
        select = input("What do you want to do?")
        days_used = 0
        if select == "travel":
            travel()
        elif select == "rest":
            rest()
        elif select == "hunt":
            hunt()
        elif select == "status":
            status()
        elif select == "help":
            help_command()
        elif select == "quit":
            quit()
        else:
            print("That is not an option...")
            select_action()
        add_day(days_used)


# help: lists all the commands.
def help_command():
    print("Your options are to 'travel', 'rest', 'hunt', check your 'status', 'help', and 'quit'.")


# status: lists food, health, distance traveled, and day.
def status():
    print("-" * 10, "STATUS:", "-" * 10)
    print("Day:", current_month, "/", current_day)
    print("Food:", food, "lbs\nHealth:", health, "\nDistance Traveled:", distance, "miles\n" + "-" * 29)


# travel: moves you randomly between 30-60 miles and takes 3-7 days (random).
def travel():
    global distance
    global days_used
    global distance_traveled
    distance_traveled = random.randint(30, 60)
    distance = distance - distance_traveled
    days_used += random.randint(3, 7)
    print("You have travelled", distance_traveled, "miles for", days_used, "days")


# rest: increases health 1 level (up to 5 maximum) and takes 2-5 days (random).
def rest():
    global health
    global days_used
    if health < 5:
        health += 1
        days_used += random.randint(2, 5)
        print("You rested for", days_used, "days. \nYour health has increased by 1 level.")
    else:
        print("You are at maximum health.")


# hunt: adds 100 lbs of food and takes 2-5 days (random).
def hunt():
    global food
    global days_used
    food += 100
    days_used += random.randint(2, 5)
    print("You went hunting for", days_used, "days.\n100 lbs of food has been collected.")


# Create a function add_day which updates the day
# player eats each day
def add_day(days):
    global current_day
    global current_month
    global food
    global health
    # updates the day
    check_day = current_day + days
    if days_in_months[current_month - 1] == 31 and check_day > 31:
        days = check_day - 31
        current_day = 0
        current_day += days
        current_month += 1
    elif days_in_months[current_month - 1] == 30 and check_day > 30:
        days = check_day - 30
        current_day = 0
        current_day += days
        current_month += 1
    else:
        current_day += days
    # The player eats 5lbs of food a day
    food -= days * 51


def main():
    get_name()
    select_action()


main()
