board = [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(board[0], board[1], board[2])
print(board[3], board[4], board[5])
print(board[6], board[7], board[8])
print()
turn = 0


def choose_number():
    while True:
        a = input()
        try:
            a = int(a)
            a -= 1
            if a in range(0, 9):
                return a
            else:
                print("\nThat's not a number. Try again")
                continue
        except ValueError:
            print("\nThat's not a number. Try again.")
            continue


def player():
    global turn
    while turn < 9:
        # ask to choose number
        input("Choose a number to place an X.")
        n = choose_number()
        if board[n] == "X" or board[n] == "O":
            print("\nYou can't go there. Try again")
        else:
            board[n] = "X"
            print("\n\t", board[0], "|", board[1], "|", board[2])
            print("\t", "---------")
            print("\t", board[3], "|", board[4], "|", board[5])
            print("\t", "---------")
            print("\t", board[6], "|", board[7], "|", board[8], "\n")
            print()
            turn += 1
            if turn >= 9:
                print("Game Completed")
            else:
                computer()


def computer():
    global turn
    while turn < 9:
        import random
        c = random.choice(board)
        while c == "X" or c == "O":
            c = random.choice(board)
        else:
            print("Opponents turn:  \n", c)
            c = int(c)
            c -= 1
        while board[c] == "X" or board[c] == "O":
            c = random.choice(board)
        else:
            board[c] = "O"
            print("\n\t", board[0], "|", board[1], "|", board[2])
            print("\t", "---------")
            print("\t", board[3], "|", board[4], "|", board[5])
            print("\t", "---------")
            print("\t", board[6], "|", board[7], "|", board[8], "\n")
            print()
            turn += 1
            player()


player()
