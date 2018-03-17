"""
    Start with a given shuffled deck variable
        Keep track of the score.
        won the most number of cards wins.
        Declare the name of the winner and final score at the end of the game.
"""
import random
names = []
deck = [2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14]
p1_win = 0
p2_win = 0
cards = 0


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
    print("Player 1 name: " + names[0])
    print("Player 2 name: " + names[1])


def compare_scores(a, b, p1, p2, uses):
  global use
  use = uses
  if a < b:
    global p2_win
    p2_win += use
    use = 0
    print(p2, "has a higher card\n" + p2, "has", p2_win, "cards\n")
  elif b < a:
    global p1_win
    p1_win += use
    use = 0
    print(p1, "has a higher card\n" + p1, "has", p1_win, "cards\n")
  else:
    print("War")
  
  
def player_turn(p1, p2, uses):
  get_name(3)
  global cards
  cards = 0
  global use
  use = uses
  while cards < 52:
    a = deck.pop(random.randint(0,len(deck)-1))
    b = deck.pop(random.randint(0,len(deck)-1))
    print(p1, "drew card", a)
    print(p2, "drew card", b)
    cards += 2
    use += 2
    compare_scores(a, b, p1, p2, use)
  else:
    print("SCORES:")
    print(p1, ":", p1_win, "cards")
    print(p2, ":", p2_win, "cards")


def main():
  player_turn(get_name(1), get_name(2), 0)


main()
