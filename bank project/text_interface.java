import java.util.Scanner;

public class text_interface {

    public static void main(String args[]) {
        text_based_interface.account_or_login();
        text_based_interface.withdraw_deposit_payroll();
    }
}

class text_based_interface{

    private static String name;
    private static String usr_name;
    private static String password;
    //log out boolean
    private static boolean play = true;
    //repeat question boolean
    private static boolean repeat = true;

    //user chooses whether to create an account or login
    public static void account_or_login(){
        // in case log in failed repeat the question
        while(repeat){
            Scanner reply = new Scanner(System.in);
            System.out.print("\nHello User.\nDo you want to create an account or log in? ");
            String usr_reply = reply.nextLine();

            //allow the creation of an account
            switch (usr_reply) {
                case "create an account":
                    text_based_interface.account();
                    break;
                //log in to the bank account
                case "log in":
                    text_based_interface.log_in();
                    break;
                default:
            }
        }
    }

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

        //after creating an account is automatically logged in
        System.out.println("\nHello, " + name + ".\nYou have created an account.");
        repeat = false;
    }

    //log in to the bank account
    public static void log_in(){
        System.out.println("\nLOG IN: ");

        Scanner log_in_info = new Scanner(System.in);
        System.out.print("USERNAME: ");

        String user_name = log_in_info.nextLine();
        System.out.print("Password: ");
        String passwrd = log_in_info.nextLine();

        //deposit, withdraw, Additionally, allow the user to input payment information & print out their check
        if(null == usr_name & null == password){
            System.out.println("\nInvalid username or password. Try again.");
            repeat = true;
        }
        else if(usr_name.equals(user_name) & password.equals(passwrd)){
            System.out.println("Hello " + name);
            repeat = false;
        }
    }

    //Allow them an option to continue making transaction or logging out.
    public static void withdraw_deposit_payroll(){
        while(play){
            Scanner deposit_or_withdraw = new Scanner(System.in);
            System.out.print("Do you want to deposit, withdraw, print out a check, or log out. ");
            String choice_reply = deposit_or_withdraw.nextLine();
            switch (choice_reply) {
                case "deposit":
                    bank_class.deposit();
                    bank_class.combine();
                    break;
                case "withdraw":
                    bank_class.withdraw();
                    bank_class.combine();
                    break;
                case "print out a check":
                    bank_class.payroll();
                    System.out.println("\nYour check has been printed out successfully.");
                    break;
                case "log out":
                    play = false;
                    break;
                //if they don't input any of these ask again
                default:
            }
        }
    }
}