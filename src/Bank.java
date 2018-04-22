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
    public Bank(double check, double save) {
        checking = check;
        savings = save;
    }

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
    public double getCombined(double checking, double savings){
        //double balance = checking + savings;
        return checking + savings;
    }

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
    public void closeChecking() {
        checking = 0.0;
    }

    // close savings
    public void closeSavings() {
        savings = 0.0;
    }

}