/*
    NAME: Kim Luong
    ASSIGNMENT: Letter At A Time 100 point version
    WHAT SHOULD YOU DO ON YOUR OWN
    1. The for loop is defined so that it repeats as long as i < message.length().
       Try changing it to <=. What happens? Answer in a comment, then change it back.
            ANSWER: There is an error because String index will be 5 which is out of range.
    2. If a string variable contains the value "box", what is its length()?
       What is the position of the last character (the 'x')?
            ANSWER: The position of the last character of "box" will be 2.
    3. So, why does the for loop repeat as long as i < message.length() instead of i <= message.length()?
            ANSWER: String index will be out of range since the position starts at 0 not 1.
    4. Currently the code prints out the number of 'a's in the message.
       Change it so that it prints out the number of vowels (a A e E i I o O u U).
            CODED BELOW
 */
import java.util.Scanner;

public class letter_at_a_time {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("What is your message? ");
        String message = kb.nextLine();

        // message length
        System.out.println("\nYour message is " + message.length() + " characters long.");

        // first and last character position
        System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
        int lastpos = message.length() - 1;
        System.out.println("The last character is at position " + lastpos + " and is '" +
                message.charAt(lastpos) + "'.");
        System.out.println("\nHere are all the characters, one at a time:\n");

        // print each character and position it's in
        for ( int i=0; i<message.length(); i++ )
        {
            System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
        }

        int vowel_count = 0;

        // find how many vowels each message contains (a A e E i I o O u U)
        for ( int i=0; i<message.length(); i++ )
        {
            char letter = message.charAt(i);
            if ( letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I'
                    || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U')
            {
                vowel_count++;
            }
        }

        System.out.println("\nYour message contains the vowels " + vowel_count + " times. Isn't that interesting?");
    }
}