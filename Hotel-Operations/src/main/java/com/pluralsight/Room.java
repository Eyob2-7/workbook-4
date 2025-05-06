package com.pluralsight;

public class Room {
    private boolean occupied;
    private int numberOfBeds;
    private double price;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }


    // Method for room Availability
    public boolean isAvailable() {
        return !this.isDirty() && !occupied;
    }

    // Method for check-in
    public void checkIn() {
        if (this.isAvailable()) {
            this.occupied = true;
            this.dirty = true;
            System.out.println("Check-in Successful.");
        } else {
            System.out.println("Sorry, you Can not check-in, the room is not available.");
        }
    }

    // Method to check out
    public void checkOut() {
       this.cleanRoom();
       occupied= false;
    }

    // Method for clean room
    public void cleanRoom() {
        dirty= false;
    }


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
}
