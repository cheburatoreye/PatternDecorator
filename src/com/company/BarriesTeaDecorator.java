package com.company;

public class BarriesTeaDecorator extends TeaDecorator {

    public BarriesTeaDecorator(TeaOrder teaOrder) {
        super(teaOrder);
        int additivePrice=8;
        price=additivePrice+teaOrder.getPrice();
    }

    @Override
    public String Tea() {
        String additive="barries";
        return super.Tea()+"+"+additive;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
