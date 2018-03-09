def main():
    file_name = input("What file are the numbers in?")
    infile = open(file_name, 'r')
    numbers = []
    for line in infile:
        words = line.split()
        for word in words:
            numbers.append(float(word))
    numbers.sort()
    midpoint = len(numbers) // 2
    print("The median is", end=" ")
    if len(numbers) % 2 == 1:
        print(numbers[midpoint])
    else:
        print((numbers[midpoint] + numbers[midpoint - 1]) / 2)
main()
