package SOLID.InterfaceSegregation.Before;

public class SimplePrinter implements Printer{
    @Override
    public void printDocument() {
        System.out.println("Printing document...");
    }

    @Override
    public void scanDocument() {

    }

    @Override
    public void faxDocument() {

    }
}
