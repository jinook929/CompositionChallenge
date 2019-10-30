package academy.learnprogramming;

public class Table {

    private boolean isFoldable = true;
    private int peopleCapacity;

    public Table(boolean isFoldable, int peopleCapacity) {
        this.isFoldable = isFoldable;
        this.peopleCapacity = peopleCapacity;
    }

    public void folding() {
        if(isFoldable) {
            this.peopleCapacity = 0;
        }
        System.out.println("The table is folded.");
    }

    public void setting(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
        System.out.println("The table is set for " + this.peopleCapacity + " people.");
    }

    public boolean isFoldable() {
        return isFoldable;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }
}
