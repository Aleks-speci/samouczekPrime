package zadaniaJkozak;

import java.util.Scanner;

public class zadanie5exampl {
    public static void main(String[] args) {
        // nie zrobione powtorne pobieranie poprawnyсh dannych

        System.out.println("Program sprzedazy ratalnej!");
        System.out.print("Podaj kwote: ");
        double kwota;
            Scanner odczyt = new Scanner(System.in);
            kwota = odczyt.nextDouble();
           // boolean petla=true;
      //  while (petla) {
            for (kwota=0;kwota <= 100 || kwota >= 10000;kwota++) {
                if (kwota <= 100 || kwota >= 10000){
                    System.out.println("Bledne danny");
                }

                break;
            }

              //  petla=false;
               //  continue;
        System.out.println("Podaj liczbe rat: ");
            int rata;
            Scanner odczytRat = new Scanner(System.in);
            rata = odczytRat.nextInt();
        while (rata >= 6 || rata <= 48) {


            if (rata < 6 || rata > 48) {
                System.out.println("Błędne dane!");
                System.out.println("Bank rozkłada od 6 do 48 rat");
            }
            break;
        }
            if (rata >= 6 && rata <= 12) {
                double odsetki = kwota + (kwota * 0.025);
                System.out.println("Koszt raty to: " + odsetki);
            } else if (rata >= 13 && rata <= 24) {
                double odsetki1 = kwota + (kwota * 0.05);
                System.out.println("Koszt raty to: " + odsetki1);
            } else if (rata >= 25 && rata <= 48) {
                double odsetki2 = kwota + (kwota * 0.10);
                System.out.println("Koszt raty to: " + odsetki2);
            } else {
                System.out.println("Popraw dane!");
            }
        }

    }



