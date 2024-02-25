package com.company;

import java.util.Scanner;

public class bomba {
    public static void main(String[] args) {

        System.out.println("Podaj dowolna liczbe :");

        Scanner scanner = new Scanner(System.in);
        int timer = scanner.nextInt();


        while (timer >= 0) {
            System.out.println("Bomba wybuchnie za : " + timer);


            --timer;


        }
        System.out.println("nie wybuchlo.Dawaj eszcze raz.Podaj liczbe: ");

        System.out.println();

        Scanner scanner1 = new Scanner(System.in);
        int timer2 = scanner1.nextInt();

        do {
            System.out.println("Bomba wybuchnie za : " + timer2);
            --timer2;
        }
        while (timer2 >= 0);

        System.out.println("Znowu cos nie poszlo.Ostatania proba!podaj liczbe: ");

        Scanner scanner2 = new Scanner(System.in);
        int timer3 ;


        for (timer3 = scanner2.nextInt(); timer3 >= 0; timer3--){
            System.out.println("Wybuchnie za");

            System.out.println(timer3);
        }

            System.out.println("Udalo sie");


        }
    }
