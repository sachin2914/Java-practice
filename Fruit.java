package programs;

// Fruit.java
public class Fruit {
    private String name;
    private double pricePerUnit;

    public Fruit(String name, double pricePerUnit) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() { return name; }
    public double getPricePerUnit() { return pricePerUnit; }

    @Override
    public String toString() {
        return name + " ($" + pricePerUnit + ")";
    }
}
