public class Bank {

    // variables
    private double checking;
    private double savings;

    // constructors
    // default constructor
    public Bank() {
        checking = 0.0;
        savings = 0.0;
    }

    // Overloaded Constructor


    // Methods
    // Set Method

    // getCheck
    public double getChecking(){
        return checking;
    }

    // get savings
    public double getSavings(){
        return savings;
    }

    // get combined


    // checking deposit
    public void checkingDeposit(double amount){
        checking += amount;
    }

    //savings deposit
    public void savingsDeposit(double amount){
        savings += amount;
    }

    // checking withdraw
    public void checkingWithdraw(double amount){
        checking -= amount;
    }

    // savings withdraw
    public void savingsWithdraw(double amount){
        savings -= amount;
    }

    // close checking

    // close savings



}
