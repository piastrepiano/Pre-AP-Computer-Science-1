/*
Create a game in Java using classes and methods.
It may be based on anything you like, but must include decisions made by the user (Zork/Oregon Trail)
and must include graphics drawn on an Applet showing the user locations, enemies, items, etc.
You must write the code to draw the images on the Applet for each object.
 */
import java.util.Scanner;

public class Game_text {
    public static void main(String args[]){
        text_play.intro();
        text_play.directions();
        /*
//plan out maze//
//traps ( pits )//
//harm health - thorns
          Enemies ( nine tail fox, phoenix, dragon slayer) //
//end of maze find a yellow and red key
        Yellow key teleports you to China and becomes your partner...a serpent
        Red key teleports you to the amazon river and becomes your partner...a gorilla//
//plan out 2 new mazes//
//go through maze and find the door(portal)
                If you are in  china you teleport to amazon river or vice versa
                Partner dies from new environment
Finish stage//
//portal to space//
//white dragon appears//
//you must fight//
//win collect the eliteless flag//
//white light appears, you appear in front of the abandoned house but this time it’s white instead of wood color//

         */
    }
}

class text_play{
    private static String direction;

    public static void intro(){
        Scanner console = new Scanner(System.in);
        System.out.print("You are stuck in an abandoned house...");
        console.nextLine();
        System.out.print("There are no windows and the room you're in is very dark...");
        console.nextLine();
        System.out.print("Trying to find the door, you suddenly fall into complete darkness...THUD!!!");
        console.nextLine();
        System.out.print("...");
        console.nextLine();
        System.out.print("You open your eyes and squint at the sudden brightness. There, a floating orb shines brightly...");
        console.nextLine();
        System.out.print((char)34 + "The goal for you, I'll recite in verse:");
        console.nextLine();
        System.out.print("Through twist and turns, find the key and lift the curse.");
        console.nextLine();
        System.out.print("If you wish to leave this house unharmed, you must save Eliteless!!!" + (char)34);
        console.nextLine();
        System.out.print("\nThe mysterious orb explodes and you are brought back into the abandoned house...");
        console.nextLine();
        System.out.print("A mirror appears on your right. You look at it and see a dragon standing before you...");
        console.nextLine();
        System.out.print("Shocked, you realize that YOU are the DRAGON!");
        console.nextLine();
    }

    public static void directions(){
        Scanner direct = new Scanner(System.in);
        System.out.print("What direction do you wish to go? (left, right, straight)");
        direction = direct.nextLine();

        if(direction.equals("left")){
            //left
        }
        else if(direction.equals("right")){
            //right
        }
        else if(direction.equals("straight")){
            //straight
        }
        else{
            System.out.println("That is not a direction. Try again...");
            text_play.directions();
        }
    }
}
