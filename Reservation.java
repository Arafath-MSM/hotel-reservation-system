// I certify the code of this lab is entirely my own work,
// but I received assistance from [Bard].
// ArrayList learned from [https://www.w3schools.com/java/tryjava.asp?filename=demo_arraylist_add]


import java.util.ArrayList;
import java.util.Scanner;

public class Reservation {
    private int bookingNumber;
    private String roomType;
    private String breakfast;
    private int price;

    public Reservation(int bookingNumber, String roomType, String breakfast) {
        this.bookingNumber = bookingNumber;
        this.roomType = roomType;
        this.breakfast = breakfast;
        this.price = calculatePrice();
    }

    private int calculatePrice() {
        if (this.roomType.equals("single")) {
            this.price = 1000;
        } else if (this.roomType.equals("double")) {
            this.price = 2000;
        }

        if (this.breakfast.equals("Y")) {
            this.price += 200;
        }

        return this.price;
    }

    public void bookRoom() {
        System.out.println("Room booked. Pay: " + this.price);
    }

    public static void main(String[] args){

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Create an ArrayList to store the reservations
        ArrayList<Reservation> reservations = new ArrayList<Reservation>();

        // Keep looping until the receptionist closes
        while (true) {
            // Ask the user for the booking number
            System.out.print("Welcome to the hotel reservation system! " + '\n' + "Enter the booking number: ");
            int bookingNumber = input.nextInt();

            // Ask the user for the room type
            System.out.print("Enter the room type: ");
            String roomType = input.next();

            // Ask the user whether they want breakfast
            System.out.print("Do you want breakfast (Y/N)? ");
            String breakfast = input.next();

            // Create a Reservation object
            Reservation reservation = new Reservation(bookingNumber, roomType, breakfast);

            // Book the room
            reservation.bookRoom();

            // Add the reservation to the ArrayList
           // reservations.add(reservation); // We can change this reservation array as we want that's why here ArrayLIst is used...

            // Check if the receptionist wants to close
            System.out.print("Do you want to close (Y/N)? ");
            if (input.next().equals("Y")) {
                break;
            }
        }

     /*   // Print the list of reservations
        for (Reservation reservation : reservations) {
            System.out.println(reservation.bookingNumber + " " + reservation.roomType + " " + reservation.breakfast + " " + reservation.price);
        }  */
    }
}
