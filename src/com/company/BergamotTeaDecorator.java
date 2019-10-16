package com.company;

public class BergamotTeaDecorator extends TeaDecorator {

    public BergamotTeaDecorator(TeaOrder teaOrder) {
        super(teaOrder);
        int additivePrice=11;
        price=additivePrice+teaOrder.getPrice();
    }

    @Override
    public String Tea() {
        String additive="bergamot";
        return super.Tea()+"+"+additive;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
