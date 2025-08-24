package Decorator;

public class MilkDecoratot extends CoffeeDecorator{
    public MilkDecoratot(Coffee c){
        super(c);
    }
    @Override
    public double cost(){
        return super.cost()+ 20.0;
    }
}
