package ex07;

/* 
클래스 내부 변수(상태)는 선언만 한다.
*/
class 사람 {
    String name;
    int height;
    int weight;
}

public class OOPEx06 {
    public static void main(String[] args) {
        사람 s1 = new 사람();
        s1.name = "홍길동";
        s1.height = 50;
        s1.weight = 5;
        사람 s2 = new 사람();
        s2.name = "장보고";
        s2.height = 100;
        s2.weight = 8;
        사람 s3 = new 사람();
        s3.name = "임꺽정";
        s3.height = 70;
        s3.weight = 10;

        System.out.println("이름 : " + s1.name);
        System.out.println("키 : " + s1.height);
        System.out.println("몸무게 : " + s1.weight);
        System.out.println("이름 : " + s2.name);
        System.out.println("키 : " + s2.height);
        System.out.println("몸무게 : " + s2.weight);
        System.out.println("이름 : " + s3.name);
        System.out.println("키 : " + s3.height);
        System.out.println("몸무게 : " + s3.weight);
    }
}
