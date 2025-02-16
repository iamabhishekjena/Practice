package DesignPatterns.Behavioral.StrategyPattern.After;

import DesignPatterns.Behavioral.StrategyPattern.After.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObject;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveObject = driveStrategy;
    }

    public void drive(){
        driveObject.drive();
    }
}
