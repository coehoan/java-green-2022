package ex11;

class 달리기선수 {
    private int speed = 0;

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed + this.speed;
    }

}

public class AccessEx06 {
    public static void main(String[] args) {
        달리기선수 s1 = new 달리기선수();
        s1.setSpeed(10);
        s1.setSpeed(10);
        s1.setSpeed(10);
        System.out.println("현재속도 : " + s1.getSpeed());
    }
}