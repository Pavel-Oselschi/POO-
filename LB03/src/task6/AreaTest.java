package task6;

import task2.*;
import task4.*;

public class AreaTest {
    public static void main(String[] args) {
        Lindt lindt = new Lindt(5.0f, 4.0f, 3.0f);
        Baravelli baravelli = new Baravelli(2.0f, 3.0f);
        ChocAmor chocAmor = new ChocAmor(4.0f);

        CandyBag candyBag = new CandyBag();

        int lindtCount = 20;
        int baravelliCount = 30;
        int chocAmorCount = 10;

        for (int i = 0; i < lindtCount; i++) {
            candyBag.addCandyBox(lindt);
        }
        for (int i = 0; i < baravelliCount; i++) {
            candyBag.addCandyBox(baravelli);
        }
        for (int i = 0; i < chocAmorCount; i++) {
            candyBag.addCandyBox(chocAmor);
        }

        Area area = new Area(candyBag, 5, "Mihai Eminescu");

        area.getBirthdayCard();
    }
}
