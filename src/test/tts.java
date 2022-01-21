package test;

import com.google.gson.Gson;

class User {
    private String name;
    private String age;
    private String adress;
    private String gender;

    public User(String name, String age, String adress, String gender) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.gender = gender;
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [adress=" + adress + ", age=" + age + ", gender=" + gender + ", name=" + name + "]";
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

public class tts {
    public static void main(String[] args) {
        User user = new User("홍길동", "30", "서울", "남");
        Gson gson = new Gson();
        String JSONUser = gson.toJson(user);
        System.out.println(JSONUser);
    }
}
