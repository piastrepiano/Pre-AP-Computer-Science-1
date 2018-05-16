// Combine the Bank, Calc, and Payroll classes into the Bank Project

import java.util.Scanner;

public class bank_project {
    public static void main(String args[]){
        bank_class.deposit();
        bank_class.withdraw();
        bank_class.combine();
        bank_class.combine_close();
        bank_class.payroll();
    }
}

class bank_class{
    private static String check_save;
    private static double check;
    private static double save;
    private static Bank kim = new Bank(check,save);

    public static void deposit(){
        Scanner check_or_save = new Scanner(System.in);
        System.out.print("Is this a checking or a savings deposit?");
        check_save = check_or_save.nextLine();

        if(check_save.equals("checking")){
            Scanner checking = new Scanner(System.in);
            System.out.print("How much do you want to deposit in your checking balance?  $");
            check = checking.nextDouble();
        }
        else if(check_save.equals("savings")){
            Scanner savings = new Scanner(System.in);
            System.out.print("How much do you want to deposit in your savings balance?  $");
            save = savings.nextDouble();
        }

        kim.checkingDeposit(check);
        kim.savingsDeposit(save);
        System.out.println("Your current checking balance is: $" + kim.getChecking());
        System.out.println("Your current savings balance is: $" + kim.getSavings());
    }

    public static void withdraw(){
        Scanner check_or_save = new Scanner(System.in);
        System.out.print("Is this a checking or a savings withdraw?");
        check_save = check_or_save.nextLine();

        if(check_save.equals("checking")){
            Scanner checking = new Scanner(System.in);
            System.out.print("How much do you want to withdraw in your checking balance?  $");
            check = checking.nextDouble();
        }
        else if(check_save.equals("savings")){
            Scanner savings = new Scanner(System.in);
            System.out.print("How much do you want to withdraw in your savings balance?  $");
            save = savings.nextDouble();
        }

        kim.checkingWithdraw(check);
        kim.savingsWithdraw(save);
        System.out.println("Your current checking balance is: $" + kim.getChecking());
        System.out.println("Your current savings balance is: $" + kim.getSavings());
        System.out.println();
    }

    public static void combine(){
        System.out.println("Your combined balance is: $" + kim.getCombined(kim.getChecking(), kim.getSavings()));
        System.out.println();
    }

    public static void combine_close(){
        kim.closeChecking();
        kim.closeSavings();
        System.out.println("Your combined balance is: $" + kim.getCombined(kim.getChecking(), kim.getSavings()));
    }

    public static void payroll(){
        kim.payroll_enterData();
        PayrollCalc.computeGrosspay();
        PayrollCalc.computeDeductions();
        PayrollCalc.computeNetpay();
        PayrollCalc.printCheck();
    }
}