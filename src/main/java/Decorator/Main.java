package Decorator;

public class Main {
    public static void main (String[]args){
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Coffee: " + simpleCoffee.cost());

        Coffee milkCoffee = new MilkDecoratot(simpleCoffee);
        System.out.println("Coffee and milk: " + milkCoffee.cost());

        Coffee sugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println("coffee milk and sugar: " + sugarCoffee.cost());
    }
}
