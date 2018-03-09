def main():
    keep_going = True
    import random
    print('Hello! What is your name?')
    my_name = input()
    number = random.randint(1, 9)
    print('Well, ' + my_name + ', I am thinking of a number between 1 and 9.')
    while keep_going:
        print('Take a guess.')
        guess = input()
        guess = int(guess)
        if guess == number:
            print("Well guessed,", my_name, "!")
            keep_going = False
        if guess < number:
            print('Your guess is too low.')
        elif guess > number:
            print('Your guess is too high.')


main()
