import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bus Ticket Booking System ===");

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Bus Number: ");
        int busNo = sc.nextInt();

        System.out.print("Enter Number of Seats: ");
        int seats = sc.nextInt();

        System.out.println("\n--- Booking Details ---");
        System.out.println("Passenger Name : " + name);
        System.out.println("Bus Number     : " + busNo);
        System.out.println("Seats Booked   : " + seats);
        System.out.println("Booking Successful!");

        sc.close();
    }
}
