import java.awt.*;
import java.applet.*;
import java.util.Scanner;

public class Stage3 extends Applet{
    public static Status status = new Status();
    static China_maze china_maze = new China_maze();
    static Amazon_jungle amazon_jungle = new Amazon_jungle();

    public void paint(Graphics g) {
    /*STAGE 3
            Maze China teleports to Maze Amazon River
            Maze Amazon River teleports to Maze China
                Partner dies from new environment
                Survive then spaceship to final stage
         */
        status.partner = false;
        if (status.play) {
            if (status.china) {
                text_play3.ending2_china(graphics);
            } else if (status.amazon_forest) {
                text_play3.ending2_amazon(graphics);
            }
        }
        while (status.getCounter() < 6 && status.play) {
            if (status.china) {
                text_play3.forest_direction();
                amazon_jungle.amazon_river_orbs(graphics);
                amazon_jungle.amazon_river_enemies();
            } else if (status.amazon_forest) {
                text_play3.china_direction();
                china_maze.china_orbs(graphics);
                china_maze.china_enemies();
            }
            status.addCounter();
            status.quit();
        }
        status.recount();
    }
}

class text_play3{
    public static Scanner console = new Scanner(System.in);
    public static String direction;

    public static void ending2_china(Graphics graphics){
        System.out.print("\n\nYou stand upon an unusual door.");
        draw_china2.doors(graphics);
        console.nextLine();
        draw_coa.siapart(graphics);
        System.out.print((char)34 + "You found the heart of the temple where the alter laysss! " +
                "Let'sss go in, Massster!" + (char)34);
        console.nextLine();
        System.out.print("You and Siapart both enter in.\nThe temple starts shaking and you guys are suddenly" +
                " emerged in water.");
        console.nextLine();
        System.out.print("Both you swam out of the river and rested for a day to dry off.");
        System.out.print("\nOn next day, suddenly, Siapart fell sick...");
        console.nextLine();
        System.out.print((char)34 + "I think being in a new environment is making me fall ill.\nIf I recall, thisss isss the" +
                " Amazon Jungle. You mussst follow the sssun and find the Mighty Jaguar!.");
        draw_coa.forest(graphics);
        console.nextLine();
        System.out.print("Sssorry to hold you back, but can we ressst for one more day?\nI promissse you that I'll be " +
                "back on track tomorrow. I need to get used to this climate first. Just one more day..." + (char)34);
        console.nextLine();
        System.out.print("\nOn the next day...you wake up and found Siapart dead.");
        System.out.print("\nYou must finish the rest of your journey alone.");
        console.nextLine();
    }

    public static void ending2_amazon(Graphics graphics){
        System.out.print("\n\nYou stand upon an unusual swirling looking puddle.");
        draw_amazon2.portal(graphics);
        console.nextLine();
        System.out.print((char)34 + "You found the portal, Alpha! Let's jump in!!!" + (char)34);
        draw_coa.kongo(graphics);
        console.nextLine();
        System.out.print("You and Kongo both jump in the portal.\nSuddenly you fall from the sky and land on top of a tree.");
        System.out.println("Both of you climbed down and found yourself on the middle of a road.");
        draw_amazon2.road(graphics);
        console.nextLine();
        System.out.print((char)34 + "Let's follow the sun. That's what we had to do last time." + (char)34);
        console.nextLine();
        System.out.print("Both of you walked down through the scorching hot road...");
        console.nextLine();
        System.out.print("After 3 days, you finally reached to a temple. However, your partner, Kongo died the day before" +
                "due to dehydration.");
        draw_coa.temple(graphics);
        console.nextLine();
        System.out.print("You noticed a scroll lying in front of the gates labeled Alpha. Kongo probably wrote this to you." +
                "\n\nYou unrolled  it and read: ");
        console.nextLine();
        System.out.print((char)34 + "OO OO AWW AWW!!! It's Kongo here!\nSorry for not being able to continue with you on" +
                "our journey to saving Eliteless...\nYou must enter and go to the heart of the temple where the alter is.");
        System.out.println("You must finish the rest of your journey alone. I wish you luck!\nOO OO AWW AWW!!!" + (char)34);
        console.nextLine();
    }

    public static void china_direction() {
        Scanner lor = new Scanner(System.in);
        System.out.print("\nWhat direction do you wish to go?(left, right)");
        direction = lor.nextLine();

        if (direction.equals("left")) {
            System.out.print("You turned left.");
        } else if (direction.equals("right")) {
            System.out.print("You turned right.");
        } else {
            System.out.print("That is not a direction. Try again.");
            china_direction();
        }
    }

    public static void forest_direction() {
        Scanner srl = new Scanner(System.in);
        System.out.print("\nWhat direction do you wish to go?(left, right, straight)");
        direction = srl.nextLine();

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
            forest_direction();
        }
    }
}

class draw_china2{
    public static void doors(Graphics graphics){
        graphics.setColor(Color.black);
        graphics.fillRect(10, 10, 385, 289);
        graphics.setColor(Color.lightGray);
        graphics.fillArc(60, 100, 280, 280, 0, 360);
        graphics.setColor(Color.cyan);
        graphics.fillRoundRect(90, 200, 70, 120, 25, 20);
        graphics.fillRoundRect(160, 200, 70, 120, 25, 20);
        graphics.fillRoundRect(230, 200, 70, 120, 25, 20);
        graphics.setColor(Color.black);
        graphics.drawRoundRect(90, 200, 70, 120, 25, 20);
        graphics.drawRoundRect(160, 200, 70, 120, 25, 20);
        graphics.drawRoundRect(230, 200, 70, 120, 25, 20);

    }
}

class draw_amazon2{
    public static void portal(Graphics graphics){
        graphics.setColor(Color.black);
        graphics.fillRect(10, 10, 385, 289);
        graphics.setColor(Color.white);
        graphics.fillArc(60, 15, 280, 280, 0, 360);

        graphics.setColor(Color.cyan);
        graphics.fillArc(150, 80, 100, 200, 0, 360);
        graphics.setColor(Color.blue);
        graphics.fillArc(160, 100, 80, 160, 0, 360);
        graphics.setColor(Color.cyan);
        graphics.fillArc(170, 120, 60, 120, 0, 360);
        graphics.setColor(Color.blue);
        graphics.fillArc(180, 140, 40, 80, 0, 360);
    }

    public static void road(Graphics graphics){
        graphicssetColor(Color.black);
        graphics.fillRect(10, 10, 385, 289);
        graphics.setColor(Color.darkGray);
        graphics.fillRect(170, 10, 100, 300);

        graphics.setColor(Color.white);
        int y = 10;
        for (int k = 1; k <= 10; k++) {
            graphics.fillRect(215, y, 10, 20);
            y += 30;
        }
    }
}
