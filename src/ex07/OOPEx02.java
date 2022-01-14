package ex07;

class Doctor {
    String name = "홍길동";
    int sal = 5000;
}

public class OOPEx02 {
    public static void main(String[] args) {
        Doctor inf = new Doctor();
        System.out.println(inf.name);
        System.out.println(inf.sal);
    }
}
