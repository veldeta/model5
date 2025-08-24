package Strategy;

public class FuelType implements Fuel {
    @Override
    public void fuel() {
        System.out.println("Auto class: petrol");

    }
}
class FuelTypeElectricity implements Fuel {
    @Override
    public void fuel() {
        System.out.println("Auto class: electricity");
    }
}
class FuelTypeHybrid implements Fuel {
    @Override
    public void fuel() {
        System.out.println("Auto class: Hybrid");
    }
}
