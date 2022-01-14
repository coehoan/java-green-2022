package ex11;

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {

    // int가 안들어왔을때 실행 Line 27
    void sleep() {
        System.out.println(this.name + " zzz");
    }

    // int가 들어왔을때 실행 Line 28 ok dz?
    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for" + hour + "hours");
    }

    // String이 들어왔을때 실행
    void sleep(String str) {
        System.out.println(this.name + " " + str);
    }
}

public class ExtendsEx04 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("happy");
        dog.sleep(); // happy zzz in house 출력
        dog.sleep(99); // happy zzz in house for 3 hours 출력
        dog.sleep("안잔다 임마");
    }
}