package com.company;

public class Print {

    private TeaOrder teaOrder;

    void printMenu(){
        System.out.println("1.tea ");
        System.out.println("2.tea with bergamot");
        System.out.println("3.tea with milk");
        System.out.println("4.tea with jasmine");
        System.out.println("5.tea with berries");
        System.out.println("6.tea with mint");
        System.out.println("7.tea with cinnamon");
        System.out.println("8.tea with jasmine&mint");
        System.out.println("9.tea with milk&berries");
        System.out.println("-1 exit");
        System.out.println("choice your order");
    }
    void printOrder( TeaOrder teaOrder){
        System.out.println(teaOrder.Tea());
        System.out.println("price "+teaOrder.getPrice()+" $");
    }


}
