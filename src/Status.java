import java.util.Scanner;

public class Status {
    private int counter;
    private double health;
    private double partner_health;
    private double boss_health;

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
        partner_health = 5;
        boss_health = 10;
    }

    //counter
    public int getCounter(){
        return counter;
    }
    public void addCounter(){
        counter += 1;
    }
    public void recount(){
        counter = 0;
    }

    //players health
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

    //partner's health
    public double getPartner_health(){
        return partner_health;
    }
    public void share_health(){
        partner_health -= 0.5;
    }
    public void full_health(){
        partner_health -= 1;
    }
    public void restart(){
        partner_health = 3;
    }

    public boolean partner_alive(){
        if(getPartner_health() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    //boss health
    public double getBoss_health(){
        return boss_health;
    }
    public void orb_damage(){
        boss_health -= 2;
    }
    public void surprise_damage(){
        boss_health -= 4;
    }
    public void partner_damage(){
        boss_health -= 1;
    }
    public void dizzy_damage(){
        boss_health -= 0.5;
    }


    public void print_status(){
        Scanner console = new Scanner(System.in);
        System.out.print("\n\nYour health: " + getHealth());
        System.out.print("\nPartner's health: " + getPartner_health());
        System.out.print("\nBoss health: " + getBoss_health());
        System.out.print("\nABILITIES UNLOCKED");
        if(water){
            System.out.print("\nwater");
        }
        if(wind){
            System.out.print("\nwind");
        }
        if(poison){
            System.out.print("\npoison");
        }
        if(earth){
            System.out.print("\nearth");
        }
        if(psychic){
            System.out.print("\npsychic");
        }
        if(fire){
            System.out.print("\nfire");
        }
        else if(!water & !wind & !poison & !earth & !psychic & !fire){
            System.out.print("\n     N/A");
        }
        console.nextLine();
    }

    public void print_health(){
        System.out.print("\n\nYour health: " + getHealth());
        System.out.print("\nPartner's health: " + getPartner_health());
        System.out.print("\nBoss health: " + getBoss_health());
    }
}