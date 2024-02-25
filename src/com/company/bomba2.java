package com.company;

import java.util.Scanner;

public class bomba2 {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        int zegar;

        System.out.println("Podaj czas bomby: ");

        for(zegar=odczyt.nextInt(); zegar>0; zegar--)
            System.out.println("Bomba wybuchnie za "+zegar);
        System.out.println("BUM!");
    }
}

