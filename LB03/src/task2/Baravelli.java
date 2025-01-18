package task2;

import task1.*;

public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli() {
        super("Baravelli", "Italy");
        this.radius = 0;
        this.height = 0;
    }

    public Baravelli(float radius, float height) {
        super("Baravelli", "Italy");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (float) (Math.PI * Math.pow(radius, 2) * height);
    }

    @Override
    public String toString() {
        return super.toString() + ";\nThe " + getOrigin() + " " + getFlavor() +
                " has volume " + getVolume();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        Baravelli other = (Baravelli) obj;
        return radius == other.radius && height == other.height;
    }

    public void printBaravelliDim() {
        System.out.println("Baravelli dimensions: radius = " + radius + ", height = " + height);
    }
}
