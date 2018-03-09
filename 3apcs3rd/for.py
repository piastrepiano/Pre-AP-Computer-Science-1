def main():
    for n in range(1500, 2701):
        if n % 7 == 0 and n % 5 == 0:
            print(n, "is divisible by 7 and is a multiple of 5")
        elif n % 7 == 0:
            print(n, "is divisible by 7")
        elif n % 5 == 0:
            print(n, "is a multiple of 5")
        else:
            print(n)


main()
