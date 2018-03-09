a = int(input("How many skittles are there in the party?"))
b = int(input("Is it a weekday or weekend?(print 0 weekday or 1 for weekend)"))


def skittles_party(a, b):
    # weekday condition
    if b == 0:
        if 40 <= a <= 60:
            print("true")
        else:
            print("false")
    elif b == 1:
        if a >= 40:
            print("true")
        else:
            print("false")


skittles_party(a, b)
