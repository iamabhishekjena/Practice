package DesignPatterns.Behavioral.StrategyPattern.After;

import DesignPatterns.Behavioral.StrategyPattern.After.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{

    NormalVehicle(){super(new NormalDriveStrategy());}
}
