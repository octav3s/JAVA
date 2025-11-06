package ATM;
import java.util.Scanner;

    class Atm_sim {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int PIN = 1234;
        double balance = 1500.00;

        System.out.println("Enter your ATM PIN: ");
        int pin = scanner.nextInt();

        if (pin == PIN) {
            System.out.println("PIN accepted. You can now access your account.");
        } else {
            System.out.println("Incorrect PIN. Access denied.");
            return;
        }

        int option;
        
        do {

            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();

            switch (option) {

                case 1:
                    System.out.printf("Your current balance is: Rs%.2f", balance);
                    break;
                    
                case 2:
                    System.out.print("Enter amount to deposit: Rs");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("Successfully deposited Rs%.2f. New balance: Rs%.2f%n", depositAmount, balance);
                    }
                    
                    else {
                        System.out.println("Invalid amount or insufficient funds.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: Rs");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount > 0 && withdrawAmount <= balance) 
                    {
                        balance -= withdrawAmount;
                        System.out.printf("Successfully withdrew Rs%.2f. New balance: Rs%.2f%n", withdrawAmount, balance);
                    } 
                    
                    else {
                        System.out.println("Invalid insufficient funds.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Option invalid, please try again.");
            }

        } while (option != 4);

        scanner.close();

    }
}
