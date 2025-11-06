package excercise;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            int next = a + b;
            System.out.print(a+" ");
            a = b;
            b = next;
        }
    }
}