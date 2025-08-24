package Strategy;

public class Auto implements Fuel{
    Fuel fuel;
    @Override
    public void fuel() {
        fuel.fuel();
    }
}
