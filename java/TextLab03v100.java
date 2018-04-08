/**
 * Kim Luong
 * Computer Science Period 3
 * Assignment: TextLab03
 *  Version: 100 Point
 *  Purpose: Using Math classes
 */
public class TextLab03v100{
    public static void main(String args[]){
        System.out.println("Text Lab 03, version 100\n");
        double principal =259000;   //P
        double annualRate= 5.75;
        double numYears=30;
        double monPyr=12;
        double monthlyPay;
        double ttlInterest;
        double ttlPrice;            //total payment 
        double annualDecimal;
        double monthlyRate;
        double numMonths;

        System.out.println("Principal: " + principal);
        System.out.println("Annual Rate: " + annualRate  + "%");
        System.out.println("Number of Years: " + numYears);

        annualDecimal= annualRate * Math.pow(10,-2);
        monthlyRate = annualDecimal / monPyr;       //R
        numMonths = numYears * monPyr;              //N

        //Equation: monthPay=[(r*(1+r)^N)/((1+R)^N-1)]*P
        monthlyPay=((monthlyRate * Math.pow(1+monthlyRate,numMonths))/(Math.pow(1+monthlyRate,numMonths)-1))* principal;
        //Rounding to nearest cent: scaling it up, then scaling it back down
        monthlyPay = Math.round(monthlyPay * 100.0) / 100.0;
        System.out.println("Monthly Payment: " + monthlyPay);

        //TOTAL AMOUNT PAID
        ttlPrice = monthlyPay * numMonths;
        System.out.println("Total Payment: " + ttlPrice);

        //TOTAL INTEREST
        //Equation: Ttl=M*N-P
        ttlInterest= (monthlyPay * numMonths) - principal;
        System.out.println("Total Interest: " + ttlInterest);
    }
}