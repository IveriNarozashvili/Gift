package Zadachka;

public  class Shokolad extends Sweets  {

    public Shokolad(String name, double weight, double price, String milk) {
        super(name, weight, price);
        this.milk = milk;
    }
    public String milk;
}

