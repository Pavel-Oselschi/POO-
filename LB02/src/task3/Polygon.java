package task3;

public class Polygon {
    private Point[] points; // Array de puncte pentru colțurile poligonului

    // Constructor care primește numărul de colțuri (n)
    public Polygon(int n) {
        points = new Point[n]; // Alocă spațiu pentru n colțuri
    }

    // Constructor care primește un vector de coordonate
    public Polygon(float[] coords) {
        this(coords.length / 2); // Apelează constructorul cu numărul de colțuri n = coords.length / 2

        // Completează array-ul de puncte cu coordonatele primite
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(coords[2 * i], coords[2 * i + 1]);
        }
    }

    // Metodă pentru afișarea coordonatelor poligonului
    public void showPolygon() {
        for (int i = 0; i < points.length; i++) {
            System.out.print("Point " + (i + 1) + ": ");
            points[i].showPoint();
        }
    }

    // Main pentru testare
    public static void main(String[] args) {
        // Definim un poligon cu coordonatele a trei puncte
        float[] coords = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f};

        // Cream un poligon folosind vectorul de coordonate
        Polygon polygon = new Polygon(coords);

        // Afișăm coordonatele poligonului
        polygon.showPolygon();
    }
}