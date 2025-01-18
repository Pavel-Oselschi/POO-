package task3;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void changeCoords(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point p = new Point(1.5f, 2.5f);

        p.showPoint();  // Output: (1.5, 2.5)

        p.changeCoords(3.5f, 4.5f);

        p.showPoint();  // Output: (3.5, 4.5)
    }
}
