package com.company;

import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Podaj liczbe:");
        int first=scanner.nextInt();
        System.out.print("Do ktorej potengi podnesc liczbe:");
        int second=scanner.nextInt();

        double third=Math.pow(first,second);

        System.out.print(third);




    }
}
