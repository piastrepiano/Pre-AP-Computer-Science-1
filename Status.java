import java.util.Scanner;

public class Status {
    public Scanner yn = new Scanner(System.in);
    private int counter;
    private double health;

    public boolean water = false;
    public boolean wind = false;
    public boolean poison = false;
    public boolean earth = false;
    public boolean psychic = false;
    public boolean fire = false;


    public Status() {
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
        health -= 0.5;
    }
    public void thorn(){
        health -= 0.25;
    }
    public void monster_maze(){
        health -= 1;
    }
    public void heal(){
        health += 1;
    }

    public void healing_orb(){
        //wind
        System.out.print("\nYou found a WIND orb! Do you want to collect it?");

        String grab = yn.nextLine();
        if(grab.equals("yes")){
            System.out.print("\nYou picked up the WIND orb. You've unlocked your wind ability!");
            wind = true;
        }
        else if(grab.equals("no")){
            System.out.print("\nYou didn't pick up the WIND orb.");
        }
        else{
            System.out.print("\nYou ignored the orbs existence.");
        }
    }

    public void fight() {
        System.out.print("\nDo you want to fight it?");
        String fight_or_run = yn.nextLine();

        if (fight_or_run.equals("yes")) {
            if (water ^ fire ^ psychic ^ wind ^ poison ^ earth) {
                System.out.print("You used one of your orbs to defeat the monster.");
            }
            else{
                System.out.print("You don't have enough orbs to defeat the monster. You must run past it.");
                monster_maze();
                System.out.print("The monster attacks you briefly as you run away.\nYour health decreased by one.");
            }
        }
        else if (fight_or_run.equals("no")){
            System.out.print("You run past the monster.");
            monster_maze();
            System.out.print("The monster attacks you briefly as you run away.\nYour health decreased by one.");
        }
    }

}
