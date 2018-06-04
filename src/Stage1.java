import java.util.Random;
import java.util.Scanner;

public class Stage1 extends text_interface{
    boolean bat = false;
    boolean thorn = false;

    public static void intro(){
        Scanner console = new Scanner(System.in);
        System.out.print("You are stuck in an abandoned house...");
        //abandon house graphics
        console.nextLine();
        System.out.print("There are no windows and the room you're in is very dark. Trying to find the door, you suddenly fall into complete darkness...");
        console.nextLine();
        System.out.print("THUD!!!");
        console.nextLine();
        System.out.print("You open your eyes and squint at the sudden brightness. There, a floating orb shines brightly...");
        console.nextLine();
        System.out.print("A mirror appears on your right. You look at it and see a dragon standing before you...");
        console.nextLine();
        System.out.print("Shocked, you realize that YOU are the DRAGON!\n");
        console.nextLine();
        System.out.print((char)34 + "The goal for you, I'll recite in verse:");
        System.out.println("\nThrough twist and turns, find the key and lift the curse.");
        System.out.println("If you wish to leave this house unharmed, you must save Eliteless!!!" + (char)34);
        console.nextLine();
        System.out.print("The ground shakes and the mysterious orb explodes");
        console.nextLine();
    }

    //determines whether there's a pit to start over, a bat or thorns to decrease health, or continue without any damage
    public boolean trap_or_safe() {
        Random number = new Random();
        Integer num = number.nextInt(100) + 1;

        //30 % pit(start over)
        if (num <= 30) {
            System.out.println("Oh no! You fell in a pit back to where you started!");
            //start over
            return false;
        }
        else if (num >= 31 & num <= 60) {
            //30% harm from either a bat or thorns
            Random choice = new Random();
            Integer bot = choice.nextInt(2) + 1;

            //15% bats(harm health(-.5))
            if(bot.equals(1)) {
                System.out.println("A bat attacks you.\nHealth decreases by 0.5.");
                bat = true;
            }
            //15% thorns(harm health (-.25))
            else {
                System.out.println("You got pricked by a thorn bush next to you.\nHealth decreases by 0.25.");
                thorn = true;
            }
            //counter +1
            return true;
        }
        else {
            //40% safe continue
            //counter +1
            return true;
        }
    }

    public void directions() {
        Scanner go = new Scanner(System.in);
        System.out.print("\nWhat direction do you wish to go? (left, right, straight)");
        String direction = go.nextLine();

        if (direction.equals("left")) {
            System.out.println("You turned left...");
        }
        else if (direction.equals("right")) {
            System.out.println("You turned right...");
        }
        else if (direction.equals("straight")) {
            System.out.println("You continued walking straight...");
        }
        else {
            System.out.println("That is not a direction. Try again...");
            directions();
        }
    }
}