import java.util.Random;
import java.util.Scanner;

public class Beginning_maze{
    private String direction;
    private int counter;
    private double health;

    public Beginning_maze() {
        counter = 0;
        health = 5;
    }

    public int getCounter(){
        return counter;
    }
    public void addCounter(){
        counter += 1;
    }
    public void recount(){
        counter = 0;
    }

    public double getHealth(){
        return health;
    }
    public void bat(){
        health -= 1;
    }
    public void thorn(){
        health -= 0.5;
    }

    //determines whether theres a pit to start over, a bat or thorns to decrease health, or continue without any damage

    public boolean trap_or_safe() {
        Random number = new Random();
        Integer num = number.nextInt(100) + 1;

        //30 % pit(start over)
        if (num <= 30) {
            System.out.println("Oh no! You fell in a pit back to where you started!");
            //start over
            return false;
        }
        else if (num <= 60) {
            //30% harm from either a bat or thorns
            Random choice = new Random();
            Integer bot = choice.nextInt(2) + 1;

            //15% bats(harm health(-1))
            if(bot.equals(1)) {
                System.out.println("A bat attacks you...\nHealth decreases by 1");
            }
            //15% thorns(harm health (-.5))
            else {
                System.out.println("You got pricked by a thorn bush next to you...\nHealth decreases by 0.5");
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
            System.out.print("You turned left...");
        }
        else if (direction.equals("right")) {
            System.out.print("You turned right...");
        }
        else if (direction.equals("straight")) {
            System.out.print("You continued walking straight...");
        }
        else {
            System.out.println("That is not a direction. Try again...");
            directions();
        }
    }
}
