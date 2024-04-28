package Decorator;

public class ExtraCheese extends BurgerDecorator {

    private Burger burger;
    ExtraCheese(Burger burger){
        this.burger = burger;
    }
    @Override
    public String getDescription() {
        return burger.getDescription() + ", " + "with extra cheese......";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 10.0;
    }
}
