package day9;

import java.util.Scanner;

abstract class Ride{
    abstract int calculateFare (int distance);

    void rideType(){
        System.out.println("This is a generic ride.");
    }
}

class Autoride extends Ride{
    @Override
    int calculateFare(int distance) {
        return distance * 5;
    }

    @Override
    
    void rideType() {
        System.out.println("Auto ride.");
    }
}

class CarRide extends Ride{
    @Override
    int calculateFare(int distance) {
        return distance * 10;
    }

    @Override
    void rideType() {
        System.out.println("Car ride.");
    }
}

public class BookingApp{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ride type (auto/car): ");
        String rideType = scanner.nextLine();

        System.out.println("Enter distance (in km): ");
        int distance = scanner.nextInt();

        Ride ride;
        if(rideType.equals("auto")){
            ride = new Autoride();
        } 

        else if(rideType.equals("car")){
            ride = new CarRide();
        }
        
        else {
            System.out.println("Invalid ride type.");
            scanner.close();
            return;
        }

        ride.rideType();
        int fare = ride.calculateFare(distance);
        System.out.println("Total fare for " + distance + " km: " +"Rs."+ fare);

        scanner.close();
    }
} 

