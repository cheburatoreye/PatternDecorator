package com.company;

public class MilkTeaDecorator extends TeaDecorator {


    public MilkTeaDecorator(TeaOrder teaOrder) {
        super(teaOrder);
        int additivePrice=5;
        price=additivePrice+teaOrder.getPrice();
    }

    @Override
    public String Tea() {
        String additive="milk";
        return super.Tea()+"+"+additive;
    }

    @Override
    public int getPrice() {

        return price;
    }
}
