package ex00;

// 계산기
// 상태와 행위는 필수요소는 아니다.
class Calculator {

    // add 뒤에 ()는 입구
    // void는 출구가 없다.
    void add(int n1, int n2) {
        System.out.println("더하기 메서드입니다.");
        System.out.println(n1 + n2);
    }

    void minus(int n1, int n2) {
        System.out.println("마이너스 메서드입니다.");
        System.out.println(n1 - n2);
    }

    void multi(int n1, int n2) {
        System.out.println("곱하기 메서드입니다.");
        System.out.println(n1 * n2);

    }

    void divide(int n1, int n2) {
        System.out.println("나누기 메서드입니다.");
        System.out.println(n1 / n2);
    }
}

public class MethEx01 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(10, 5);
        c1.minus(10, 5);
        c1.multi(10, 5);
        c1.divide(10, 5);
    }
}
