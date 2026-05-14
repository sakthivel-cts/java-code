package org.example.structuraldesignpatterns;

interface Pizza {
    String getDescription();
    int getCost();
}


abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}


class BasicPizza implements Pizza {

    public String getDescription() {
        return "This is a basic pizza";
    }

    public int getCost() {
        return 100;
    }
}


class CheesePizzaDecorator extends PizzaDecorator {

    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return "This is a cheese pizza";
    }

    public int getCost() {
        return pizza.getCost() + 20;
    }
}


public class DecoratorPattern {

    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());


        Pizza cheesePizza = new CheesePizzaDecorator(pizza);
        System.out.println(cheesePizza.getDescription());
        System.out.println(cheesePizza.getCost());
    }
}