package com.company;

public class secondB {

    public static void main(String[] args) {

        double a=2.356984;
        double b=3.25879;
        double c=4.369888;
        boolean porownannie1= (a+b)>c;
        boolean porownanie2= a==b;

        System.out.println("(a+b)/c = " +((a+b)/c));
        System.out.println("(b-a)*c = " +((b-a)*c));

        ++a;
        ++b;
        ++c;

        System.out.println("czy (a+b)>c = " + porownannie1);
        System.out.println( " czy a jest rowne b " + porownanie2);
        System.out.println("Powiekszone o 1 patrz nizej");

        /*System.out.println("(a+b)/c = " +((a+b)/c));
        System.out.println("(b-a)*c = " +((b-a)*c));
        System.out.printf("(%.2f + %.2f) * %.3f = %.2f", c, a, b,((c+a)*b));*/





    }



}
