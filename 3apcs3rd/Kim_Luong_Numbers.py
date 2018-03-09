print(2 + 2)


def main():
    global sum
    sum = add(4, 7)
    print(sum)
    print(add(5,8))
    sub()
    multiply()
    divide()
    remainder()
    quote()
    power()
    concat()


def add(num1, num2):
    return(num1 + num2)


def sub():
    num1 = 25
    num2 = 10
    print(num1 - num2)


def multiply():
    num1 = 35
    num2 = 15
    print(num1 * num2)


def divide():
    num1 = 100
    num2 = 20
    print(num1 / num2)


def remainder():
    num1 = 78
    num2 = 7
    print(num1 % num2)


def quote():
    num1 = 88
    num2 = 26
    print(num1 // num2)


def power():
    num1 = 12
    num2 = 4
    print(num1 ** num2)


def concat():
    print("1" + " " + "2")
    num1 = 2
    num2 = 3
    print(str(num1) + " " + str(num2))
    print(num1+num2)
    word1 = "there"
    word2 = "button"
    print(word1 + " " + word2)

    print("Zero is", 33-33)


main()
