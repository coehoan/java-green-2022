package ex11;

class 동물 {

    void attackName() {
    }

    void showLeftHp(int unit2) {

    }
}

class 사자 extends 동물 {
    String name;
    int hp;
    int attack;

    사자(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    void attackName() {
        System.out.println(this.name + "가 공격받고 있습니다.");
    }

    void showLeftHp(int unit2) {
        this.hp = this.hp - unit2;
        System.out.println("남은 hp : " + this.hp);
    }
}

class 호랑이 extends 동물 {
    String name;
    int hp;
    int attack;

    호랑이(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    void attackName() {
        System.out.println(this.name + "가 공격받고 있습니다.");
    }

    void showLeftHp(int unit2) {
        this.hp = this.hp - unit2;
        System.out.println("남은 hp : " + this.hp);
    }

}

public class ExtendsEx02 {

    static void underAttack(동물 unit1) {
        unit1.attackName();
    }

    static void leftHp(동물 unit1, int unit2) {
        unit1.showLeftHp(unit2);
    }

    public static void main(String[] args) {
        // 사자가 호랑이 공격
        사자 lion = new 사자("사자", 100, 10);
        호랑이 tiger = new 호랑이("호랑이", 100, 20);

        underAttack(lion);
        leftHp(lion, tiger.attack);
        underAttack(tiger);
        leftHp(tiger, lion.attack);
    }
}
