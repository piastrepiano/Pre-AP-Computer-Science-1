import java.util.Random;
import java.util.Scanner;

public class Stage1 {
    private String direction;
    public boolean bat = false;
    public boolean thorn = false;

    //determines whether there's a pit to start over, a bat or thorns to decrease health, or continue without any damage

    public boolean trap_or_safe() {
        Random number = new Random();
        Integer num = number.nextInt(100) + 1;

        //30 % pit(start over)
        if (num <= 30) {
            System.out.println("\nOh no! You fell in a pit back to where you started!");
            //start over
            return false;
        }
        else if (num <= 60) {
            //30% harm from either a bat or thorns
            Random choice = new Random();
            Integer bot = choice.nextInt(2) + 1;

            //15% bats(harm health(-.5))
            if(bot.equals(1)) {
                System.out.println("\nA bat attacks you.\nHealth decreases by 0.5.");
                bat = true;
            }
            //15% thorns(harm health (-.25))
            else {
                System.out.println("\nYou got pricked by a thorn bush next to you.\nHealth decreases by 0.25.");
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
        direction = go.nextLine();

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
