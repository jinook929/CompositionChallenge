package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Bed theBed = new Bed("Gloria", 2, "White");
        Table theTable = new Table(false, 4);
        Chair theChairs = new Chair(4, "Wood");

        House theHouse = new House(theBed, theTable, theChairs);
        theHouse.foldTable();
        theHouse.setTheTable(3);
        theHouse.setBlanket();
        theHouse.getTheChair().chairMaterial("plastic");
    }
}
