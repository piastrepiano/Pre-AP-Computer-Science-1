import java.util.Scanner;
import java.text.*;

//utilize the Calc class for any and all calculations between all the classes.

public class Payroll{
    public static void main(String args[]){
        PayrollCalc.computeGrosspay();
        PayrollCalc.computeDeductions();
        PayrollCalc.computeNetpay();
        PayrollCalc.printCheck();
    }
}

class PayrollCalc{
    private static String employeeName;
    private static double hoursWorked;
    private static double hourlyRate;
    private static int numDependants;
    private static double regularPay;
    private static double overtimePay;
    private static double taxRate;
    private static double grossPay;
    private static double taxDeductions;
    private static double netPay;

    public static void enterData(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\n\nEnter Name  ===>>  ");
        employeeName = keyboard.nextLine();
        System.out.print("Enter Hours Worked  ===>>  ");
        hoursWorked = keyboard.nextDouble();
        System.out.print("Enter Hourly Rate   ===>>  ");
        hourlyRate = keyboard.nextDouble();
        System.out.print("Enter Dependants    ===>>  ");
        numDependants = keyboard.nextInt();
    }

    public static void computeGrosspay(){
        // determines whether you need overtime pay
        //qualify overtime pay
        if (hoursWorked > 40)
        {
            double overtimeHours = Calc.sub(hoursWorked, 40);
            regularPay = Calc.mul(40, hourlyRate);
            overtimePay = Calc.mul(Calc.mul(overtimeHours, hourlyRate), 1.5);
        }
        //doesn't qualify for overtime pay
        else
        {
            regularPay = Calc.mul(hoursWorked, hourlyRate);
            overtimePay = 0;
        }

        grossPay = Calc.add(regularPay, overtimePay);
    }

    public static void computeDeductions(){
        switch (numDependants)
        //	compute proper tax rate based on declared
        //  dependants everybody gets 0.075 tax rate if
        // 	dependants are greater than 5
        {
            case 0 : taxRate = 0.295; break;
            case 1 : taxRate = 0.249; break;
            case 2 : taxRate = 0.187; break;
            case 3 : taxRate = 0.155; break;
            case 4 : taxRate = 0.126; break;
            case 5 : taxRate = 0.100; break;
            default: taxRate = 0.075;
        }
        taxDeductions = Calc.mul(grossPay, taxRate);
    }

    public static void computeNetpay(){
        netPay = Calc.sub(grossPay, taxDeductions);
    }


    // print entered and calculated information
    public static void printCheck(){
        DecimalFormat output = new DecimalFormat("$0.00");
        System.out.println("\n\nName:           " + employeeName);
        System.out.println("Hourly rate:    " + output.format(hourlyRate));
        System.out.println("Hours worked:   " + hoursWorked);
        System.out.println("Dependants:   	" + numDependants);
        System.out.println("Tax rate:       " + output.format(taxRate));
        System.out.println("Regular pay:  	" + output.format(regularPay));
        System.out.println("Overtime pay: 	" + output.format(overtimePay));
        System.out.println("Gross pay:    	" + output.format(grossPay));
        System.out.println("Deductions:   	" + output.format(taxDeductions));
        System.out.println("Net pay:      	" + output.format(netPay));
    }
}