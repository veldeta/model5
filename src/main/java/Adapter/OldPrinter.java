package Adapter;

public class OldPrinter implements OldDevice{
    @Override
    public void printOldStyle() {
        System.out.println("Printing in old style");
    }
}
