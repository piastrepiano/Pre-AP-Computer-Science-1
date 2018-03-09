def main():
    print("Do you want to use Integer mode or Float mode?")
    usr_resp = str(input())
    if usr_resp == 'integer':
        print("Please enter a number...")
        usr_dividend = float(input())
        (type(usr_dividend))
        print(str(int(usr_dividend)) + " / 2 = " + str(int(ans(usr_dividend))))
    elif usr_resp == 'float':
        print("Please enter a number...")
        usr_dividend = float(input())
        (type(usr_dividend))
        print(str(usr_dividend) + " / 2.0 = " + str(ans(usr_dividend)))
    else:
        print("\nUnavailable Mode!")


# ans = dividend / 2
def ans(dividend):
    a = dividend / 2
    return a


main()
