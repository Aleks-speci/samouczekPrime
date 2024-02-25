package oKLASSACH;

public class Firma {

    public static void main(String[] args) {
        Pracownik pracownik1=new Pracownik();
        Pracownik pracownik2=new Pracownik();

        pracownik1.Imie="Zbyszek";
        pracownik1.Nazwisko= "nowak";
        pracownik1.wiek=35;

        pracownik2.wiek=25;
        pracownik2.Imie="Wiktor";
        pracownik2.Nazwisko="Pobudziej";

        System.out.print("Danne pierwsego pracownika : "+ pracownik1.Imie +" " +pracownik1.Nazwisko+ " " +pracownik1.wiek + " lat");

    }
}
