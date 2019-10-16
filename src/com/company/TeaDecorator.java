package com.company;

public abstract class TeaDecorator implements TeaOrder {
    private TeaOrder teaOrder;

    protected int price;

    public TeaDecorator(TeaOrder teaOrder) {
        this.teaOrder = teaOrder;
    }

    @Override
    public String Tea() {
        return teaOrder.Tea();
    }
}
