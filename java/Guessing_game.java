import java.util.Scanner;
import java.util.Random;
import java.lang.System;
import java.text.*;

public class Guessing_game {
    public static void main (String args[]){
        Scanner name_input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = name_input.nextLine();
        System.out.println("\nHello " + name + "!\nWelcome to my guessing game.");

        //random max number
        Random maxnum = new Random();
        Integer max = maxnum.nextInt(100) + 1;
        //random number chosen
        Random num = new Random();
        Integer number = num.nextInt(max);
        //number guessed
        Integer guess;

        // counter
        Integer tries = 0;

        boolean win = false;

        //Be sure to include a loop to to allow your user to continue playing until they win.
        while (!win){

            //Scanner object
            Scanner num_input = new Scanner(System.in);
            System.out.println("\nGuess a number between 1 and "+ max +": ");
            guess = num_input.nextInt();
            tries++;

            //determine whether number is guessed correctly or not
            if (guess.equals(number)){
                win = true;
            }
            else if(guess > number){
                System.out.println("Number is to high, try again");
            }
            else {
                System.out.println("Number is to low, try again");
            }
        }

        //calc score
        Double score;
        if (tries == 1){
            score = 100.00;
        }
        else {
            score = 100.0 - 2 * tries / 0.75;
        }
        //round to 2 decimal places
        DecimalFormat df = new DecimalFormat("###.##");

        //Win- print out score
        System.out.println("---------------------");
        System.out.println("Congratulations " + name + "!\nYou win!");
        System.out.println("It took you "+ tries + " tries.");
        System.out.println("Your score is " + df.format(score) + "%");
        System.out.println("---------------------");

    }
}