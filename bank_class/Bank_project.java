public class Bank_project {
    public static void main(String args[]){
        Bank kim = new Bank(50,50);

        kim.checkingDeposit(20.0);
        kim.savingsDeposit(30.0);
        System.out.println("Your current checking balance is: $" + kim.getChecking());
        System.out.println("Your current savings balance is: $" + kim.getSavings());
        System.out.println();

        kim.checkingWithdraw(10.0);
        kim.savingsWithdraw(20.0);
        System.out.println("Your current checking balance is: $" + kim.getChecking());
        System.out.println("Your current savings balance is: $" + kim.getSavings());
        System.out.println();

        System.out.println("Your combined balance is: $" + kim.getCombined(kim.getChecking(), kim.getSavings()));
        System.out.println();

        kim.closeChecking();
        kim.closeSavings();
        System.out.println("Your combined balance is: $" + kim.getCombined(kim.getChecking(), kim.getSavings()));

    }
}