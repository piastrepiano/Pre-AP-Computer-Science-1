/*
Create a game in Java using classes and methods. (done)
It may be based on anything you like, but must include decisions made by the user (done)
locations, enemies, items collect (done)
You must write the code to draw the images on the Applet for each object.[graphics drawn on an applet] ()
 */

import java.util.Scanner;

public class Game_text {
    public static void main(String args[]){
        text_interface.stageOne();
        text_interface.stageTwo();
        text_interface.stageThree();
        text_interface.stageFour();
    }
}
class text_interface {
    //objects
    public static Status status = new Status();
    static Stage1 beginning_maze = new Stage1();
    static Stage2 coar_maze1 = new Stage2();
    static Stage3 coar_maze2 = new Stage3();
    static Stage4 space_maze = new Stage4();
    static China_maze china_maze = new China_maze();
    static Amazon_jungle amazon_jungle = new Amazon_jungle();

    //boolean to end game
    public static boolean play = true;

    public static void quit() {
        if (status.getHealth() < 0) {
            play = false;
        }
    }

    //STAGE 1
    //Enemies-bats, thorns, and pits
    //item collected - key (color by random)
    public static void stageOne() {
        Stage1.intro();
        while (status.getCounter() < 3 && play) {
            beginning_maze.directions();
            if (beginning_maze.trap_or_safe()) {
                status.addCounter();
                if (beginning_maze.bat) {
                    status.half();
                } else if (beginning_maze.thorn) {
                    status.fourth();
                }
            } else {
                //restarts maze
                status.recount();
            }
            quit();
        }
    }

    //STAGE 2
    //china or amazon rainforest 1st maze
    public static void stageTwo() {
        status.recount();
        if (play) {
            coar_maze1.ending1();
        }
        while (status.getCounter() < 6 && play) {
            coar_maze1.direction();
            if (coar_maze1.china) {
                china_maze.china_orbs();
                china_maze.china_enemies();
            } else if (coar_maze1.amazon_forest) {
                amazon_jungle.amazon_river_orbs();
                amazon_jungle.amazon_river_enemies();
            }
            status.addCounter();
            quit();
        }
        status.recount();
    }

    /*STAGE 3
            Maze China teleports to Maze Amazon River
            Maze Amazon River teleports to Maze China
                Partner dies from new environment
                Survive then spaceship to final stage
         */
    public static void stageThree() {
        coar_maze1.partner = false;
        if (play) {
            if (coar_maze1.china) {
                coar_maze2.ending2_china();
            } else if (coar_maze1.amazon_forest) {
                coar_maze2.ending2_amazon();
            }
        }
        while (status.getCounter() < 6 && play) {
            if (coar_maze1.china) {
                coar_maze2.forest_direction();
                amazon_jungle.amazon_river_orbs();
                amazon_jungle.amazon_river_enemies();
            } else if (coar_maze1.amazon_forest) {
                coar_maze2.china_direction();
                china_maze.china_orbs();
                china_maze.china_enemies();
            }
            status.addCounter();
            quit();
        }
        status.recount();
    }

    /*STAGE 4 - FINAL STAGE
            @ space
            white dragon appears
            Fight
            win collect the Eliteless Flag
            White light image
            Appear in front of the abandoned house but this time it's white
         */
    public static void stageFour() {
        Scanner console = new Scanner(System.in);
        coar_maze1.partner = true;
        status.restart();
        if (play) {
            if (coar_maze1.china) {
                space_maze.ending3_china();
            } else if (coar_maze1.amazon_forest) {
                space_maze.ending3_amazon();
            }
            status.print_status();
        }

        while (play) {
            space_maze.fight();
            if (status.getBoss_health() > 0) {
                space_maze.boss_attack();
            }
            status.print_health();
            //win
            if (status.getBoss_health() < 0) {
                space_maze.win();
                play = false;
            }
            quit();
        }
    }
}