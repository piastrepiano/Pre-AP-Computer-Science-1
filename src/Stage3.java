import java.util.Scanner;

public class Stage3 extends text_interface{
    public Scanner console = new Scanner(System.in);
    public String direction;


    public void ending2_china(){
        System.out.print("\n\nYou stand upon an unusual door.");
        console.nextLine();
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
        console.nextLine();
        System.out.print("Sssorry to hold you back, but can we ressst for one more day?\nI promissse you that I'll be " +
                "back on track tomorrow. I need to get used to this climate first. Just one more day..." + (char)34);
        console.nextLine();
        System.out.print("\nOn the next day...you wake up and found Siapart dead.");
        System.out.print("\nYou must finish the rest of your journey alone.");
        console.nextLine();
    }

    public void ending2_amazon(){
        System.out.print("\n\nYou stand upon an unusual swirling looking puddle.");
        console.nextLine();
        System.out.print((char)34 + "You found the portal, Alpha! Let's jump in!!!" + (char)34);
        console.nextLine();
        System.out.print("You and Kongo both jump in the portal.\nSuddenly you fall from the sky and land on top of a tree.");
        System.out.println("Both of you climbed down and found yourself on the middle of a road.");
        console.nextLine();
        System.out.print((char)34 + "Let's follow the sun. That's what we had to do last time." + (char)34);
        console.nextLine();
        System.out.print("Both of you walked down through the scorching hot road...");
        console.nextLine();
        System.out.print("After 3 days, you finally reached to a temple. However, your partner, Kongo died the day before" +
                "due to dehydration.");
        console.nextLine();
        System.out.print("You noticed a scroll lying in front of the gates labeled Alpha. Kongo probably wrote this to you." +
                "\n\nYou unrolled  it and read: ");
        console.nextLine();
        System.out.print((char)34 + "OO OO AWW AWW!!! It's Kongo here!\nSorry for not being able to continue with you on" +
                "our journey to saving Eliteless...\nYou must enter and go to the heart of the temple where the alter is.");
        System.out.println("You must finish the rest of your journey alone. I wish you luck!\nOO OO AWW AWW!!!" + (char)34);
        console.nextLine();
    }

    public void china_direction() {
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

    public void forest_direction() {
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
