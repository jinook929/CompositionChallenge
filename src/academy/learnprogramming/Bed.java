package academy.learnprogramming;

public class Bed {

    private String model;
    private int size;
    private String color;

    public Bed(String model, int size, String color) {
        this.model = model;
        this.size = size;
        this.color = color;
    }

    public void matchBlanket() {
        System.out.println("The blanket color is " + this.color + ", and the bed size is " + this.size);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
