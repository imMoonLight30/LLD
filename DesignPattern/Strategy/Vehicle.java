package DesignPattern.Strategy;

public class Vehicle {
    //has - a relationship with DriveStragy
    DriveStrategy ds;
    //constructor injection
    Vehicle(DriveStrategy ds){
        this.ds=ds;
    }

    public void drive(){
        ds.drive();
    }
}
