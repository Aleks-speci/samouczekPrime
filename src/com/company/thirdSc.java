package com.company;


import java.util.Scanner;

public class thirdSc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cudzysłów \n");
        int liczba1=scanner.nextInt();
        System.out.println("Podaj druga liczbe : ");
        int liczba2= scanner.nextInt();

        if (liczba1==liczba2){

            System.out.println("Liczby sa rowne");
        }
        else if (liczba1>liczba2){
            System.out.println("Liczba 1 wygrywa");
        }

            else {
                System.out.println("liczba 2 wygrala");
            }


            }

    }




