package org.example.creationaldesignpatterns;

public class RBIFactory {

    public static RBIBank getBank(String bankName){
        if (bankName.equals("canara")) return new CanaraBank();
        else return new SBIBank();
    }
}