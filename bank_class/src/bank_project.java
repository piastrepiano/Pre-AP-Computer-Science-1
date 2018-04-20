public class bank_project {
    public static void main(String args[]){
        Bank kim = new Bank();

        kim.checkingDeposit(20.0);
        System.out.print("Your current checking balance is: " + kim.getChecking());
    }
}
