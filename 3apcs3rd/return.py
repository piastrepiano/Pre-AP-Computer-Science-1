import random
# inputs:  x (int), y (int)
# outputs: int
# 50% returns sum of x and y, 50% returns product of x and y


def mystery_function(x, y):
    random_number = random.randint(0, 1)
    if random_number > 0:
        z = x + y
    else:
        z = x * y
    print(z)
    return ''


mystery_function(1, 2)
