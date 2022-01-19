package stringex.practice;

import java.util.Scanner;

class Information {
    private String name;
    private String number;
    private char gender;
    private int age;

    public Information(String name, String number, char gender, int age) {
        this.name = name;
        this.number = number;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        String[] info = data.split("-");
        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i]);
        }
        String ifA = info[0];
        boolean startsWith = ifA.startsWith("A");
        if (startsWith == true) {
            String name = info[1];
            String number = info[2];
            char gender = info[3].charAt(0);
            int age = Integer.parseInt(info[4]);

            Information info1 = new Information(name, number, gender, age);
            System.out.println(
                    "이름 : " + info1.getName() +
                            " 번호 : " + info1.getNumber() +
                            " 성별 : " + info1.getGender() +
                            " 나이 : " + info1.getAge());
        } else {
            System.out.println("프로그램 종료");
        }

    }
}
