package task2;

import task1.*;

public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Lindt() {
        super("Lindt", "Switzerland");
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    public Lindt(float length, float width, float height) {
        super("Lindt", "Switzerland");
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return length * width * height;
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

        Lindt other = (Lindt) obj;
        return length == other.length && width == other.width && height == other.height;
    }

    public void printLindtDim() {
        System.out.println("Lindt dimensions: length = " + length + ", width = " + width + ", height = " + height);
    }
}
