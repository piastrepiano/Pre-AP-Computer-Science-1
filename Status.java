import java.util.Scanner;

public class Status {
    public Scanner yn = new Scanner(System.in);
    static Stage2 coar_maze1 = new Stage2();
    private int counter;
    private double health;
    private double partner_health;

    public boolean water = false;
    public boolean wind = false;
    public boolean poison = false;
    public boolean earth = false;
    public boolean psychic = false;
    public boolean fire = false;
    public boolean healing = false;

    public boolean dragon = false;
    public boolean poachers = false;
    public boolean yeti = false;
    public boolean phoenix = false;
    public boolean fox = false;


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
    public void half(){
        health -= 0.5;
    }
    public void fourth(){
        health -= 0.25;
    }
    public void minus_one(){
        health -= 1;
    }
    public void heal(){
        health += 1;
    }

    public double getPartner_health(){
        return partner_health;
    }
    public void share_health(){
        partner_health -= 0.5;
    }
    public void full_health(){
        partner_health -= 1;
    }

    public void monster(){
        if(dragon & water){
            System.out.print("You used your WATER orb to wash away the dragon.");
            fire = false;
            dragon = false;
        }
        else if(poachers & poison){
            System.out.print("You used your POISON orb to kill the poacher.");
            poison = false;
            poachers = false;
        }
        else if(yeti & fire){
            System.out.print("You used your FIRE orb to burn the yeti.");
            fire = false;
            yeti = false;
        }
        else if(phoenix & water & wind){
            System.out.print("You used your WATER & WIND orb to wash and blow the phoenix away.");
            water = false;
            wind = false;
            phoenix = false;
        }
        else if(fox & earth & psychic){
            System.out.print("You used your EARTH  orb. The nine tailed fox gets distracted by the earthquake." +
                    "\nYou then used your PSYCHIC orb. Your enemy can't use its powers anymore and runs away.");
            earth = false;
            psychic = false;
            fox = false;
        }
        else {
            System.out.print("You don't have enough orbs to defeat the monster. You must run past it.");
            System.out.println("The monster attacks you briefly as you run away.");

            if (coar_maze1.partner) {
                System.out.print("\nYour and your partner's health each decreased by 0.5");
                half();
                share_health();
            } else {
                System.out.println("Your health decreased by one.");
                minus_one();
            }
        }
    }

    public void fight() {
        System.out.println("Do you want to fight it?");
        String fight_or_run = yn.nextLine();

        if (fight_or_run.equals("yes")) {
            monster();
        }
        else if (fight_or_run.equals("no")){
            System.out.print("You run past the monster.");

            if(coar_maze1.partner) {
                System.out.print("\n" + (char) 34 + "I'll fight in your stead! Go on ahead!" + (char) 34);
                yn.nextLine();
                System.out.print("You run away safely while you partner fights the monster.");
                System.out.println("Your partner's health decreased by one.");
                full_health();
            }
            else{
                System.out.print("The monster attacks you briefly as you run away.\nYour health decreased by one.");
                minus_one();
            }
        }
        else{
            System.out.print("That doesn't answer the question.");
            fight();
        }
    }
}