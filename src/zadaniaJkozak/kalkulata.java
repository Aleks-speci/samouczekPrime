package zadaniaJkozak;

import java.util.Scanner;

public class kalkulata {
    public static void main(String[] args) {
        double liczba1;
        double liczba2;
        int coRobimy;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Czesc !jestem kalkulatorem!" +
                "Oto co ja moge robic" +
                "1: dodawanie 2: odejmowanie 3: podzelic 4: pomnozyc");
        boolean petla=true;
        while (petla){
            System.out.println("Wprowadz pierwsza liczbe ");
            liczba1= scanner.nextDouble();
            System.out.println("wprowadz co bedziemy robic");

            coRobimy=scanner.nextInt();
            switch (coRobimy){
                case 1:
                    System.out.println("Podaj druga liczbe");
                    liczba2=scanner.nextDouble();
                    System.out.println(liczba1+liczba2);
                    petla=false;
                    break;

                case 2:
                    System.out.println("Podaj druga liczbe");
                    liczba2=scanner.nextDouble();
                    System.out.println(liczba1-liczba2);
                    petla=false;
                    break;
                case 3:
                    System.out.println("Podaj druga liczbe");
                    liczba2=scanner.nextDouble();
                    System.out.println(liczba1*liczba2);
                    petla=false;
                    break;
                case 4:
                    System.out.println("Podaj druga liczbe");
                    liczba2=scanner.nextDouble();
                    if (liczba2==0){
                        System.out.println("Przez 0 nie dzielimy"+" Podaj kolejna druga liczbe");
                        liczba2=scanner.nextDouble();

                    }
                    System.out.println(liczba1/liczba2);
                    petla=false;
                    break;
                default:
                    System.out.println("nie ma takiej opcji");
                    petla=true;

            }



        }




    }
}
