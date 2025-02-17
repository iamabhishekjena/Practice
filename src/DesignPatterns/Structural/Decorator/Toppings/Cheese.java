package DesignPatterns.Structural.Decorator.Toppings;

import DesignPatterns.Structural.Decorator.Pizzas.BasePizza;

public class Cheese extends ToppingDecorator {

    BasePizza basePizza;

    public Cheese(BasePizza basePizza){
        this.basePizza= basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+40;
    }
}
