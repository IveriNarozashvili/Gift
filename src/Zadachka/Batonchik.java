package Zadachka;

public  class Batonchik extends Sweets {

    public Batonchik(String name, double weight, double price, String withNuts) {
        super(name, weight, price);
        this.withNuts = withNuts;
    }
    public String withNuts;
}

