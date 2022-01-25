package CoffeeMaker;

abstract class Customer {
    public void order(String menuName, Menu menu, Barista baristaA) {
    }
}

public class CustomerA extends Customer {

    String name;

    public CustomerA(String name) {
        this.name = name;
    }

    public void order(String menuName, Menu menu, Barista barista) {

        // 손님 -> 메뉴판에 메세지를 보냄.
        MenuItem menuItem = menu.choose(menuName);

        if (menuItem == null) {
            System.out.println("없는 메뉴입니다.");
        } else {
            // 손님 -> 바리스타에게 메세지를 보냄.
            Coffee coffee = barista.makeCoffee(menuItem);
            System.out.println(name + "이 " + coffee.getPrice() + "원 " + coffee.getName() + "를 받았습니다.");
        }
    }
}
