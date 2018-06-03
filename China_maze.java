import java.util.Random;
import java.util.Scanner;

public class China_maze {
    public Scanner yn = new Scanner(System.in);
    static Status status = new Status();

    public void china_enemies(){
        //Enemies(dragon slayer, phoenix, nine tailed fox
        Random percentage = new Random();
        Integer dpns = percentage.nextInt(100) + 1;

        if(dpns <= 40){
            Random enemy = new Random();
            Integer enemies = enemy.nextInt(3) + 1;

            if(enemies.equals(1)){
                //dragon slayer
                System.out.println("\nThere is a dragon slayer sitting on a floating chair.");
                status.dragon = true;
                status.fight();
            }
            else if(enemies.equals(2)){
                //phoenix
                System.out.println("\nThere is a phoenix flying above you.");
                status.phoenix = true;
                status.fight();
            }
            else if(enemies.equals(3)){
                //nine tail fox
                System.out.println("\nThere is a nine tail fox.");
                status.fox = true;
                status.fight();
            }
        }
        else{
            //safe
        }
    }

    public void china_orbs(){
        //orbs: fire, water, psychic, wind ; NONE
        Random percentage = new Random();
        Integer orbsC = percentage.nextInt(100) + 1;

        if(orbsC <= 10){
            fire();
        }
        else if(orbsC >= 11 & orbsC <=20){
            water();
        }
        else if(orbsC >= 21 & orbsC <= 30){
            psychic();
        }
        else if(orbsC >= 31 & orbsC <=40){
            wind();
        }
        else if(orbsC >= 41 & orbsC <= 50){
            healing_orb();
        }
        else if(orbsC >= 51 & orbsC <= 100){
            //no orbs
        }
    }

    public void fire(){
        System.out.print("\nYou found a FIRE orb! Do you want to collect it?");
        String grab = yn.nextLine();

        if(grab.equals("yes")){
            System.out.print("You picked up the FIRE orb. You've unlocked your fire ability!");
            status.fire = true;
        }
        else if(grab.equals("no")){
            System.out.print("You didn't pick up the FIRE orb.");
        }
        else{
            System.out.print("You ignored the orbs existence.");
        }
    }
    public void water(){
        System.out.print("\nYou found a WATER orb! Do you want to collect it?");

        String grab = yn.nextLine();
        if(grab.equals("yes")){
            System.out.print("You picked up the WATER orb. You've unlocked your water ability!");
            status.water = true;
        }
        else if(grab.equals("no")){
            System.out.print("You didn't pick up the WATER orb.");
        }
        else{
            System.out.print("You ignored the orbs existence.");
        }
    }
    public void psychic(){
        System.out.print("\nYou found a PSYCHIC orb! Do you want to collect it?");

        String grab = yn.nextLine();

        if(grab.equals("yes")){
            System.out.print("You picked up the PSYCHIC orb. You've unlocked your psychic ability!");
            status.psychic = true;
        }
        else if(grab.equals("no")){
            System.out.print("You didn't pick up the PSYCHIC orb.");
        }
        else{
            System.out.print("You ignored the orbs existence.");
        }
    }
    public void wind(){
        System.out.print("\nYou found a WIND orb! Do you want to collect it?");

        String grab = yn.nextLine();
        if(grab.equals("yes")){
            System.out.print("You picked up the WIND orb. You've unlocked your wind ability!");
            status.wind = true;
        }
        else if(grab.equals("no")){
            System.out.print("You didn't pick up the PSYCHIC orb.");
        }
        else{
            System.out.print("You ignored the orbs existence.");
        }
    }

    public void healing_orb(){
        System.out.print("\nYou found a HEALING orb! Do you want to collect it?");

        String grab = yn.nextLine();
        if(grab.equals("yes")){
            System.out.print("\nYou picked up the HEALING orb!");
            status.healing = true;
            System.out.print("\nDo you want to use this orb?");
            String heal_or_not = yn.nextLine();
            if(heal_or_not.equals("yes")) {
                status.heal();
                status.healing = false;
            }
        }
        else if(grab.equals("no")){
            System.out.print("\nYou didn't pick up the HEALING orb.");
        }
        else{
            System.out.print("\nYou ignored the orbs existence.");
        }
    }
}