package jsonex01;

import java.util.Arrays;
import java.util.List;

// {
//     "name": "홍길동",
//     "age": 25,
//     "hobby": ["농구", "도술"],
//     "family": {"id": 2, "father": "홍판서", "mother": "춘섬"}
//  }

class Family {
    private int id;
    private String father;
    private String motehr;

    public Family(int id, String father, String motehr) {
        this.id = id;
        this.father = father;
        this.motehr = motehr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMotehr() {
        return motehr;
    }

    public void setMotehr(String motehr) {
        this.motehr = motehr;
    }

    @Override
    public String toString() {
        return "Family [father=" + father + ", id=" + id + ", motehr=" + motehr + "]";
    }

    // "family": {"id": 2, "father": "홍판서", "mother": "춘섬"}
    public String toJson() {
        return "{\"id\": " + id + ", \"father\": " + father + ", \"mother\": " + motehr + "}";
    }

}

class User {
    private String name;
    private int age;
    private List<String> hobby;
    private Family family;

    public User(String name, int age, List<String> hobby, Family family) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", family=" + family + ", hobby=" + hobby + ", name=" + name + "]";
    }

    // {
    // "name": "홍길동",
    // "age": 25,
    // "hobby": ["농구", "도술"],
    // "family": {"id": 2, "father": "홍판서", "mother": "춘섬"}
    // }
    // return "{\"id\": " + id + ", \"father\": " + father + ", \"mother\": " +
    // motehr + "}";
    public String toJason() {
        return "{\"name\": " + name + ", \"age\": " + age + ", \"hobby\": " + hobby + ", \"family\": " + family.toJson()
                + "}";
    }
}

public class JsonEx01 {
    public static void main(String[] args) {
        List<String> hobby = Arrays.asList("농구", "도술");
        Family family = new Family(2, "홍판서", "춘섬");
        User user = new User("홍길동", 25, hobby, family);
        // System.out.println(user.toString());
        // System.out.println(family.toJson());
        System.out.println(user.toJason());
    }
}
