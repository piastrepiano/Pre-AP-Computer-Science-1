/*
  Create a text-based user interface to log in to the bank account and
  allow the creation of an account, deposit, withdrawl, etc.
  Additionally, allow the user to input payment information & print out their check
  Allow them an option to continue making transaction or logging out. Be sure that everything is spaced and is neat and organized on the screen.
 */

import java.util.Scanner;

public class text_interface {

    public static void main(String args[]) {
        Scanner reply = new Scanner(System.in);
        System.out.println("Hello User.\nDo you want to create an account or log in?");
        String usr_reply = reply.nextLine();

        //allow the creation of an account
        if (usr_reply.equals("create an account")) {
            text_based_interface.account();
        }
        //log in to the bank account
        else if (usr_reply.equals("log in")){
            text_based_interface.log_in();
        }

        text_based_interface.withdraw_deposit_payroll();
    }
}

class text_based_interface{

    private static String name;
    private static String usr_name;
    private static String user_name;
    private static String password;
    private static String passwrd;
    private static String choice_reply;
    private static String check_save;
    static boolean play = true;

    //allow the creation of an account
    public static void account(){
        Scanner first_last_name = new Scanner(System.in);
        System.out.print("\nName(first and last): ");
        name = first_last_name.nextLine();

        Scanner user_name = new Scanner(System.in);
        System.out.print("Username: ");
        usr_name = user_name.nextLine();

        Scanner passwrd = new Scanner(System.in);
        System.out.print("Password: ");
        password = passwrd.nextLine();

        System.out.println("\nHello, " + name + ".\nYou have created an account.");
    }

    //log in to the bank account
    public static void log_in(){
        System.out.println("LOG IN: ");

        Scanner log_in_info = new Scanner(System.in);
        System.out.print("\nUSERNAME: ");

        user_name = log_in_info.nextLine();
        System.out.print("\nPassword: ");
        passwrd = log_in_info.nextLine();

        //deposit, withdraw, Additionally, allow the user to input payment information & print out their check
        if(usr_name.equals(user_name) & password.equals(passwrd)){
            System.out.println("Hello " + name);
        }

        else{
            System.out.println("Invalid username or password. Try again.");
            text_based_interface.log_in();
        }
    }

    //Allow them an option to continue making transaction or logging out.
    public static void withdraw_deposit_payroll(){
        while(play){
            Scanner deposit_or_withdraw = new Scanner(System.in);
            System.out.println("\nDo you want to deposit, withdraw, print out a check, or log out.");
            choice_reply = deposit_or_withdraw.nextLine();
            if(choice_reply.equals("deposit")){
                bank_class.deposit();
            }
            else if(choice_reply.equals("withdraw")){
                bank_class.withdraw();
            }
            else if(choice_reply.equals("print out a check")){
                bank_class.payroll();
                System.out.println("\nYour check has been printed out successfully.");
            }
            else if(choice_reply.equals("log out")) {
                play = false;
            }
        }
    }
}