import java.util.Random;
import java.util.Scanner;

public class Amazon_jungle extends text_interface{
    public Scanner yn = new Scanner(System.in);
    public Fight fight = new Fight();

    public void amazon_river_enemies(){
        //Enemies(dragon slayer, poachers, yeti
        Random percentage = new Random();
        Integer dpys = percentage.nextInt(100) + 1;

        if(dpys <= 40){
            Random enemy = new Random();
            Integer enemies = enemy.nextInt(3) + 1;

            if(enemies.equals(1)){
                //dragon slayer
                System.out.print("\nThere is a dragon slayer sitting on a floating chair.");
                status.dragon = true;
            }
            else if(enemies.equals(2)){
                //poachers
                System.out.print("\nA poacher is hiding behind a bush.");
                status.poachers = true;
            }
            else if(enemies.equals(3)){
                //yeti
                System.out.print("\nThere lays a sleeping yeti blocking your path.");
                status.yeti = true;
            }
            fight.fight_maze();
        }
        else{
            //safe
        }
    }

    public void amazon_river_orbs(){
        //orbs: poison, water, earth, wind, none
        Random percentage = new Random();
        Integer orbsA = percentage.nextInt(100) + 1;

        if(orbsA <= 10){
            poison();
        }
        else if(orbsA >= 11 & orbsA <=20){
            water();

        }
        else if(orbsA >= 21 & orbsA <= 30){
            earth();
        }
        else if(orbsA >= 31 & orbsA <=40){
            wind();
        }
        else if(orbsA >= 41 & orbsA <= 50){
            healing_orb();
        }
        else if(orbsA >= 51 & orbsA <= 100){
            //no orbs
        }
    }

    public void poison(){
        System.out.print("\nYou found a POISON orb! Do you want to collect it?");

        String grab = yn.nextLine();
        if(grab.equals("yes")){
            System.out.print("You picked up the POISON orb. You've unlocked your poison ability!");
            status.poison = true;
        }
        else if(grab.equals("no")){
            System.out.print("You didn't pick up the POISON orb.");
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

    public void earth(){
        System.out.print("\nYou found an EARTH orb! Do you want to collect it?");

        String grab = yn.nextLine();
        if(grab.equals("yes")){
            System.out.print("You picked up the EARTH orb. You've unlocked your earth ability!");
            status.earth = true;
        }
        else if(grab.equals("no")){
            System.out.print("You didn't pick up the EARTH orb.");
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
            System.out.print("You didn't pick up the WIND orb.");
        }
        else{
            System.out.print("You ignored the orbs existence.");
        }
    }

    public void healing_orb(){
        System.out.print("\nYou found a HEALING orb! Do you want to collect it?");

        String grab = yn.nextLine();
        if(grab.equals("yes")){
            System.out.print("You picked up the HEALING orb!");
            status.healing = true;
            System.out.print("Do you want to use this orb?");
            String heal_or_not = yn.nextLine();
            if(heal_or_not.equals("yes")) {
                System.out.print("Your health increased by one.");
                status.heal();
                status.healing = false;
            }
        }
        else if(grab.equals("no")){
            System.out.print("You didn't pick up the HEALING orb.");
        }
        else{
            System.out.print("You ignored the orbs existence.");
        }
    }
}