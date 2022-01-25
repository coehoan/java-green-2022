package CoffeeMaker;

abstract class Barista {
    public Coffee makeCoffee(MenuItem menuItem) {
        return null;
    }
}

public class BaristaA extends Barista {

    String name;

    public BaristaA(String name) {
        this.name = name;
    }

    // menuItem 받아서 Coffee 생성자 생성.
    public Coffee makeCoffee(MenuItem menuItem) {
        return new Coffee(menuItem);
    }
}
