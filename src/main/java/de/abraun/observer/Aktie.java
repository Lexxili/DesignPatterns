package de.abraun.observer;

import java.util.Observable;

public class Aktie extends Observable {
    private final String name;
    private double price;

    public Aktie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void changePrice(double percent){
        this.price = price + (price * percent);
        System.out.printf("%s: Neuer Preis %4f \n", name, price);

        setChanged();
        notifyObservers();
    }
}
