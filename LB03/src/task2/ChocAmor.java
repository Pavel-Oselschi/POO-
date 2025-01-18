package task2;

import task1.*;

public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor() {
        super("ChocAmor", "France");
        this.length = 0;
    }

    public ChocAmor(float length) {
        super("ChocAmor", "France");
        this.length = length;
    }

    @Override
    public float getVolume() {
        return (float) Math.pow(length, 3);
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

        ChocAmor other = (ChocAmor) obj;
        return length == other.length;
    }

    public void printChocAmorDim() {
        System.out.println("ChocAmor dimensions: length = " + length);
    }
}
