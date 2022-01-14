package ex06;

public class GugudanEx03 {
    public static void main(String[] args) {
        for (int step = 2; step < 10; step++) {
            for (int i = 1; i < 10; i++) {
                System.out.println(step + "*" + i + "=" + (step * i));
            }
            System.out.println("-------");
        }
    }
}
