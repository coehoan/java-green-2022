package test;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        // 2. Scanner로 금액 입력받아서 횟수 정하기 ex) 5000 = 5회
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        int count = (int) money / 1000;
        System.out.println("받은금액 : " + money);
        System.out.println("로또 횟수 : " + count);
        if (count == 5) {
            System.out.println("종료");
        } else {
            System.out.println("실패");
        }
    }
}
