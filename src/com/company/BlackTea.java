package com.company;

public class BlackTea implements TeaOrder {

    final String text;
    public final int price;

    public BlackTea(String text, int price) {
        this.text = text;
        this.price = price;
    }

    @Override
    public String Tea() {
        return text;
    }

    @Override
    public String toString() {
        return "BlackTea{" +
                "text='" + text + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }
}
