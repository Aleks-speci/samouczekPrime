package zadaniaJkozak;

import java.util.Scanner;

public class zad4Kozak {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Podaj swoj dochod :");

        double dochod=s.nextDouble();
        double nadwyzka=dochod-85528;
         if (dochod<=85528){
             double min=(dochod*0.18)-556.2;
             System.out.println("Twoj podatek wynosi : "+ min);
         }
         else {
             double max=14839.02+(nadwyzka*0.32);
             System.out.println("Twoj podatek wynosi : " +max);
         }



    }
}
