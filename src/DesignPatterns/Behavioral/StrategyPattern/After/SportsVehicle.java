package DesignPatterns.Behavioral.StrategyPattern.After;

import DesignPatterns.Behavioral.StrategyPattern.After.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle(){super(new SportsDriveStrategy());}
}
