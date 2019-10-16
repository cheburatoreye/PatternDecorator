package com.company;

public class JasmineTeaDecorator extends TeaDecorator{

    public JasmineTeaDecorator(TeaOrder teaOrder) {
        super(teaOrder);
        int additivePrice=7;
        price=additivePrice+teaOrder.getPrice();
    }

    @Override
    public String Tea() {
        String additive="jasmine";
        return super.Tea()+"+"+additive;
    }

    @Override
    public int getPrice() {
        return price;
    }


}
