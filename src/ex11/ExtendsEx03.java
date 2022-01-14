package ex11;

// 1. start 메서드에서 name을 출력해보세요!!
// 2. start 메서드에서 name 값을 변경해서 출력해보세요!!
class 애완동물 {
    void sound() {
    }

    void printName() {
    }

    void changeName() {
    }
}

class 강아지 extends 애완동물 {

    String name = "강아지";

    void sound() {
        System.out.println("멍멍");
    }
}

class 고양이 extends 애완동물 {

    String name = "고먐미"; // 난 바꿈 이게아닌듯

    void printName() {
        System.out.println(name);
        System.out.println("=============== 1");
    }

    void sound() {
        System.out.println("야옹");
    }

    void changeName() {
        name = "네모네모빔에맞은고먐미";
        System.out.println(name);
        System.out.println("=============== 2");
    }

}

public class ExtendsEx03 {

    static void start(애완동물 u1) {
        u1.sound();
        u1.printName();
        u1.changeName();
        u1.printName();
    }

    public static void main(String[] args) {
        고양이 cat = new 고양이();
        애완동물 dog = new 강아지();

        start(cat);
        start(dog);
    }
}