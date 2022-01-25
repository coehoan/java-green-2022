package ex24;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class StreamEx01 {
    public static void main(String[] args) {
        // 모니터(목적지)와 자바(소스)의 Stram이 연결된다
        InputStream s = System.in;

        try {
            int n = s.read();
            System.out.println((char) n);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

// 1개씩 받을 수 있다.
