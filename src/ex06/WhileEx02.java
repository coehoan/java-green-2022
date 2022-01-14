package ex06;

import java.util.Scanner;

public class WhileEx02 {
    public static void main(String[] args) {
        System.out.println("프로그램 종료를 원하면 0을 입력하세요");
        Scanner sc = new Scanner(System.in);
        int exitNum = 1;
        while (exitNum == 1) {
            int num = sc.nextInt();
            System.out.println("사용자 입력: " + num);

            if (num == 0) {
                exitNum = 2;
            }
        }
    }
}
