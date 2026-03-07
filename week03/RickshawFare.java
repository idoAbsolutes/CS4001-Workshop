import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int baseFare = 50;
        int perKm = 20;
        int perMinute = 2;

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter travel time (minutes): ");
        int time = sc.nextInt();

        System.out.print("Is the customer local? (true/false): ");
        boolean isLocal = sc.nextBoolean();

        System.out.print("Is it night travel? (true/false): ");
        boolean isNight = sc.nextBoolean();

        
        double fare = baseFare + (distance * perKm) + (time * perMinute);

       
        double discount = (isLocal && distance >= 10) ? fare * 0.10 : 0;

       
        int surcharge = isNight ? 50 : 0;

     
        double totalFare = fare - discount + surcharge;


        System.out.println("\n");
        System.out.println("Total Fare: Rs. " + (int)totalFare);

        sc.close();
    }
}