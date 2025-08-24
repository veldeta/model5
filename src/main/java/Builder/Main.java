package Builder;

public class Main {
    public static void main (String[]args) {
        CarConstruction carConstruction = new CarConstruction.CarConstructionBuilder()
                .withEngine("electric")
                .withAge(2017)
                .withBody_type("sedan")
                .build();
        System.out.println(carConstruction.toString());
    }
}
