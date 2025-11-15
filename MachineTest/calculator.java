package MachineTest;

import java.util.Scanner;

class calculations {

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Error, cannot divide by zero.");
            return 0;
        }
        return x / y;
    }
}

public class calculator {
    public static void main(String[] args) 
    {
        Scanner C = new Scanner(System.in);

        calculations calc = new calculations();

        System.out.print("Enter first number: ");
        double N1 = C.nextDouble();
        System.out.print("Enter second number: ");
        double N2 = C.nextDouble();

        System.out.println("Addition: " + calc.add(N1, N2));
        System.out.println("Subtraction: " + calc.subtract(N1, N2));
        System.out.println("Multiplication: " + calc.multiply(N1, N2));
        System.out.println("Division: " + calc.divide(N1, N2));

        C.close();
    }
}