package SOLID.InterfaceSegregation.After;

public class SimplePrinter implements Printer{
    @Override
    public void printDocument() {
        System.out.println("Printing document...");
    }
}
