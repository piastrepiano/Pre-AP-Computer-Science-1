import java.util.Scanner;

public class Fight extends text_interface{

    public void monster(){
        if(status.dragon & status.water){
            System.out.print("You used your WATER orb to wash away the dragon.");
            status.dragon = false;
        }
        else if(status.poachers & status.poison){
            System.out.print("You used your POISON orb to kill the poacher.");
            status.poachers = false;
        }
        else if(status.yeti & status.fire){
            System.out.print("You used your FIRE orb to burn the yeti.");
            status.yeti = false;
        }
        else if(status.phoenix & status.wind){
            System.out.print("You used your WIND orb to blow the phoenix away.");
            status.phoenix = false;
        }
        else if(status.fox & status.psychic){
            System.out.print("You used your PSYCHIC orb. Your enemy can't use its powers anymore and runs away.");
            status.fox = false;
        }
        else {
            System.out.print("You don't have enough orbs to defeat the monster. You must run past it.");
            System.out.print("\nThe monster attacks you briefly as you run away.");

            if (coar_maze1.partner) {
                System.out.print("Your and your partner's health each decreased by 0.5");
                status.half();
                status.share_health();
            }
            else {
                System.out.println("Your health decreased by one.");
                status.minus_one();
            }
        }
    }

    public void fight_maze() {
        Scanner yn = new Scanner(System.in);
        System.out.print("Do you want to Fight it?");
        String fight_or_run = yn.nextLine();

        if (fight_or_run.equals("yes")) {
            monster();
        }
        else if (fight_or_run.equals("no")){
            System.out.print("You run past the monster.");

            if(coar_maze1.partner) {
                System.out.print("\n" + (char) 34 + "I'll Fight in your stead! Go on ahead!" + (char) 34);
                yn.nextLine();
                System.out.print("You run away safely while you partner fights the monster.");
                System.out.println("Your partner's health decreased by one.");
                status.full_health();
            }
            else{
                System.out.print("The monster attacks you briefly as you run away.\nYour health decreased by one.");
                status.minus_one();
            }
        }
        else{
            System.out.print("That doesn't answer the question.");
            fight_maze();
        }
    }
}
