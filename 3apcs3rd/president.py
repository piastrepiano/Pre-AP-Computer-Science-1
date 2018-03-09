def main():
    president()
    not_president()


def president():
    print("I CAN BE A PRESIDENT!")
    print("How old are you?")
    usr_age = float(input())
    print("\nHow many years have you been a resident in the United States?")
    usr_resident = float(input())
    print("\nAre you a natural born citizen of the United States?")
    usr_citizen = str(input())
    can_be_president = usr_age >= 35 and usr_resident >= 14 and usr_citizen == 'yes'
    print(can_be_president)


def not_president():
    print("I CAN'T BE A PRESIDENT!")
    print("How old are you?")
    usr_age = float(input())
    print("\nHow many years have you been a resident in the United States?")
    usr_resident = float(input())
    print("\nAre you a natural born citizen of the United States?")
    usr_citizen = str(input())
    can_be_president = usr_age >= 35 and usr_resident >= 14 and usr_citizen == 'yes'
    print(not can_be_president)


main()
