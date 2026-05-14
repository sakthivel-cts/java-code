package org.example.creationaldesignpatterns;

class ClonableClass implements Cloneable {
    String name;

    public ClonableClass(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class PrototypeDesignPattern {

    public static void main(String[] args) throws CloneNotSupportedException {

        ClonableClass obj1 = new ClonableClass("Sakthivel");

        ClonableClass obj2 = (ClonableClass) obj1.clone();

        ClonableClass obj3 = obj1;

        System.out.println(obj1.name);

        obj1.name = "vel";
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj3.name);

        System.out.println(obj1 == obj2);
        System.out.println(obj1 == obj3);
    }
}