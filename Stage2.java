/* STAGE 2
            Maze China
                Yellow key teleports you to China and becomes your partner...a serpent
                    Enemies(dragon slayer, phoenix, nine tailed fox
            Maze Amazon River
                Red key teleports you to the amazon forest and becomes your partner...a gorilla
                    Enemies(dragon slayer, poachers, yeti
            find the door(portal)
        */

import java.util.Random;
import java.util.Scanner;

public class Stage2 {
    public Scanner console = new Scanner(System.in);
    public Scanner collect = new Scanner(System.in);
    public boolean china = false;
    public boolean amazon_forest = false;
    public String direction;

    //fire, water, psychic, wind ; , poison earth
    public boolean water = false;
    public boolean fire = false;
    public boolean psychic = false;
    public boolean wind = false;
    public boolean poison = false;
    public boolean earth = false;

    public void ending1(){
        System.out.print("\nOh look! There's a treasure chest! You opened it and collected a ");
        Random key = new Random();
        //red or yellow key
        Integer roy = key.nextInt(2) + 1;

        //Yellow key teleports you to China
        if(roy.equals(1)){
            System.out.print("yellow key.");
            console.nextLine();
            System.out.print("\nThe ground suddenly starts shaking and opening up. Below you lies a fiery pit.");
            System.out.print("\nYou find yourself burning into ashes and...");
            console.nextLine();
            System.out.print("POOF!");
            console.nextLine();
            System.out.println("You appeared in front of a temple.");
            console.nextLine();
            china_intro();
        }
        //Red key teleports you to the amazon forest
        else{
            System.out.print("red key.");
            console.nextLine();
            System.out.print("\nThe ground suddenly starts shaking and opening up.");
            System.out.print("\nYou find yourself dissolving into thin air and...");
            console.nextLine();
            System.out.print("POOF!");
            console.nextLine();
            System.out.println("You appeared in a forest.");
            console.nextLine();
            amazon_river_intro();
        }
    }

    public void china_intro(){
        //key becomes your partner...a serpent(Apalala)
        System.out.print((char)34 + "Hello there!" + (char)34);
        console.nextLine();
        System.out.print("The key shakes out of your claws and a serpent appears!");
        console.nextLine();
        System.out.print((char)34 + "hiss...hiss...I've been expecting you...Welcome to CHINAAAA~~!");
        console.nextLine();
        System.out.println("My name is Apalala and I'm here to assist you in your journey of sssaving Elitelessss!");
        System.out.println("You must enter and go to the heart of the temple where the alter laysss.");
        System.out.println("You may encounter enemies as you go. To defeat them, you have to unlock the powersss from within.");
        System.out.println("This is possible by collecting orbs." +
                "\nThere are 5 different types of orbs available in this temple: fire, water, psychic, wind, and ice.");
        console.nextLine();
        System.out.println("hiss...hiss...My introduction is done. Let's go Massster.");
        console.nextLine();
        china = true;
    }

    public void amazon_river_intro(){
        //key becomes your partner...a gorilla(Chichwa)
        System.out.print((char)34 + "Hello there!" + (char)34);
        console.nextLine();
        System.out.print("The key shakes out of your claws and a gorilla appears!");
        console.nextLine();
        System.out.print((char)34 + "OO OO AWW AWW! Welcome to AMAZON JUNGLE!");
        console.nextLine();
        System.out.println("My name is Chichwa and I'm here to assist you in your journey of saving Eliteless,");
        System.out.println("You must find the Amazon River and follow its trail towards the sun.");
        System.out.println("There will be enemies as well as orbs on your way. These orbs will help you defeat enemies and stay alive." +
                "\nThe 5 different types of orbs available in this forest are poison, water, earth, wind, and bug.");
        console.nextLine();
        System.out.println("OO OO AWW AWW!!! My introduction is done! Let's go Alpha!");
        console.nextLine();
        amazon_forest = true;
    }

    public void direction(){
        Scanner lor = new Scanner(System.in);

        if(china){
            System.out.print("\nWhat direction do you wish to go? (left, right)");
            direction = lor.nextLine();

            if(direction.equals("left")){
                System.out.print("You turned left.");
            }
            else if(direction.equals("right")){
                System.out.print("You turned right.");
            }
            else{
                System.out.print("That is not a direction. Try again.");
            }
        }
        else if(amazon_forest){
            System.out.print("\nWhat direction do you wish to go? (left, right, straight)");
            direction = lor.nextLine();

            if(direction.equals("left")){
                System.out.print("You turned left.");
            }
            else if(direction.equals("right")){
                System.out.print("You turned right.");
            }
            else if(direction.equals("straight")){
                System.out.print("You continued walking straight.");
            }
            else{
                System.out.print("That is not a direction. Try again.");
            }
        }
    }

    public void amazon_river_enemies(){
        //Enemies(dragon slayer, poachers, yeti
        Random percentage = new Random();
        Integer dpys = percentage.nextInt(100) + 1;

        if(dpys <= 30){
            Random enemy = new Random();
            Integer enemies = enemy.nextInt(3) + 1;

            if(enemies.equals(1)){
                //dragon slayer
                System.out.println("\nThere is a dragon slayer sitting on a floating chair.");
            }
            else if(enemies.equals(2)){
                //poachers
                System.out.println("\nA poacher is hiding behind a bush.");
            }
            else if(enemies.equals(3)){
                //yeti
                System.out.println("\nThere lays a sleeping yeti blocking your path.");
            }
        }
        else{
            //safe
        }
    }

    public void amazon_river_orbs(){
        //orbs: poison, water, earth, wind, none
        Random percentage = new Random();
        Integer orbsA = percentage.nextInt(100) + 1;

        if(orbsA <= 20){
            //poison
            System.out.print("\nYou found a POISON orb! Do you want to collect it?");
            collect.nextLine();
            String grab = collect.nextLine();
            if(grab.equals("yes")){
                System.out.print("\nYou picked up the POISON orb. You've unlocked your poison ability!");
                poison = true;
            }
            else if(grab.equals("no")){
                System.out.print("\nYou didn't pick up the POISON orb.");
                poison = false;
            }
            else{
                System.out.print("\nYou ignored the orbs existence.");
            }
        }
        else if(orbsA >= 21 & orbsA <=40){
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
        else if(orbsA >= 41 & orbsA <= 60){
            //earth
            System.out.print("\nYou found an EARTH orb! Do you want to collect it?");
            collect.nextLine();
            String grab = collect.nextLine();
            if(grab.equals("yes")){
                System.out.print("\nYou picked up the EARTH orb. You've unlocked your earth ability!");
                earth = true;
            }
            else if(grab.equals("no")){
                System.out.print("\nYou didn't pick up the EARTH orb.");
                earth = false;
            }
            else{
                System.out.print("\nYou ignored the orbs existence.");
            }
        }
        else if(orbsA >= 61 & orbsA <=80){
            //wind
            System.out.print("\nYou found a WIND orb! Do you want to collect it?");
            collect.nextLine();
            String grab = collect.nextLine();
            if(grab.equals("yes")){
                System.out.print("\nYou picked up the WIND orb. You've unlocked your wind ability!");
                wind = true;
            }
            else if(grab.equals("no")){
                System.out.print("\nYou didn't pick up the WIND orb.");
                wind = false;
            }
            else{
                System.out.print("\nYou ignored the orbs existence.");
            }
        }
        else if(orbsA >= 81 & orbsA <=100){
            //None
        }
    }
}
