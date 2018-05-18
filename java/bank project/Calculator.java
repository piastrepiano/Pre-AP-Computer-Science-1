public class Calculator {
    public static void main(String args[]){
        double number1 = 5;
        double number2 = 4;
        System.out.println("ADD: " + Calc.add(number1, number2));
        System.out.println("SUBTRACT: " + Calc.sub(number1, number2));
        System.out.println("MULTIPLY: " + Calc.mul(number1, number2));
        System.out.println("DIVIDE: " + Calc.div(number1, number2));
        System.out.println("MODULE: " + Calc.mod(number1, number2));
        System.out.println("POWER: " + Calc.pow(number1, number2));
    }
}

class Calc{
    public static double add(double n1, double n2){
        return n1 + n2;
    }

    public static double sub(double n1, double n2){
        return n1 -n2;
    }

    public static double mul(double n1, double n2){
        return n1 * n2;
    }

    public static double div(double n1, double n2){
        return n1 / n2;
    }

    public static double mod(double n1, double n2){
        return n1 % n2;
    }

    public static double pow(double n1, double n2){
        return Math.pow(n1, n2);
    }
}
