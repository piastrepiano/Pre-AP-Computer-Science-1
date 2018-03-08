"""
    Start with a given shuffled deck variable
    Have a function player_turn
        removes a card from the deck
        prints "user drew card x", and returns the value
        input: player_name as string, deck as list
        returns: integer
        function compare_scores takes two integers representing the cards drawn and compares the card values.
        Jacks will be represented as 11
        Queens will be represented as 12
        Kings will be represented as 13
        Aces will be represented as 14
        suit does not matter
        while loop keeps game running until no cards in deck.
        tie, there is "war"
            Take the next two cards
            whoever wins that gets all four cards (including the previous tied cards)
            Repeat if there's a tie again
        Keep track of the score.
        won the most number of cards wins.
        Declare the name of the winner and final score at the end of the game.
"""
import random
cards = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
use = 2


def get_name():
    p1 = input("What is player 1's name?")
    p2 = input("What is player 2's name?")
    print("Player 1 name: " + p1)
    print("Player 2 name: " + p2)
    return p1, p2


def player_turn():
    global use
    while use <= 52:
        a = random.choice(cards)
        b = random.choice(cards)
        print(p1, "drew card", a)
        print(p2, "drew card", b)
        use += 2
        return a, b


def compare_scores():
    if a < b:
        print(p2, "has a higher card")
    else:
        print(p1, "has a higher card")


def main():
    get_name()
    player_turn()
    compare_scores()


main()
