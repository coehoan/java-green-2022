package ex07;

class Car {
    int speed = 90;
}

public class OOPEx01 {

    public static void main(String[] args) {
        // new는 heap에 할당하라는 키워드
        // Car 클래스가 가지고있는 static이 아닌 모든 것들이 heap에 뜬다.
        Car aa = new Car();
        System.out.println(aa.speed);
    }
}
