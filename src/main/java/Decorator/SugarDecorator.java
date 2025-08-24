package Decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee c){
        super(c);
    }
    @Override
    public double cost(){
        return super.cost()+10.0;
    }
}
