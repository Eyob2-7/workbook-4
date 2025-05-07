package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // Constructor 1
    public Hotel(String name,int numberOfSuites, int numberOfRooms) {
        this.name=name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // Constructor 2
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // Method: try to book rooms, return true if successful
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        int available = isSuite?getAvailableSuites():getAvailableRooms();
        if(numberOfRooms <= available){
            if(isSuite){
                this.bookedSuites+=this.numberOfRooms;
            }else{
                this.bookedBasicRooms+= this.numberOfRooms;
            }
            return true;
        }
        return false;
    }

    // Derived getter calculate and return number of suites available
    public int getAvailableSuites(){
       return this.numberOfSuites - this.bookedSuites;
    }

    // Derived getter calculate and return number of basic rooms available
    public int getAvailableRooms(){
        return this.numberOfRooms-this.bookedBasicRooms;

    }

    // Getters
    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

}
