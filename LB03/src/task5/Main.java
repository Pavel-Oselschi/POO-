package task5;

import task1.*;
import task2.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Lindt lindt = new Lindt(5.0f, 4.0f, 3.0f);
        Baravelli baravelli = new Baravelli(2.0f, 3.0f);
        ChocAmor chocAmor = new ChocAmor(4.0f);

        ArrayList<CandyBox> candyBoxes = new ArrayList<>();
        candyBoxes.add(lindt);
        candyBoxes.add(baravelli);
        candyBoxes.add(chocAmor);

        ((Lindt) candyBoxes.get(0)).printLindtDim();
        ((Baravelli) candyBoxes.get(1)).printBaravelliDim();
        ((ChocAmor) candyBoxes.get(2)).printChocAmorDim();
    }
}
