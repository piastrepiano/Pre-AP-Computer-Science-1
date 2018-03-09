def main():
    # Create a list of 5 options of colleges.
    college = ['UT Austin', 'UTSA', 'Princeton', 'Harvard', 'San Antonio College']
    # Create a different list of five 0s, representing the user's votes so far.
    score = [0, 0, 0, 0, 0]
    # Create 4 questions. Each question should have five different answers.
    usr_tuition = input("What is your tuition range?\na) $25,000\nb) $23,000\nc) $63,000\nd) $71,000\ne) $21,000\n")
    if usr_tuition == "a":
        score[0] = score[0] + 1
    elif usr_tuition == "b":
        score[1] = score[1] + 1
    elif usr_tuition == "c":
        score[2] = score[2] + 1
    elif usr_tuition == "d":
        score[3] = score[3] + 1
    elif usr_tuition == "e":
        score[4] = score[4] + 1
    usr_rank = input("What number do you prefer?\na) 56\nb) 231\nc) 1\nd) 2\ne) 311\n")
    if usr_rank == "a":
        score[0] = score[0] + 1
    elif usr_rank == "b":
        score[1] = score[1] + 1
    elif usr_rank == "c":
        score[2] = score[2] + 1
    elif usr_rank == "d":
        score[3] = score[3] + 1
    elif usr_rank == "e":
        score[4] = score[4] + 1
    usr_color = input("What color do you prefer?\na) burnt orange\nb) blue\nc) black\nd) crimson\ne) red\n")
    if usr_color == "a":
        score[0] = score[0] + 1
    elif usr_color == "b":
        score[1] = score[1] + 1
    elif usr_color == "c":
        score[2] = score[2] + 1
    elif usr_color == "d":
        score[3] = score[3] + 1
    elif usr_color == "e":
        score[4] = score[4] + 1
    print("Where would you like to visit?")
    usr_location = input("a)Blanton Museum of Art\nb) Six Flags\nc) Morven Museum \nd) Randolph Courtyard\ne) Alamo\n")
    if usr_location == "a":
        score[0] = score[0] + 1
    elif usr_location == "b":
        score[1] = score[1] + 1
    elif usr_location == "c":
        score[2] = score[2] + 1
    elif usr_location == "d":
        score[3] = score[3] + 1
    elif usr_location == "e":
        score[4] = score[4] + 1
    # At the end print off the 5 different schools and the score the user got for each of those schools.
    print("\n" + college[0], score[0])
    print(college[1], score[1])
    print(college[2], score[2])
    print(college[3], score[3])
    print(college[4], score[4])
main()
