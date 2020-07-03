package Zadachka;

public class Main {
    public static void main(String[] args) {
        Konfeta konfeta = new Konfeta("Stek", 100.0, 35.8, "Vkusnii");
        Shokolad shokolad = new Shokolad("Milka", 90.0, 78.5, "Molochnii");
        Batonchik batonchik = new Batonchik("Snikers", 79.0, 41.3, "Lesnoi");
        Box box = new Box();
        box.add(konfeta);
        box.add(shokolad);
        box.add(batonchik);
        box.showInfo();
        box.showPrice();
        box.showWeight();
    }
}