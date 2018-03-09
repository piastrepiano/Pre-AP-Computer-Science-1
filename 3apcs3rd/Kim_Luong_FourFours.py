def main():
    concat80()
    concat90()
    concat100()


def concat80():
    print("Zero is", (4 ** 4) % (4 ** 4))
    print("One is", 4 / 4)
    print("Two is", 4 * 4 / (4 + 4))
    print("Three is", 4 - 4 ** (4 - 4))
    print("Four is", (4 * 4) // 4)


def concat90():
    print("Wow!" + '\n' + "This is on a new line!")


def concat100():
    print("Five is", 4+4**(4-4))
    print("Six is", 4 * .4 + 4.4)
    print("Seven is", 4 + 4 - (4//4))
    print("Eight is", 4*4-(4+4))
    print("Nine is", 4 + 4 + 4 / 4)
    print("Ten is", (44 - 4) / 4)


main()
