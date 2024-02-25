package com.company;

import java.util.Scanner;

public class fourD {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj slowo");
        String word1= scanner.nextLine();
        System.out.println("Podaj slowo 2");
        String word2 = scanner.nextLine();

        /*String ja = "Sikora";
        String ty = "Sikra";*/

        boolean porownannie1= word1.equals(word2);
        boolean porownanie2 = word2==word1;


        System.out.println(porownannie1);
        System.out.println(porownanie2);
    }
}
