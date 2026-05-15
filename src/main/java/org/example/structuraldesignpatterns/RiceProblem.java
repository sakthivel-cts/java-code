package org.example.structuraldesignpatterns;

interface Lunch{
    String getDescription();
}

class Rice implements Lunch {
    public String getDescription() {
        return "Rice";
    }
}

abstract class LunchDecorator implements Lunch {
    protected Lunch lunch;

    public LunchDecorator(Lunch lunch) {
        this.lunch = lunch;
    }
}

class Sambar extends LunchDecorator {

    public Sambar(Lunch lunch) {
        super(lunch);
    }

    public String getDescription() {
        return lunch.getDescription().concat(" + Sambar");
    }
}

class Curd extends LunchDecorator {

    public Curd(Lunch lunch) {
        super(lunch);
    }

    public String getDescription() {
        return lunch.getDescription().concat(" + Curd");
    }
}

public class RiceProblem {

    public static void main(String[] args) {

        Lunch rice = new Rice();
        System.out.println(rice.getDescription());

        Lunch riceWithSambar = new Sambar(rice);
        System.out.println(riceWithSambar.getDescription());

        Lunch curdWithSambarAndRice = new Curd(riceWithSambar);
        System.out.println(curdWithSambarAndRice.getDescription());

        Lunch curdWithRice = new Curd(rice);
        System.out.println(curdWithRice.getDescription());
    }
}