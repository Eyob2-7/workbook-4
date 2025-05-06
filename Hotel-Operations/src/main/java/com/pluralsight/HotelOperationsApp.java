package com.pluralsight;

import java.util.Scanner;

public class HotelOperationsApp {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // ======= ROOM SETUP =======
        System.out.println("---- ROOM SETUP ----");
        System.out.print("Enter number of beds: ");
        int beds = input.nextInt();

        System.out.print("Enter room price: ");
        double price = input.nextDouble();

        System.out.print("Is the room occupied? (true/false): ");
        boolean occupied = input.nextBoolean();

        System.out.print("Is the room dirty? (true/false): ");
        boolean dirty = input.nextBoolean();

        Room room = new Room(beds, price, occupied, dirty);

        // First guest check-in attempt
        System.out.println("\nChecking in first guest...");
        room.checkIn();

        // First guest checks out
        System.out.println("Checking out first guest...");
        room.checkOut();

        // Try to check in again while room is dirty
        System.out.println("Attempting second check-in while room is dirty...");
        room.checkIn();  // should fail

        // Clean the room
        System.out.println("Cleaning the room...");
        room.cleanRoom();

        // Try to check in again now that room is clean
        System.out.println("Second check-in attempt after cleaning...");
        room.checkIn();  // should succeed

        System.out.println("Room available: " + room.isAvailable());
        System.out.println();

        // ======= RESERVATION =======
        input.nextLine(); // clear newline
        System.out.println("---- RESERVATION ----");
        System.out.print("Enter room type (king/double): ");
        String roomType = input.nextLine();

        System.out.print("Enter number of nights: ");
        int nights = input.nextInt();

        System.out.print("Is it a weekend stay? (true/false): ");
        boolean weekend = input.nextBoolean();

        Reservation reservation = new Reservation(roomType, nights, weekend);
        System.out.println("Reservation total: $" + reservation.getReservationTotal());
        System.out.println();

        // ======= EMPLOYEE TEST =======
        input.nextLine(); // clear newline
        System.out.println("---- EMPLOYEE SETUP ----");
        System.out.print("Enter Employee ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();

        System.out.print("Enter Department: ");
        String dept = input.nextLine();

        System.out.print("Enter Pay Rate: ");
        double rate = input.nextDouble();

        Employee employee = new Employee(id, name, dept, rate, 0);

        System.out.print("\nEnter punch-in time (e.g. 9.0): ");
        double inTime = input.nextDouble();
        employee.punchIn(inTime);

        System.out.print("Enter punch-out time (e.g. 17.5): ");
        double outTime = input.nextDouble();
        employee.punchOut(outTime);

        // Display employee summary
        System.out.println("\n--- EMPLOYEE SUMMARY ---");
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Regular Hours: " + employee.getRegularHours());
        System.out.println("Overtime Hours: " + employee.getOverTimeHours());
        System.out.println("Total Pay: $" + employee.getTotalPay());

    }
}
