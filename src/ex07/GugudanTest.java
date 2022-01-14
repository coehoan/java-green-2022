package ex07;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 구구단의 범위를 입력하시오.");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int a = n1; a <= n2; a++) {
            for (int i = 1; i < 10; i++) {
                System.out.println(a + "*" + i + "=" + a * i);
                if (i == 9) {
                    System.out.println("");
                }
            }
        }
    }
}
