def main():
    global sum
    sum = add(4, 7)
    print(sum)
    global dif
    dif = sub(9, 4)
    print(dif)
    global product
    product = mul(8, 3)
    print(product)
    global ans
    ans = div(10, 5)
    print(ans)
    global remain
    remain = remainder(10, 8)
    print(remain)
    global quotient
    quotient = quote(47, 25)
    print(quotient)
    global power
    power = pow(2, 8)
    print(power)


def add(num1, num2):
    return num1 + num2


def sub(num1, num2):
    return num1 - num2


def mul(num1, num2):
    return num1 * num2


def div(num1, num2):
    return num1 / num2


def remainder(num1, num2):
    return num1 % num2


def quote(num1, num2):
    return num1 // num2


def pow(num1, num2):
    return num1 ** num2


main()
