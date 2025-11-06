package MachineTest;
import java.util.Scanner;

public class nPattern {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows to print: ");

        int N =scan.nextInt();

        for(int i=0; i<N; i++)
        {
            for(int j=0; j<=i; j++)
            {
            
                System.out.print("*");
            }
            System.out.println();

            
        }    scan.close();

    }
}
