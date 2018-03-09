"""
    Store all of the 8-ball's possible responses (shown below) in a list.
    Have the program prompt the user to ask the magic 8-ball a question
    return and print a random response.
        outlook is good
        ask again later
        yes
        no
        most likely no
        most likely yes
        maybe
        outlook is not good
"""
import random
# response
r = ["outlook is good", "ask again later", "yes", "no", "most likely no", "most likely yes", "maybe",
     "outlook is not good"]


def main():
    input("Ask the magic 8 ball a question...")
    c = random.randint(0, len(r) - 1)
    print(r[c])


main()
