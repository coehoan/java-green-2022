package CoffeeMaker;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        CustomerA customerA = new CustomerA("홍길동");
        BaristaA baristaA = new BaristaA("공유");

        // 개별 메뉴 생성함
        MenuItem m1 = new MenuItem("아메리카노", 1500);
        MenuItem m2 = new MenuItem("카페라떼", 2000);
        MenuItem m3 = new MenuItem("마끼야또", 4000);
        MenuItem m4 = new MenuItem("카페모카", 4000);

        // 생성된 메뉴아이템을 리스트에 담아줌.
        List<MenuItem> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        Menu menu = new Menu(list);

        customerA.order("아메리카노", menu, baristaA);
    }
}
