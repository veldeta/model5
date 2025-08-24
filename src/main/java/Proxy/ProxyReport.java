package Proxy;

public class ProxyReport implements Report{

    private RealReport realImage;
    private String fileName;

    public ProxyReport(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void report() {
        if (realImage == null) {
            realImage = new RealReport(fileName);
        }
        realImage.report();
    }

}
