package ex06;

public class ForEx01 {
    public static void main(String[] args) {
        int i = 1;
        for (int n = 1; n < 25; n = n + 1) {
            i = i * 2;

            if (n == 24) {
                System.out.println(i);
            }
        }
    }
}
