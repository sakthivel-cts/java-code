package org.example.structuraldesignpatterns;

interface Printer {
    void print();
}

class OldPrinter {

    public void printFile() {
        System.out.println("Printed");
    }
}

class PrinterAdapter implements Printer {

    private final OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    public void print() {
        oldPrinter.printFile();
    }
}

public class AdapterPattern {

    public static void main(String[] args) {

        OldPrinter oldPrinter = new OldPrinter();
        PrinterAdapter printer = new PrinterAdapter(oldPrinter);

        printer.print();
    }
}