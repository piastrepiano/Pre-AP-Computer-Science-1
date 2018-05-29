/*
Create a game in Java using classes and methods.
It may be based on anything you like, but must include decisions made by the user (Zork/Oregon Trail)
and must include graphics drawn on an Applet showing the user locations, enemies, items, etc.
You must write the code to draw the images on the Applet for each object.
 */
import java.util.Scanner;

public class Game_text {
    static Stage1 beginning_maze = new Stage1();
    static Stage2 coar_maze1 = new Stage2();

    public static void main(String args[]){
        text_play.intro();

        //STAGE 1
        //Enemies-bats, thorns, and pits
        //item collected - key (color by random)
        while(beginning_maze.getCounter() < 4) {
            beginning_maze.directions();
            if(beginning_maze.trap_or_safe()) {
                beginning_maze.addCounter();
            }
            else {
                //restarts maze
                beginning_maze.recount();
            }
        }

        //STAGE 2
        //china or amazon forest guide
        coar_maze1.ending1();

        /*STAGE 3
            Maze China teleports to Maze Amazon River
            Maze Amazon River teleports to Maze China
                Partner dies from new environment
                Survive then spaceship to final stage
         */

        /*STAGE 4 - FINAL STAGE
            @ space
            white dragon appears
            fight
            win collect the Eliteless Flag
            White light image
            Appear in front of the abandoned house but this time it's white
         */

        //SUGGESTION ENEMIES ( nine tail fox, phoenix, dragon slayer)
    }
}

class text_play{
    public static void intro(){
        Scanner console = new Scanner(System.in);
        System.out.print("You are stuck in an abandoned house. There are no windows and the room you're in is very dark...");
        console.nextLine();
        System.out.print("Trying to find the door, you suddenly fall into complete darkness...");
        console.nextLine();
        System.out.print("THUD!!!");
        console.nextLine();
        System.out.print("You open your eyes and squint at the sudden brightness. There, a floating orb shines brightly...");
        console.nextLine();
        System.out.print("A mirror appears on your right. You look at it and see a dragon standing before you...");
        console.nextLine();
        System.out.print("Shocked, you realize that YOU are the DRAGON!\n");
        console.nextLine();
        System.out.print((char)34 + "The goal for you, I'll recite in verse:");
        System.out.println("\nThrough twist and turns, find the key and lift the curse.");
        System.out.println("If you wish to leave this house unharmed, you must save Eliteless!!!" + (char)34);
        console.nextLine();
        System.out.print("The ground shakes and the mysterious orb explodes");
        console.nextLine();
    }
}
