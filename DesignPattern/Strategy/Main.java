package DesignPattern.Strategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle= new SportsVehicle();
        vehicle.drive();

        Vehicle nor= new PassengerVehicle();
        nor.drive();
    }

}
