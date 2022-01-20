package ex11;

class 엔진 {
    int power = 5000;
}

class 소나타 {

    엔진 engine;

    소나타(엔진 engine) {
        this.engine = engine;
    }

}

public class CompositeEx01 {
    public static void main(String[] args) {
        엔진 e = new 엔진();
        소나타 s = new 소나타(e);
        System.out.println(s.engine.power);
    }
}