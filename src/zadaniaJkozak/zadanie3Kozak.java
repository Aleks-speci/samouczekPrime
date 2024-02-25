package zadaniaJkozak;

import java.util.Scanner;

public class zadanie3Kozak {
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.println("Podaj wage..");
            double waga = s.nextDouble();
            System.out.println("Podaj wzrost");
            double wzrost = s.nextDouble();
            double BMI2 = waga / Math.pow(wzrost, 2);
            double BMI=BMI2*10000;
            if (BMI < 18.5) {
                System.out.println("BMi jest "+ BMI+ " Niedowaga ;(");
            } else {
                if (BMI < 24.9) {
                    System.out.println("BMi jest "+ BMI+  " Waga Prawidłowa ");
                }
                else{
                    System.out.println("BMi jest "+ BMI+ " nadwaga ;(");
                }
            }
        }
    }
