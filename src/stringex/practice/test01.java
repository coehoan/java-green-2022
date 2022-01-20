package stringex.practice;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class WinNumber {
    int number;
}

public class test01 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> number = new HashSet<>();

        while (true) {
            int winnumber = random.nextInt(45) + 1;
            System.out.println();

            number.add(winnumber);
            if (number.size() == 6) {
                break;
            }
        }
    }
}
