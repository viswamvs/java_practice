package Decorator;

public class ExtraMayo extends BurgerDecorator{
    private Burger burger;

    ExtraMayo(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", " + "with mayo......";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 30.0;
    }
}
