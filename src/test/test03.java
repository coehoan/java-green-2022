package test;

import java.util.HashSet;
import java.util.Random;

public class test03 {
    public static void main(String[] args) {
        // 3. HashSet으로 랜덤한 로또 번호 6개 받기
        HashSet<Integer> lotto = new HashSet<>();
        Random r = new Random();

        // 반복해서 lotto에 담기 (6개)
        // set 자료구조는 중복되는 데이터가 들어가면 허용하지 않음.
        while (true) {
            int n = r.nextInt(45) + 1;
            lotto.add(n);
            // 한 줄 코드는 중괄호 생략가능(조건문에서)
            if (lotto.size() == 6)
                break;
        }
        System.out.println(lotto);

        if (lotto.size() == 6) {
            System.out.println("종료");
        } else {
            System.out.println("실패");
        }
    }
}
