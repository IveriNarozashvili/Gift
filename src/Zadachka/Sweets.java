package Zadachka;

public abstract class Sweets {


    protected String name;
    protected double weight;
    protected double price;

    public Sweets(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price;
    }
}
