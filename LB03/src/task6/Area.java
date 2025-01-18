package task6;

import task1.*;
import task2.*;
import task4.*;

class Area {
    private CandyBag candyBag;
    private int number;
    private String street;

    public Area() {
        this.candyBag = new CandyBag();
        this.number = 0;
        this.street = "";
    }

    public Area(CandyBag candyBag, int number, String street) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }

    public void getBirthdayCard() {
        System.out.println("Address: " + number + " " + street);
        System.out.println("La mulți ani celei mai bune mame din lume!");

        System.out.print("\n");
        for (CandyBox box : candyBag.getCandyBoxes()) {
            System.out.println(box.toString());

            if (box.getFlavor().equals("Lindt")) {
                ((Lindt) box).printLindtDim();
            } else if (box.getFlavor().equals("Baravelli")) {
                ((Baravelli) box).printBaravelliDim();
            } else if (box.getFlavor().equals("ChocAmor")) {
                ((ChocAmor) box).printChocAmorDim();
            }

            System.out.print("\n");
        }
    }
}
