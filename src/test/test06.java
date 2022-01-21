package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test06 {
    public static void main(String[] args) {
        // 6. ArrayList 로또 2개 만들어서 비교해보기
        // Mock
        List<Integer> lotto1 = Arrays.asList(1, 3, 5, 6, 7, 10);
        ArrayList<Integer> lotto2 = new ArrayList<>();
        lotto2.add(1);
        lotto2.add(3);
        lotto2.add(5);
        lotto2.add(6);
        lotto2.add(7);
        lotto2.add(10);

        // 두 개 비교하는 코드
        int failcheck = 0;
        final int LOTTOCYCLE = lotto1.size(); // final 변수는 대문자로 정의

        for (int i = 0; i < LOTTOCYCLE; i++) {
            if (lotto1.get(i) == lotto2.get(i)) {
                System.out.println(i + "번지의 값이 일치합니다.");
            } else {
                failcheck++;
            }
        }

        // 검증
        if (failcheck == 0) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }

        // if (lotto1.get(0) == lotto2.get(0)) {
        // System.out.println("0번지의 값이 일치합니다.");
        // } else {
        // failcheck++;
        // }
        // if (lotto1.get(1) == lotto2.get(1)) {
        // System.out.println("1번지의 값이 일치합니다.");
        // } else {
        // failcheck++;
        // }
    }
}
