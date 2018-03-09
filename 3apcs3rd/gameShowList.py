def main():
    prize1 = 'car'
    prize2 = 'Samsung Galaxy S8 Edge'
    prize3 = '$10k'
    prize4 = 'Samsung 65 x 64.5 LED Curved 2160p Smart 4K Ultra HD TV'
    prize5 = 'Ingisnia Bluetooth Steoreo Speaker'
    prize6 = '$100 Amazon Giftcard'
    prize7 = 'Blue Fujifilm Instax mini 8 instant Film Camera'
    prize8 = 'Trip to Hawaii'
    prize9 = 'piano'
    prize10 = 'USB clock fan'
    a = [prize1, prize2, prize3, prize4, prize5, prize6, prize7, prize8, prize9, prize10]
    print("There are 10 doors with prizes inside.")
    usr_input = float(input("Pick a number of a door between 1 and 10 to see what prize lays behind it..."))
    if usr_input == 1:
        print(a[0])
    elif usr_input == 2:
        print(a[1])
    elif usr_input == 3:
        print(a[2])
    elif usr_input == 4:
        print(a[3])
    elif usr_input == 5:
        print(a[4])
    elif usr_input == 6:
        print(a[5])
    elif usr_input == 7:
        print(a[6])
    elif usr_input == 8:
        print(a[7])
    elif usr_input == 9:
        print(a[8])
    elif usr_input == 10:
        print(a[9])
    else:
        print("Sorry, you don't get to win anything.")
main()