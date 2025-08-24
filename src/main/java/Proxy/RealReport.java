package Proxy;

public class RealReport implements Report{
    private String fileName;

    public RealReport(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void report() {
        System.out.println("Last report: " + fileName);
    }

    private void loadFromDisk() {
        System.out.println("Loading last report from disk: " + fileName);
    }
}
