package ex06;

import java.util.Scanner;

public class WhileEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 2680;
        int restMoney = money;
        while (true) {
            int coin = sc.nextInt();
            System.out.println(coin + "원 :" + restMoney / coin + "개");
            restMoney = restMoney % coin;

            if (coin == 10) {
                break;
            }
        }
    }
}
