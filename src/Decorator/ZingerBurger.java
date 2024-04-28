package Decorator;

public class ZingerBurger extends Burger {

    public String getDescription(){
        return "Zinger Burger ";
    }

    @Override
    public double getCost() {
        return 180;
    }
}
