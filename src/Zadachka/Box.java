package Zadachka;

import java.util.ArrayList;

public class Box implements BoxInter{

    private static ArrayList<Sweets> list = new ArrayList<Sweets>();

    @Override
    public void add(Sweets sweets) {
        list.add(sweets);
    }

    @Override
    public void delete(Sweets sweets) {
        list.remove(sweets);
    }

    @Override
    public void showWeight() {
        double sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i).weight;
        System.out.println("Total weight = " + sum);
    }

    @Override
    public void showPrice() {
        double sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i).price;
        System.out.println("Total price = " + sum);
    }

    @Override
    public void showInfo() {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
