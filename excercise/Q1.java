package excercise;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = reader.nextInt();

        System.out.println("Your entered number is: " + number);

        reader.close();
    }
}
