package day7;

import java.util.*;
import java.time.LocalDateTime;

public class grocerystore {

    public static void main(String[] args) {

        String[] Items = { "Rice", "Sugar", "Oil", "Soap", "Milk" };
        int Prices[] = { 50, 40, 100, 25, 30 };
        int[] qty = new int[Items.length];
        int total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Available Items:");
        for (int i = 0; i < Items.length; i++) {
            System.out.println(Items[i] + " - Rs." + Prices[i]);
        }

        for (int i = 0; i < Items.length; i++) {
            System.out.print("Enter quantity for " + Items[i] + ": ");
            qty[i] = sc.nextInt();
            total += qty[i] * Prices[i];
        }

        if (total > 500)
            total *= 0.9; // Apply 10% discount

        System.out.println("\nTotal: Rs. " + total);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Purchase Date & Time: " + now);

        sc.close();
    }
}