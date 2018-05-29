import java.util.Random;
import java.util.Scanner;

public class Stage2 {
    public Scanner console = new Scanner(System.in);
    public void ending1(){
        System.out.print("\nOh look! There's a treasure chest! You opened it and collected a ");
        Random key = new Random();
        //red or yellow key
        Integer roy = key.nextInt(2) + 1;

        if(roy.equals(1)){
            System.out.print("yellow key.");
            console.nextLine();
            System.out.print("\nThe ground suddenly starts shaking and opening up. Below you lies a fiery pit.");
            System.out.print("\nYou find yourself burning into ashes and...");
            console.nextLine();
            System.out.print("POOF!");
            console.nextLine();
            System.out.println("You appeared in front of a temple.");
            china_intro();
        }
        else{
            System.out.print("red key.");
            console.nextLine();
            System.out.print("\nThe ground suddenly starts shaking and opening up.");
            System.out.print("\nYou find yourself dissolving into thin air and...");
            console.nextLine();
            System.out.print("\nPOOF!");
            console.nextLine();
            System.out.println("You appeared in a forest.");
            amazon_river_intro();
        }
    }

    public void china_intro(){
        console.nextLine();
        System.out.print((char)34 + "Hello there!" + (char)34);
        console.nextLine();
        System.out.print("\nThe key shakes out of your claws and a serpent appears!");
        console.nextLine();
        System.out.print((char)34 + "hiss...hiss...I've been expecting you...Welcome to CHINAAAA~~!");
        console.nextLine();
        System.out.print("My name is Apalala and I'm here to assist you in your journey of sssaving Elitelessss!");
        console.nextLine();
        System.out.print("You must enter and go to the heart of the temple where the alter laysss.");
        System.out.print("You may encounter enemies as you go. To defeat them, you have to unlock the powersss from within.");
        console.nextLine();
        System.out.print("This is possible by collecting orbs." +
                "\nThere are 5 different types of orbs available in this temple: fire, water, psychic, wind, and ice;");
        console.nextLine();
        System.out.print("hiss...hiss...My introduction is done. Let's go Massster.");
    }

    public void amazon_river_intro(){
        System.out.print((char)34 + "Hello there!" + (char)34);
        console.nextLine();
        System.out.print("\nThe key shakes out of your claws and a gorilla appears!");
        console.nextLine();
        System.out.print((char)34 + "OO OO AWW AWW! Welcome to AMAZON JUNGLE!");
        console.nextLine();
        System.out.print("My name is Chichwa and I'm here to assist you in your journey of saving Eliteless,");
        console.nextLine();
        System.out.print("You must find the Amazon River and follow its trail towards the sun.");
        System.out.print("There will be enemies as well as orbs on your way. These orbs will help you defeat enemies and stay alive." +
                "The 5 different types of orbs available in this forest are poison, water, earth, wind, and bug;");
        console.nextLine();
        System.out.print("OO OO AWW AWW!!! My introduction is done! Let's go Alpha!");
    }
}
