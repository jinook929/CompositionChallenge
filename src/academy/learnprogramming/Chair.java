package academy.learnprogramming;

public class Chair {

    private int numberOfChairs;
    private String material;

    public Chair(int numberOfChairs, String material) {
        this.numberOfChairs = numberOfChairs;
        this.material = material;
    }

    public void chairMaterial(String material) {
        System.out.println("The chairs are made of " + material);
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public String getMaterial() {
        return material;
    }
}
