package DesignPatterns.Structural.Decorator;

import DesignPatterns.Structural.Decorator.Pizzas.BasePizza;
import DesignPatterns.Structural.Decorator.Pizzas.Farmhouse;
import DesignPatterns.Structural.Decorator.Pizzas.Margherita;
import DesignPatterns.Structural.Decorator.Toppings.Cheese;
import DesignPatterns.Structural.Decorator.Toppings.Mushroom;

public class Pizzeria {

    public static void main(String args[]){
        BasePizza pizza1 = new Cheese(new Farmhouse());
        System.out.println("Cost of pizza 1: "+pizza1.cost());

        BasePizza pizza2 = new Cheese(new Mushroom(new Margherita()));
        System.out.println("Cost of pizza 2: "+pizza2.cost());
    }
}
