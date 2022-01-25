package CoffeeMaker;

import java.util.List;

public class Menu {
    // 메뉴 내용 저장 & 있는 메뉴인지 찾아줌.
    private List<MenuItem> items;

    public Menu(List<MenuItem> menuItem) {
        this.items = menuItem;
    }

    public MenuItem choose(String menuName) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName() == menuName) {
                return items.get(i);
            }
        }
        return null;
    }

    public List<MenuItem> getMenuItem() {
        return items;
    }
}
