package com.pluralsight;

public class HotelOperationsApp {

    public static void main(String[] args) {
        // Test Room class
        Room room = new Room(1, 100, false, false);
        System.out.println("Testing Room class");
        System.out.println("Number of Beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");

        // Test Reservation class
        Reservation reservation = new Reservation("king", 4, true);
        System.out.println("Testing Reservation class");
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Number of nights: " + reservation.getNumberOfNights());
        System.out.println("Is Weekend: " + reservation.isWeekend());
        System.out.println("Total Cost: $" + reservation.getReservationTotal());
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");

        // Test Employee class
        Employee employee = new Employee(1234, "Kevin Hart", "Maintenance", 25.99, 46);
        System.out.println("Testing Employee class");
        System.out.println("Employee Id: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Pay Rate: $" + employee.getPayRate() + "/hour");
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Overtime Hours Worked: " + employee.getOverTimeHours());
        System.out.println("Total Pay: $" + employee.getTotalPay());

    }
}
