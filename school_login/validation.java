package school_login;
import java.util.Scanner;

public class validation {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        System.out.println("Enter your ID: ");
        String id = scanner.nextLine();
        
        scanner.close();

        if (username.equals("A") && password.equals("1234") && id.equals("1")) 
        {
            System.out.println("Welcome Admin. Full access granted.");
        } 
        
        else if (username.equals("S") && password.equals("1111") && id.equals("2")) 
        {
            System.out.println("Welcome Student. Limited access granted.");
        }

        else if (id.equals("3")) 
        {
            System.out.println("Welcome Guest. View-only access.");
        }

        else {
            System.out.println("Invalid credentials or role.");
        }
    }
}
