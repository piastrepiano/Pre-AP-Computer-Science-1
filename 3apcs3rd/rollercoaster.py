def main():
    print("Can you ride the roller coaster?")
    print("How old are you?")
    usr_age = float(input())
    print("How tall are you? (answer in inches)")
    usr_height = float(input())
    print("How many quarters do you have?")
    usr_cost = float(input())
    print("Do you have a frequent riders pass?")
    usr_pass = str(input())
    can_ride = (usr_age >= 18 or usr_height >= 50) and (usr_cost >= 4 or (usr_cost >= 2 and usr_pass == 'yes'))
    print(can_ride)


main()
