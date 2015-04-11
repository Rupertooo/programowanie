package zadanie1;

public class Zadanie1 {

    public static void main(String[] args) {
        Czas licznik = new Czas("12h15min");
        Czas licznik2 = new Czas(10,15);
        Czas licznik3 = licznik2.Dodaj(licznik);
        System.out.println(licznik3.ToString());
        licznik3 = licznik2.Odejmnij(licznik);
        System.out.println(licznik3.ToString());
    }
}
