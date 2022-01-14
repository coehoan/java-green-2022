package ex07;

class 질럿 {
    String name;
    int hp;
    int attack;

    질럿(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
}

public class OOPEx05 {
    public static void main(String[] args) {
        질럿 z1 = new 질럿("질럿1", 100, 10);
        System.out.println("이름:" + z1.name + " HP:" + z1.hp + " 공격력:" + z1.attack);
        질럿 z2 = new 질럿("질럿2", 200, 20);
        System.out.println("이름:" + z2.name + " HP:" + z2.hp + " 공격력:" + z2.attack);
        질럿 z3 = new 질럿("질럿3", 300, 30);
        System.out.println("이름:" + z3.name + " HP:" + z3.hp + " 공격력:" + z3.attack);
    }
}
