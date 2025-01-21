package gr.aueb.cf.ch14.immutable;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
