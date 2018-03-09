def happy():
    print("Happy happy birthday")


def wishes():
    print("May all your dreams come true")


def happy_birthday(person):
    print("from all of us to ", person + ".")


def main():
    user_name = input("Enter the Birthday person's name: \n")
    for n in range(1, 5):
        if n == 1 or n == 3:
            happy()
        elif n == 2:
            wishes()
        elif n == 4:
            happy_birthday(user_name)


main()