package registration;

import java.util.Scanner;

class WelcomeForm {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        scanner.close();

        System.out.println("Welcome " + firstName +"!");
        System.out.println("Your age is " + age+" years old.");
    }
}