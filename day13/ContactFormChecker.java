package day13;

import java.util.Scanner;

public class ContactFormChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        System.out.println("\nValidation Results:");

        if (name.matches("[A-Z][a-zA-Z ]*")) {

            System.out.println("Name is valid.");
        }
        
        else {

            System.out.println("Invalid name. It should start with a capital letter and contain only letters or spaces.");
        }

        if (email.matches("^[^@.][\\w.-]+@\\w+\\.\\w+[^@.]$")) {

            System.out.println("Email is valid.");
        } 
        
        else {

            System.out.println("Invalid email format.");
        }

        if (phone.matches("\\d{10}")) {
            
            System.out.println("Phone number is valid.");
        } 
        
        else {
            System.out.println("Invalid phone number. Must contain exactly 10 digits.");
        }

        scanner.close();
    }
}
