package com.company;

public class MintTeaDecorator extends TeaDecorator {

    public MintTeaDecorator(TeaOrder teaOrder) {
        super(teaOrder);
    int additivePrice=6;//цена добавки
        price=additivePrice+teaOrder.getPrice();
    }

    @Override
    public String Tea() {
        String additive="mint";
        return super.Tea()+"+"+additive;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
