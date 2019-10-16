package com.company;

import java.util.Scanner;

public class Menu {
    void teaMenu(){
        String text="blacktea";
        int teaprice=20;
        int enough=0;
        int search=0;
        Scanner sc=new Scanner(System.in);
        Print print =new Print();
        TeaOrder teaOrder =new BlackTea(text,teaprice);


        do{
            print.printMenu();
            search=sc.nextInt();
            switch (search){
                case 1:{
                    teaOrder =new BlackTea(text,teaprice);
                    print.printOrder(teaOrder);
                    break;
                }
                case 2:{
                    teaOrder =new BergamotTeaDecorator(new BlackTea(text,teaprice));
                    print.printOrder(teaOrder);
                    break;
                }
                case 3:{
                    teaOrder =new MilkTeaDecorator(new BlackTea(text,teaprice));
                    print.printOrder(teaOrder);
                    break;
                }
                case 4:{
                    teaOrder =new JasmineTeaDecorator(new BlackTea(text,teaprice));
                    print.printOrder(teaOrder);
                    break;
                }
                case 5:{
                    teaOrder =new BarriesTeaDecorator(new BlackTea(text,teaprice));
                    print.printOrder(teaOrder);
                    break;
                }
                case 6:{
                    teaOrder =new MintTeaDecorator(new BlackTea(text,teaprice));
                    print.printOrder(teaOrder);
                    break;
                }
                case 7:{
                    teaOrder =new CinnamonTeaDecorator(new BlackTea(text,teaprice));
                    print.printOrder(teaOrder);
                    break;
                }
                case 8:{
                    teaOrder =new MintTeaDecorator(new JasmineTeaDecorator(new BlackTea(text,teaprice)));
                    print.printOrder(teaOrder);
                    break;
                }
                case 9:{
                    teaOrder =new MilkTeaDecorator(new BarriesTeaDecorator(new BlackTea(text,teaprice)));
                    print.printOrder(teaOrder);
                    break;
                }
                default:{
                    enough=-1;
                }

            }

        }while (enough==0);
    }
}
