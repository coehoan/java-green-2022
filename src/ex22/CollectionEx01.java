package ex22;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionEx01 {
    public static void main(String[] args) {

        // ArrayList는 데이터가 중복돼도 되는 데이터 모임
        // 여러개의 데이터가 저장되는 제네릭 박스
        ArrayList<String> datas = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        datas.add("데이터0");
        datas.add("데이터1");
        datas.add("데이터2");
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        datas.size();
        datas.add(1, "데이터99");
        datas.set(2, "데이터15"); // datas의 2번을 "데이터15"로 변경
        // datas.clear(); // 전체데이터 삭제

        // System.out.println(datas.get(0));
        // System.out.println(datas.get(1));

        // System.out.println(numbers.get(0));
        // System.out.println(numbers.get(1));
        // System.out.println(numbers.get(2));

        // for (int i = 0; i < numbers.size(); i++) {
        // System.out.println(datas.get(i));
        // }
        Iterator list = datas.iterator();
        while (list.hasNext()) {
            System.out.println(list.next());
        }

    }
}
