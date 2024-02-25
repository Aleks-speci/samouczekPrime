package com.company;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {



       Scanner scanner=new Scanner(System.in);
       String season=scanner.nextLine();
       /* switch (season) {
            case "Spring":
                System.out.println("Mamy aktualnie wiosnę");
                break;
            case "Summer":
                System.out.println("Mamy aktualnie lato");
                break;
            case "Autumn":
                System.out.println("Mamy aktualnie jesień");
                break;
            case "Winter":
                System.out.println("Mamy aktualnie zimę");
                break;
            default:
                System.out.println("Nie znam takiej pory roku");
       }*/
       String translation = switch (season) {

            case "Spring":
                yield  "wiosna";
            case "Summer":
                yield  "lato";
            case "Autumn":
                yield  "jesień";
            case "Winter":
                yield  "zima";
            default:
                yield  "nieznany";
        };
        System.out.printf(translation);

    }
}
