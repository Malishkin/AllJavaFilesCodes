package oop;

public class MainVehicle {
    void useVehicle(Vehicle vehicle){
        vehicle.drivingVehicle();
        System.out.println(vehicle.getNumberOfSeats());
    }
    public static void main(String[] args) {
//        MainVehicle mainVehicle = new MainVehicle();
//        mainVehicle.useVehicle(new Toyota());
//        Toyota toyota = new Toyota();
//        System.out.println(toyota.getMaxSpeed());
////        System.out.println(toyota.getNumberOfSeats());
//        mainVehicle.useVehicle(toyota);
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setNumberOFSeats(5);
        System.out.println(vehicle1.getNumberOfSeats());
        Vehicle vehicle2 = new Vehicle();
        vehicle2.setNumberOFSeats(6);
        System.out.println(vehicle2.getNumberOfSeats());
    }


}
