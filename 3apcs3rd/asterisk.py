def main():
    n = 0
    for x in range(0, 5):
        n = n + 1
        for a in range(0, n - 1):
            print('*', end='')
        print()
    for b in range(0, 5):
        n = n - 1
        for d in range(0, n + 1):
            print('*', end='')
        print()
    print('')


main()
