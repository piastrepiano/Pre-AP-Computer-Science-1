def main():
    file_name = input("What file are the numbers in?")
    infile = open(file_name, 'r')
    n = False
    process = True
    # reads first number in file
    line = infile.readline()
    while line != "":
        f = line
        c = line
        if line.__contains__("n"):
            n = True
            process = False
        if line.__contains__("m"):
            n = False
            process = False
        if n and process:
            c = (5 / 9) * (eval(f) - 32)
            print(f, "°F is", c, "in Celsius")
        if not n and process:
            f = eval(c) * 9 / 5 + 32
            print(c, "°C is", f, "in Fahrenheit")
        process = True
        line = infile.readline()


main()
