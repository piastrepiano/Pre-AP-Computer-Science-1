"""
    Start with a given shuffled deck variable
    Have a function player_turn
        removes a card from the deck
        prints "user drew card x", and returns the value
        input: player_name as string, deck as list
        returns: integer
        function compare_scores takes two integers representing the cards drawn and compares the card values.
        Jacks represented as 11, Queens represented as 12, Kings represented as 13, Aces represented as 14
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

names = []
score1 = 0
score2 = 0
cards = 0


""" shuffled_deck: will return a shuffled deck to the user
    input:
    output: a list representing a shuffled deck"""


def shuffled_deck():
    basic_deck = list(range(2, 15)) * 4
    random.shuffle(basic_deck)
    return basic_deck


deck = shuffled_deck()


def get_name(pick):
    if pick == 1:
        p1 = input("What is player 1's name?")
        names.append(p1)
        return p1
    elif pick == 2:
        p2 = input("What is player 2's name?")
        names.append(p2)
        return p2
    elif pick == 3:
        print("\nPlayer 1 name: " + names[0])
        print("Player 2 name: " + names[1], "\n")


def compare_scores(a, b, p1, p2, uses):
    global use
    global score1
    global score2
    use = uses
    if a < b:
        score2 += use
        use = 0
        print(p2, "has a higher card")
        scores(p1, p2, score1, score2)
    elif b < a:
        score1 += use
        use = 0
        print(p1, "has a higher card")
        scores(p1, p2, score1, score2)
    else:
        print("I...")
        print("Declare...")
        print("War!!!")


def scores(p1, p2, p1w, p2w):
    print(p1, ":", p1w, "cards")
    print(p2, ":", p2w, "cards\n")


def winner(p1, p2, p1w, p2w):
    if p1w > p2w:
        print("winner:", p1)
    elif score2 > score1:
        print("winner:", p2)
    else:
        print("It's a tie...\nthere is no winner...")


""" name: player_turn
    purpose: takes in a player name and draws/removes a card from the deck, prints "user drew card x"
       , and returns the value
    input: player_name as string, deck as list
    returns: integer"""


def player_turn(p1, p2, uses):
    get_name(3)
    global cards
    cards = 0
    global use
    use = uses
    while cards < 52:
        a = deck.pop(random.randint(0, len(deck) - 1))
        b = deck.pop(random.randint(0, len(deck) - 1))
        print(p1, "drew card", a)
        print(p2, "drew card", b)
        cards += 2
        use += 2
        compare_scores(a, b, p1, p2, use)
    else:
        print("FINAL SCORE:")
        scores(p1, p2, score1, score2)
        winner(p1, p2, score1, score2)


def main():
    shuffled_deck()
    player_turn(get_name(1), get_name(2), 0)


main()
