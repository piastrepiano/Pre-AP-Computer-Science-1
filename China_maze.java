import java.util.Random;
import java.util.Scanner;

public class China_maze {
    public Scanner collect = new Scanner(System.in);
    public boolean water = false;
    public boolean fire = false;
    public boolean psychic = false;
    public boolean wind = false;

    public void china_enemies(){
        //Enemies(dragon slayer, phoenix, nine tailed fox
        Random percentage = new Random();
        Integer dpns = percentage.nextInt(100) + 1;

        if(dpns <= 30){
            Random enemy = new Random();
            Integer enemies = enemy.nextInt(3) + 1;

            if(enemies.equals(1)){
                //dragon slayer
                System.out.println("\nThere is a dragon slayer sitting on a floating chair.");
            }
            else if(enemies.equals(2)){
                //phoenix
                System.out.println("\nThere is a phoenix flying above you.");
            }
            else if(enemies.equals(3)){
                //nine tail fox
                System.out.println("\nThere is a nine tail fox.");
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

        if(orbsC <= 20){
            //fire
            System.out.print("\nYou found a FIRE orb! Do you want to collect it?");
            collect.nextLine();
            String grab = collect.nextLine();
            if(grab.equals("yes")){
                System.out.print("\nYou picked up the FIRE orb. You've unlocked your fire ability!");
                fire = true;
            }
            else if(grab.equals("no")){
                System.out.print("\nYou didn't pick up the FIRE orb.");
                fire = false;
            }
            else{
                System.out.print("\nYou ignored the orbs existence.");
            }
        }
        else if(orbsC >= 21 & orbsC <=40){
            //water
            System.out.print("\nYou found a WATER orb! Do you want to collect it?");
            collect.nextLine();
            String grab = collect.nextLine();
            if(grab.equals("yes")){
                System.out.print("\nYou picked up the WATER orb. You've unlocked your water ability!");
                water = true;
            }
            else if(grab.equals("no")){
                System.out.print("\nYou didn't pick up the WATER orb.");
                water = false;
            }
            else{
                System.out.print("\nYou ignored the orbs existence.");
            }
        }
        else if(orbsC >= 41 & orbsC <= 60){
            //psychic
            System.out.print("\nYou found a PSYCHIC orb! Do you want to collect it?");
            collect.nextLine();
            String grab = collect.nextLine();

            if(grab.equals("yes")){
                System.out.print("\nYou picked up the PSYCHIC orb. You've unlocked your psychic ability!");
                psychic = true;
            }
            else if(grab.equals("no")){
                System.out.print("\nYou didn't pick up the PSYCHIC orb.");
            }
            else{
                System.out.print("\nYou ignored the orbs existence.");
            }
        }
        else if(orbsC >= 61 & orbsC <=80){
            //wind
            System.out.print("\nYou found a WIND orb! Do you want to collect it?");
            collect.nextLine();
            String grab = collect.nextLine();
            if(grab.equals("yes")){
                System.out.print("\nYou picked up the WIND orb. You've unlocked your wind ability!");
                wind = true;
            }
            else if(grab.equals("no")){
                System.out.print("\nYou didn't pick up the PSYCHIC orb.");
                wind = false;
            }
            else{
                System.out.print("\nYou ignored the orbs existence.");
            }
        }
        else if(orbsC >= 81 & orbsC <=100){
            //None
        }
    }
}
