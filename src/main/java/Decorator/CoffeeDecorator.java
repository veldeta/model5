package Decorator;

public class CoffeeDecorator extends Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee c){
        this.coffee = c;
    }

    @Override
    public double cost() {
        return coffee.cost();
    }
}
