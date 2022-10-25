// Q1

public class Bicycle {
    private int speed;
    private String maker;
    private String type;

    Bicycle(int s, String m, String t) {
        this.speed = s;
        this.maker = m;
        this.type = t;
    }

    Bicycle() {
    }

    @Override
    public String toString() {
        return speed + "\t" + maker + "\t" + type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
