// Combine the Bank, Calc, and Payroll classes into the Bank Project

import java.text.DecimalFormat;
import java.util.Scanner;

public class bank_project {
    public static void main(String args[]){
        bank_class.deposit();
        bank_class.withdraw();
        bank_class.combine_close();
        bank_class.payroll();
    }
}

class bank_class{
    private static String check_save;
    private static double check;
    private static double save;
    private static Bank kim = new Bank(check,save);
    //decimal format for moneyy
    private static DecimalFormat output = new DecimalFormat("$0.00");

    public static void deposit(){
        Scanner check_or_save = new Scanner(System.in);
        System.out.print("Is this a checking or a savings deposit? ");
        check_save = check_or_save.nextLine();

        if(check_save.equals("checking")){
            Scanner checking = new Scanner(System.in);
            System.out.print("How much do you want to deposit in your checking balance?  $");
            check = checking.nextDouble();
            kim.checkingDeposit(check);
            System.out.println("\nYour current checking balance is: " + output.format(kim.getChecking()));
        }

        else if(check_save.equals("savings")){
            Scanner savings = new Scanner(System.in);
            System.out.print("How much do you want to deposit in your savings balance?  $");
            save = savings.nextDouble();
            kim.savingsDeposit(save);
            System.out.println("Your current savings balance is: " + output.format(kim.getSavings()));
        }

        //redo if doesn't answer correctly
        else{
            bank_class.deposit();
        }
    }

    public static void withdraw(){
        Scanner check_or_save = new Scanner(System.in);
        System.out.print("Is this a checking or a savings withdraw? ");
        check_save = check_or_save.nextLine();

        if ("checking".equals(check_save)) {
            Scanner checking = new Scanner(System.in);
            System.out.print("How much do you want to withdraw in your checking balance?  $");
            check = checking.nextDouble();
            kim.checkingWithdraw(check);
            System.out.println("\nYour current checking balance is: " + output.format(kim.getChecking()));

        } else if ("savings".equals(check_save)) {
            Scanner savings = new Scanner(System.in);
            System.out.print("How much do you want to withdraw in your savings balance?  $");
            save = savings.nextDouble();
            kim.savingsWithdraw(save);
            System.out.println("Your current savings balance is: " + output.format(kim.getSavings()));
        }

        //redo if doesn't answer correctly
        else {
            bank_class.withdraw();

        }
    }

    //combine checking and savings amount
    public static void combine(){
        System.out.println("\nYour combined balance is: " + output.format(kim.getCombined(kim.getChecking(), kim.getSavings())));
        System.out.println();
    }

    public static void combine_close(){
        kim.closeChecking();
        kim.closeSavings();
        System.out.println("\nYour combined balance is: " + output.format(kim.getCombined(kim.getChecking(), kim.getSavings())));
    }

    //combine bank into bank project
    public static void payroll(){
        kim.payroll_enterData();
        PayrollCalc.computeGrosspay();
        PayrollCalc.computeDeductions();
        PayrollCalc.computeNetpay();
        PayrollCalc.printCheck();
    }
}