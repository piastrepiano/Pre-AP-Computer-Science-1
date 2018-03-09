def main():
    keep_going = True
    prize1 = "\ncar"
    prize2 = "\nSamsung Galaxy S8 Edge"
    prize3 = "\n$10k"
    prize4 = "\nSamsung 65 x 64.5 LED Curved 2160p Smart 4K Ultra HD TV"
    prize5 = "\nInsignia Bluetooth Stereo Speaker"
    prize6 = "\n$100 Amazon Giftcard"
    prize7 = "\nBlue Fujifilm instax mini 8 Instant Film Camera"
    prize8 = "\ntrip to Hawaii"
    prize9 = "\npiano"
    prize10 = "\nUSB clock fan"
    while keep_going:
        usr_play = input("Play or Quit the game?")
        if usr_play == "quit":
            keep_going = False
        else:
            print("There are 10 doors with prizes inside.")
            usr_input = float(input("Pick a number of a door between 1 and 10 to see what prize lays behind it..."))
            if usr_input == 1:
                print(prize1)
            elif usr_input == 2:
                print(prize2)
            elif usr_input == 3:
                print(prize3)
            elif usr_input == 4:
                print(prize4)
            elif usr_input == 5:
                print(prize5)
            elif usr_input == 6:
                print(prize6)
            elif usr_input == 7:
                print(prize7)
            elif usr_input == 8:
                print(prize8)
            elif usr_input == 9:
                print(prize9)
            elif usr_input == 10:
                print(prize10)
            else:
                print("Sorry, you don't get to win anything.")


main()
