import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point p2=null,p1 = new Point();
        p1.x=10;
        p1.y=p2;
        System.out.println("X: " +p1.x + ", Y: " + p1.y);
        updatePoint(p1);
        System.out.println("X: " +p1.x + ", Y: " + p1.y);
    }
    public static void updatePoint(Point p1) {
        p1=p1.y;
        System.out.println("Xm: " +p1);
    }
}

class Point {
    public int x;
    Point y;
}