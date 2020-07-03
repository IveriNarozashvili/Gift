package Zadachka;

public  class Konfeta extends Sweets {

    public Konfeta(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }
    public String type;
}
