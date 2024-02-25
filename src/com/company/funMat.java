package com.company;

import java.util.Scanner;

public class funMat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Wprowadz liczbe,a ja sprawdze");
        int a=scanner.nextInt();
        boolean sprawdzanie= a%3==0;
        boolean sprawdzanie2= a%5==0;

        if (sprawdzanie==true){

            System.out.printf("Liczba podzielna przez 3");

        }
        else if (sprawdzanie2==true){
            System.out.printf("liczba jest podzielna przez 5");
        }
        else {
            System.out.printf("a ni to ,a ni to");
        }


       /* int someNumber=4;
        boolean isEven = someNumber % 2 == 0;*/

    }
}
