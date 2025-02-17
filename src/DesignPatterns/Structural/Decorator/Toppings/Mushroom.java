package DesignPatterns.Structural.Decorator.Toppings;

import DesignPatterns.Structural.Decorator.Pizzas.BasePizza;

public class Mushroom extends ToppingDecorator {

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+50;
    }
}
