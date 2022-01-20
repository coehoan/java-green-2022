package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) {
        // 1. 당첨번호 정하기(998회차 당첨번호)
        ArrayList<Integer> winNumber = new ArrayList<Integer>();
        winNumber.add(13);
        winNumber.add(17);
        winNumber.add(18);
        winNumber.add(20);
        winNumber.add(42);
        winNumber.add(45);
        winNumber.add(41); // 보너스 번호

        // 2. 스캐너로 금액입력
        System.out.println("금액을 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt(); // 투입금액
        int chance = money / 1000; // 기회
        System.out.println("받은금액 : " + money + "원");
        System.out.println(chance + "장 발권");
        // 결과 출력
        System.out.println("=== 결과 ===");

        // 3. ArrayList에 랜덤번호 담기 (장수만큼)
        Random randomNumber = new Random();

        // lottoNumber에 randomNumber 입력
        // 6개가 채워지면 break
        // for문으로 change만큼 장수 발급
        for (int i = 0; i < chance; i++) {
            Set<Integer> lottoNumber = new HashSet<>();
            while (true) {
                int number = randomNumber.nextInt(45) + 1;
                lottoNumber.add(number);
                if (lottoNumber.size() == 6) {
                    break;
                }
            }
            // 랜덤으로 나온 번호를 내 번호로 저장
            ArrayList<Integer> myNumber = new ArrayList<Integer>(lottoNumber);
            Collections.sort(myNumber); // 정렬
            System.out.println(myNumber); // 내 로또 번호

            // myNumber 0번이 1등번호에 포함이 되어 있는가
            // 있으면 num1 = 1, 없으면 0
            // 6가지 합을 구한다
            int num1 = Collections.frequency(winNumber, myNumber.get(0));
            int num2 = Collections.frequency(winNumber, myNumber.get(1));
            int num3 = Collections.frequency(winNumber, myNumber.get(2));
            int num4 = Collections.frequency(winNumber, myNumber.get(3));
            int num5 = Collections.frequency(winNumber, myNumber.get(4));
            int num6 = Collections.frequency(winNumber, myNumber.get(5));
            int result = num1 + num2 + num3 + num4 + num5 + num6;

            // 결과
            if (result < 3) {
                System.out.println("결과 : 꽝");
            } else if (result == 3) {
                System.out.println("결과 : 5등 당첨");
            } else if (result == 4) {
                System.out.println("결과 : 4등 당첨");
            } else if (result == 5) {
                if (myNumber.contains(winNumber.get(6))) {
                    System.out.println("결과 : 2등 당첨");
                }
            } else if (result == 5) {
                System.out.println("결과 : 3등 당첨");
            } else if (result == 6) {
                System.out.println("결과 : 1등 당첨");
            }
        }
    }
}