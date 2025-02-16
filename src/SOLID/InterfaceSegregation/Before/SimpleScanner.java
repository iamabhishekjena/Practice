package SOLID.InterfaceSegregation.Before;

public class SimpleScanner implements Printer{
    @Override
    public void printDocument() {

    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning document...");
    }

    @Override
    public void faxDocument() {

    }
}
