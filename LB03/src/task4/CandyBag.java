package task4;

import task1.*;
import task2.*;
import java.util.ArrayList;

public class CandyBag {
    private ArrayList<CandyBox> candyBoxes;

    public CandyBag() {
        this.candyBoxes = new ArrayList<>();
    }

    public void addCandyBox(CandyBox box) {
        candyBoxes.add(box);
    }

    public int size() {
        return candyBoxes.size();
    }

    public CandyBox getCandyBox(int index) {
        return candyBoxes.get(index);
    }

    public void showCandyBag() {
        for (CandyBox box : candyBoxes) {
            System.out.println(box);
            System.out.println();
        }
    }

    public ArrayList<CandyBox> getCandyBoxes() {
        return candyBoxes;
    }
}
