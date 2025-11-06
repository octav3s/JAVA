package MachineTest;
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int X =S.nextInt();

        System.out.println("Multiplication Table of " + X + ":");
        for(int i=1; i<=10; i++)
        {
            System.out.println(X + " x " + i + " = " + (X * i));
        }    
        S.close();
    }
}
