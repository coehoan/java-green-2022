package ex22;

class 사과 {
    String name = "사과";
}

class 딸기 {
    String name = "딸기";
}

class 오렌지 {
    String name = "오렌지";
}

class FruiteBox<T> {
    T data;

    public FruiteBox(T data) {
        this.data = data;
    }
}

public class GenericEx01 {
    public static void main(String[] args) {
        FruiteBox<사과> rb1 = new FruiteBox<사과>(new 사과());
        FruiteBox<딸기> rb2 = new FruiteBox<딸기>(new 딸기());
        FruiteBox<오렌지> rb3 = new FruiteBox<오렌지>(new 오렌지());
        System.out.println(rb1.data.name);
        System.out.println(rb2.data.name);
        System.out.println(rb3.data.name);
    }
}
