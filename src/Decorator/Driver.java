package Decorator;

public class Driver {

    public static void main(String[] args){
        Burger burger = new ZingerBurger();
        System.out.println(burger.getDescription());
        System.out.println(burger.getCost());

        burger = new ExtraCheese(burger);
        System.out.println(burger.getDescription());
        System.out.println(burger.getCost());

        burger = new ExtraMayo(burger);
        System.out.println(burger.getDescription());
        System.out.println(burger.getCost());
    }

}
