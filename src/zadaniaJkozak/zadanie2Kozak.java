package zadaniaJkozak;

import java.util.Scanner;

public class zadanie2Kozak {

    public static void main(String[] args) {






        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj swoj wzrost: ");
        double wzrost=scanner.nextInt();
        Scanner scanner2= new Scanner(System.in);
        System.out.println("Podaj swoja wage: ");
        double waga=scanner2.nextInt();
       double BmI=(waga/(Math.pow(wzrost,2)))*10000;

        if(BmI<18){
            System.out.println();
                    }
        else if(BmI>24.9){
            System.out.println("Twoj BmI= "+ BmI +" jak wynik- masz nadwage");

        }
        else
            System.out.println("Kurwa jestes dobry");








    }

}
