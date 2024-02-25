package com.company;

import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        System.out.print("Podaj numer miesiaca: ");
        Scanner scanner=new Scanner(System.in);
        int miesiac= scanner.nextInt();

        switch (miesiac){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Ten miseac ma 31 dzien");
                break;
            case 2:
                System.out.printf("To luty-tam 28 dni");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Ten miesiac ma 30 dni");
                break;
            default:
                System.out.printf("niepoprawny numer ");
              }

    }
}
