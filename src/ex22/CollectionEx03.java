package ex22;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CollectionEx03 {
    public static void main(String[] args) {
        Random r = new Random();

        // HashSet 생성
        Set<Integer> datas = new HashSet<>();

        while (true) {
            int n = r.nextInt(45) + 1;
            System.out.println(n);

            datas.add(n);
            if (datas.size() == 6) {
                break;
            }
        }
        System.out.println(datas);
    }
}
