package DesignPattern.Strategy;

public class PassengerVehicle extends Vehicle {
    
    PassengerVehicle(){
        super(new NormalDrive());
    }
}
