package org.example.basicconcepts;

abstract class RBI {

    protected String name;

    private RBI() {}

    public RBI(String name) {
        this.name = name;
    }

    public abstract void balance();

    public void displayCard() {
        System.out.println("RBI Bank");
    }
}


class SBI extends RBI {

    public SBI(String name) {
        super(name);
    }

    @Override
    public void balance() {
        System.out.println("100");
    }

    @Override
    public void displayCard() {
        System.out.println("SBI Bank");
    }

    public String getName() {
        return super.name;
    }
}


public class AbstractClasses {

    public static void main(String[] args) {

        RBI bank = new SBI("Sakthivel");

        bank.balance();
        bank.displayCard();
    }
}
