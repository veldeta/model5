package Adapter;

public class Main {
    public static void main (String[]ages){
        OldDevice oldPrinter = new OldPrinter();
        NewDevice adapterPrinter = new DeviceAdapter(oldPrinter);
        adapterPrinter.printNewStyle();
    }
}
