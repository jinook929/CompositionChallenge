package academy.learnprogramming;

public class House {

    private Bed theBed;
    private Table theTable;
    private Chair theChair;

    public House(Bed theBed, Table theTable, Chair theChair) {
        this.theBed = theBed;
        this.theTable = theTable;
        this.theChair = theChair;
    }

    public void setBlanket() {
        theBed.matchBlanket();
    }

    public void foldTable() {
        theTable.folding();
    }

    public void setTheTable(int peopleCapacity) {
        System.out.println("Now table set for " + peopleCapacity + " people");
    }

    public Bed getTheBed() {
        return theBed;
    }

    public Table getTheTable() {
        return theTable;
    }

    public Chair getTheChair() {
        return theChair;
    }
}
