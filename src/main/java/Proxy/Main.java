package Proxy;

public class Main {
    public static void main(String[] args) {
        Report image = new ProxyReport("Last report.txt");

        image.report();
        image.report();
    }
}
