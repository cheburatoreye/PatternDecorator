package com.company;

public class CinnamonTeaDecorator extends TeaDecorator {

    public CinnamonTeaDecorator(TeaOrder teaOrder) {
        super(teaOrder);
        int additivePrice=10;
        price=additivePrice+teaOrder.getPrice();
    }

    @Override
    public String Tea() {
        String additive="cinnamon";
        return super.Tea()+"+"+additive;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
