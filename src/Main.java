import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();
        switch (liczba%2){
            case 0:
                System.out.println("Liczba jest parzysta");
                break;

            case 1:
                System.out.println("Liczba jest niepatrzysta");
                break;
        }
        switch (liczba%7){
            case 0 :
                System.out.println("Liczba jest podzielna przez 7");
                break;
            default:
                System.out.println("Liczba nie jest podzielna przez 7");
                break;
        }
        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tablica = {0,0,0,0,0,0};
        for (char character : text.toCharArray()){
            switch (character){
                case 'o':
                    ++tablica[0];
                    break;
                case 'p':
                    ++tablica[1];
                    break;
                case 'x':
                    ++tablica[2];
                    break;
                case 'z':
                    ++tablica[3];
                    break;
                case 'q':
                    ++tablica[4];
                    break;
                default:
                    ++tablica[5];
                    break;
            }
        }
        System.out.printf(" 'o' wystepuje w tekscie: %d razy\n 'p' wystepuje w tekscie: %d razy\n 'x' wystepuje w tekscie: %d razy\n" +
                " 'z' wystepuje w tekscie: %d razy\n 'q' wystepuje w tekscie: %d razy\n inne litery wystepuja w tekscie: %d razy", tablica[0],
                tablica[1],tablica[2],tablica[3],tablica[4],tablica[5]);
    }
}
