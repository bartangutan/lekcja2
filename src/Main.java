import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //10 liczb z zakresu 1-20

        int[] losoweLiczby = wylosujTablice(10, 8, 10);

        wypisz(losoweLiczby);

        //10 liczb bez powtórzeń z zakresu 1, 20
        //kolekcja
        //List -> ArrayList
        //Set -> HashSet
        //Map -> HashMap
        //w kolekcjach tylko typy złożone
        int liczba1 = 0; //typ prosty, z małej litery nie ma właśnych metod
        Integer liczba2 = 0; //typ złożony, z wielkiej litery, ma własne metody
        ArrayList<Integer> wylosowaneLiczby = wylosujLiczbyDoListy(10);
        wypisz(wylosowaneLiczby);

        wypisz(wylosujLiczbyDoZbioru(5));

    }
    private static HashSet<Integer> wylosujLiczbyDoZbioru(int ileLiczba){
        HashSet<Integer> zbiorLiczbLosowych = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < ileLiczba; i++) {
            zbiorLiczbLosowych.add(random.nextInt(20)+1);
        }
        return zbiorLiczbLosowych;
    }

    private static ArrayList<Integer> wylosujLiczbyDoListy(int ileLiczb) {
        Random random = new Random();
        ArrayList<Integer> wylosowanaLista = new ArrayList<>(); //nie znam rozmiaru listy
        //lista może mieć zmieniony rozmiar w trakcie działania
        int liczba;
        for (int i = 0; i < ileLiczb; i++) {
            liczba = random.nextInt(20) + 1;
            while (wylosowanaLista.contains(liczba)) {
                liczba = random.nextInt(20) + 1;
            }
            wylosowanaLista.add(liczba);
        }
        return wylosowanaLista;
    }

    private static int[] wylosujTablice(int ileLiczb, int poczatekZakresu, int koniecZakresu) {
        Random random = new Random();
        int[] losoweLiczby = new int[ileLiczb];
        for (int i = 0; i < losoweLiczby.length; i++) {
            losoweLiczby[i] = random.nextInt(poczatekZakresu, koniecZakresu + 1);
        }
        return losoweLiczby;
    }

    private static void wypisz(ArrayList<Integer> listaDoWypisania) {
        System.out.println("Wylosowana lista: ");
        for (int i = 0; i < listaDoWypisania.size(); i++) {
            System.out.println(listaDoWypisania.get(i) + ", ");
        }
    }

    private static void wypisz(int[] tablicaDoWypisania) {
        System.out.println("Wszystkie liczby wylosowane: ");
        for (int elementTablicy : tablicaDoWypisania) {
            System.out.println(elementTablicy + ", ");
        }
    }

    private static void wypisz(HashSet<Integer> zbior){
        System.out.println("Wylosowany zbiór:");
        for (int elementZbioru: zbior) {
            System.out.println(elementZbioru+", ");
        }
    }

}