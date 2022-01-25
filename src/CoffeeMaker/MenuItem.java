package CoffeeMaker;

public class MenuItem {
    // 메뉴 이름, 가격 getter
    private String name; // 메뉴 이름
    private int price; // 메뉴 가격

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
