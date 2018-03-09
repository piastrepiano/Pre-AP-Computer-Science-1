"""
     Create a function that randomly picks 5 cards from a deck.
     The cards can repeat.
     Instead of creating a string for each card useful to use two lists and pick randomly from both the lists.
     Write out the contract for this function:
"""
import random
number = ['A', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K']
suit = ['Spades', 'Clubs', 'Diamonds', 'Hearts']
count = 0


def random_number_and_suit():
    print(random.choice(number))
    print(random.choice(suit))


def counter():
    global count
    count += 1


def main():
    counter()
    while count <= 5:
        random_number_and_suit()
        counter()


main()
