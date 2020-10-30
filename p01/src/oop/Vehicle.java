package oop;

public class Vehicle {
    public void drivingVehicle(){
        System.out.println("Driving");
    }
    private int  maxSpeed = 240;
    private int  numberOfSeats;
    int getMaxSpeed() {
        return maxSpeed;
    }
    public int getNumberOfSeats(){
        return numberOfSeats;
    }
    public void setNumberOFSeats(int numberOFSeats){
       this.numberOfSeats = numberOFSeats;
    }
}
