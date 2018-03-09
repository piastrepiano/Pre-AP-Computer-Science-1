global usrResp


def main():
    print("Please enter a value for mass:\n")
    usrMass = float(input())
    print(type(usrMass))
    print("\nPlease enter a value for acceleration:\n")
    usrAccel = float(input())
    print("The force is equal to: " + str(force(usrMass, usrAccel)))


# Force: f=ma
def force(mass, accel):
    F = mass * accel
    return (F)


a = input("What is your name? ")
# a = "cats and dogs"
# meow
print("Hello there, " + a)


a = "this sentence should go second"
b = "this sentence should go first."
# your code starts here

# your code ends here
print(a)
print(b)




main()
