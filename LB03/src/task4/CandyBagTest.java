package task4;

import task2.*;

public class CandyBagTest {
    public static void main(String[] args) {
        CandyBag candyBag = new CandyBag();

        Lindt lindt1 = new Lindt(10, 5, 2);
        Lindt lindt2 = new Lindt(10, 5, 2);
        Lindt lindt3 = new Lindt(8, 4, 3);

        Baravelli baravelli1 = new Baravelli(3, 7);
        Baravelli baravelli2 = new Baravelli(4, 6);

        ChocAmor chocAmor1 = new ChocAmor(4);
        ChocAmor chocAmor2 = new ChocAmor(5);

        System.out.println(lindt1);
        System.out.println(lindt2);
        System.out.println(lindt3);
        System.out.println("lindt1 equals lindt2: " + lindt1.equals(lindt2));
        System.out.println("lindt1 equals lindt3: " + lindt1.equals(lindt3));

        candyBag.addCandyBox(lindt1);
        candyBag.addCandyBox(lindt2);
        candyBag.addCandyBox(lindt3);

        candyBag.addCandyBox(baravelli1);
        candyBag.addCandyBox(baravelli2);

        candyBag.addCandyBox(chocAmor1);
        candyBag.addCandyBox(chocAmor2);

        System.out.println("CandyBag contains:");
        candyBag.showCandyBag();
    }
}
