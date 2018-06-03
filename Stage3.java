import java.util.Scanner;

public class Stage3 {
    static Stage2 coar_maze1 = new Stage2();
    public Scanner console = new Scanner(System.in);

    public void ending2_china(){
        System.out.print("\nYou stand upon an unusual door.");
        System.out.println("\n" + (char)34 + "You found the heart of the temple where the alter laysss!" +
                "Let'sss go in, Massster!" + (char)34);
        System.out.println("You and Siapart both enter in.\nThe temple starts shaking and you guys are suddenly" +
                    "emerged in water.");
        System.out.println("Both you swam out of the river and rested for a day to dry off.");
        System.out.println("On next day, suddenly, Siapart fell sick...");
        System.out.println((char)34 + "I think being in a new environment is making me fall ill.\nIf I recall, thisss isss the" +
                "Amazon Jungle. You mussst follow the sssun and find the Mighty Jaguar!.");
        console.nextLine();
        System.out.print("Sssorry to hold you back, but can we ressst for one more day?\nI promissse you that I'll be " +
                "back on track tomorrow. I need to get used to this climate first. Just one more day..." + (char)34);
        console.nextLine();
        System.out.print("\nOn the next day...you wake up and found Siapart dead.");
        System.out.print("You must finish the rest of your journey alone.");
    }

    public void ending2_amazon(){
        System.out.print("\nYou stand upon an unusual swirling looking puddle.");
        System.out.println("\n" + (char)34 + "You found the portal, Alpha! Let's jump in!!!" + (char)34);
        System.out.println("You and Kongo both jump in the portal.\nSuddenly you fall from the sky and land on top of a tree.");
        System.out.println("Both of you climbed down and found yourself on the middle of a road.");
        System.out.println((char)34 + "Let's follow the sun. That's what we had to do last time." + (char)34);
        System.out.println("Both of you walked down through the scorching hot road...");
        console.nextLine();
        System.out.print("After 3 days, you finally reached to a temple. However, your partner, Kongo died the day before" +
                "due to dehydration.");
        System.out.println("You noticed a scroll lying in front of the gates labeled Alpha. Kongo probably wrote this to you." +
                "\n\nYou unrolled  it and read: ");
        System.out.println((char)34 + "OO OO AWW AWW!!! It's Kongo here!\nSorry for not being able to continue with you on" +
                "our journey to saving Eliteless...\nYou must enter and go to the heart of the temple where the alter is.");
        System.out.println("You must finish the rest of your journey alone. I wish you luck!\nOO OO AWW AWW!!!" + (char)34);
    }
}
