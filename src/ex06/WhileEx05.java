package ex06;

public class WhileEx05 {
    public static void main(String[] args) {
        int n = 1;

        while (true) {

            if (n % 2 == 0) {
                System.out.println(n);
            }
            n = n + 1;
            if (n > 10) {
                break;
            }

        }
    }
}
