/*STAGE 4 - FINAL STAGE
            @ space
            white dragon appears
            Fight
            win collect the Eliteless Flag
            White light image
            Appear in front of the abandoned house but this time it's white
         */

import java.util.Scanner;
import java.util.Random;

public class Stage4 extends text_interface{
    public Scanner console = new Scanner(System.in);

    public void ending3_china(){
        System.out.print("\n\nYou stand upon an unusual swirling looking puddle.");
        console.nextLine();
        System.out.print("You jump in the puddle.");
        console.nextLine();
        System.out.print("You open your eyes to see a white looking room and an empty box that says " + (char)34 + "Wake" + (char)34);
        console.nextLine();
        System.out.print("Suddenly a piece of Siapart's scale appeared on your claw.");
        console.nextLine();
        System.out.print("You placed this in the box.");
        console.nextLine();
        System.out.print("The box vigorously shook and then...");
        console.nextLine();
        System.out.print("BOOM!!!");
        console.nextLine();
        System.out.print("The box exploded and Siapart appeared!");
        console.nextLine();
        System.out.print((char)34 + "HISS...HISS...Thank you for reviving me!!! Sssadly I'm halved..." + (char)34);
        console.nextLine();
        System.out.print("Siapart doesn't look like he usually does. All that you see is a talking skeleton of Siapart.");
        console.nextLine();
        System.out.print((char)34 + "Anywaysss...we mussst work together and defeat Zaga!" + (char)34);
        console.nextLine();
        System.out.print("\nThe room shakes and the white wall break off.");
        console.nextLine();
        System.out.print("You are in space and Zaga appears before you.");
        console.nextLine();
    }

    public void ending3_amazon(){
        System.out.print("\n\nYou stand upon an unusual door.");
        console.nextLine();
        System.out.print("You opened the door and saw an alter that looks like no other.");
        System.out.print("\nIt must be the alter in the heart of the temple!");
        console.nextLine();
        System.out.print("The temple starts shaking.");
        console.nextLine();
        System.out.print("You open your eyes to see a white looking room and an empty box that says " + (char)34 + "Wake" + (char)34);
        console.nextLine();
        System.out.print("Suddenly a piece of Kongo's fur appeared on your claw.");
        console.nextLine();
        System.out.print("You placed this in the box.");
        console.nextLine();
        System.out.print("The box vigorously shook and then...");
        console.nextLine();
        System.out.print("BOOM!!!");
        console.nextLine();
        System.out.print("The box exploded and Kongo appeared!");
        console.nextLine();
        System.out.print((char)34 + "OO OO AWW AWW!!! Thank you for reviving me!!! Sadly everythin of me is halved..." + (char)34);
        console.nextLine();
        System.out.print("Kongo doesn't look like he usually does. All that you see is a talking skeleton of Kongo.");
        console.nextLine();
        System.out.print((char)34 + "We must work together and defeat Zaga!!!" + (char)34);
        console.nextLine();
        System.out.print("\nThe room shakes and the white wall break off.");
        console.nextLine();
        System.out.print("You are in space and Zaga appears before you.");
        console.nextLine();
    }

    public void fight(){
        //use ability
        player_fight();
        random_damage();
        //partner attacks
        if(status.partner_alive()) {
            random_pdamage();
        }
    }

    public void print_orb(){
        if(status.water){
            System.out.print("water, ");
        }
        if(status.wind){
            System.out.print("wind, ");
        }
        if(status.poison){
            System.out.print("poison, ");
        }
        if(status.earth){
            System.out.print("earth, ");
        }
        if(status.psychic){
            System.out.print("psychic, ");
        }
        if(status.fire){
            System.out.print("fire, ");
        }
    }

    public void player_fight(){
        System.out.print("\nWhat skills do you want to use?(");
        print_orb();
        System.out.print(")");
        String orb = console.nextLine();

        if(orb.equals("water")){
            System.out.print("\nYou used Hydro Vortex!");
        }
        else if(orb.equals("wind")){
            System.out.print("\nYou used Supersonic Skystrike!");
        }
        else if(orb.equals("poison")){
            System.out.print("\nYou used Venoshock!");
        }
        else if(orb.equals("earth")){
            System.out.print("\nYou used Magnitude!");
        }
        else if(orb.equals("psychic")){
            System.out.print("\nYou used Hyperspace Hole!");
        }
        else if(orb.equals("fire")){
            System.out.print("\nYou used Inferno Overdrive!");
        }
        else{
            System.out.print("\nThat skill isn't available.");
            player_fight();
        }
    }

    public void partner_fight(){
        if(coar_maze1.china){
            //serpent attacks
            System.out.print("\nSiapart used Toxic Spikes!");
        }
        else if(coar_maze1.amazon_forest){
            //gorilla attacks
            System.out.print("\nKongo used Ancient Power!");
        }
    }

    public void random_damage(){
        Random percent = new Random();
        Integer num = percent.nextInt(100) + 1;

        if(num <= 90){
            System.out.print("\nZaga's health decreased by 2.");
            status.orb_damage(); //-2
        }
        else{
            System.out.print("\nZaga's health decreased by 4.");
            status.surprise_damage(); //-4
        }
    }

    public void random_pdamage(){
        Random percent = new Random();
        Integer num = percent.nextInt(100) + 1;

        if(num <= 60){
            partner_fight();
            System.out.println("\nZaga's health decreased by 1.");
            status.partner_damage(); //-1
        }
        else{
            System.out.println("\nYour partner gets dizzy.");
            partner_fight();
            Random number = new Random();
            Integer choice = number.nextInt(2) + 1;

            if(choice.equals(1)){
                System.out.println("\nZaga's health decreased by 0.5.");
                status.dizzy_damage(); //0.5
            }
            else if(choice.equals(2)){
                System.out.println("\nYour partner misses. No damage occured.");
            }
        }
    }
    public void boss_attack(){
        Random fight = new Random();
        Integer attack = fight.nextInt(3) + 1;
        if(attack.equals(1)){
            System.out.print("\nZaga uses Roar of Time!");
        }
        else if(attack.equals(2)){
            System.out.print("\nZaga uses Clangorous Soulblaze");
        }
        else if(attack.equals(3)){
            System.out.print("\nZaga uses Clangorous Soulblaze");
        }
        status.minus_one();
        status.full_health();
    }

    public void win(){
        System.out.print("\nZaga disappears.");
        console.nextLine();
        System.out.print("The Eliteless flag waves on a moon.");
        console.nextLine();
        System.out.print("Congratulations! You saved Eliteless!!!");
        console.nextLine();
        System.out.print("You are brought back to the abandoned house...");
        console.nextLine();
        System.out.print("But wait...the abandoned house looks different...");
        console.nextLine();
        System.out.print("\nTHE END");
    }
}
