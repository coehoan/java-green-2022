package ex11;

class 동물 {
    // 무효화
    void loserName() {

    }

    void loseHp(int winAttack) {

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

    void loserName() {
        System.out.println(name + "가 공격당하고 있습니다.");
    }

    void loseHp(int winAttack) {
        this.hp = this.hp - winAttack;
        System.out.println(name + "의 hp : " + hp);
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

    void loserName() {
        System.out.println(name + "가 공격당하고 있습니다.");
    }

    void loseHp(int winAttack) {
        this.hp = this.hp - winAttack;
        System.out.println(name + "의 hp : " + hp);
    }
}

class 곰 extends 동물 {
    String name;
    int hp;
    int attack;

    곰(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    void loserName() {
        System.out.println(name + "이 공격당하고 있습니다.");
    }

    void loseHp(int winAttack) {
        this.hp = this.hp - winAttack;
        System.out.println(name + "의 hp : " + hp);
    }
}

public class ExtendsEx02 {

    static void attack(동물 unit) {
        unit.loserName();
    }

    static void lose(동물 unit, int winAttack) {
        unit.loseHp(winAttack);
    }

    public static void main(String[] args) {
        사자 lion = new 사자("사자", 100, 10);
        호랑이 tiger = new 호랑이("호랑이", 100, 20);
        곰 bear = new 곰("곰", 500, 30);

        /**
         * attack(Class 공격당하는Class)
         * lose(Class 공격당하는Class, int 공격하는Class.attack)
         */
        attack(tiger);
        lose(tiger, lion.attack);
        attack(lion);
        lose(lion, tiger.attack);
        attack(bear);
        lose(bear, tiger.attack);
    }
}