package ex20;

import java.util.Random;

public class test111 {
    public static void main(String[] args) {
        Random numbers = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers.nextInt(100));
        }
    }
}