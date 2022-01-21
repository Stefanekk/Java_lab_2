public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int i = 1000;
        int h = 60729;
        int x = h % 100;
        do {
            if (i % x == 0){
                System.out.printf("liczba %d jest podzielna przez %d (%d)-liczba podzielna %d - podzielnik", i, x, i, x);
            }
            i--;
        } while (i != 0);


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */


        int n = 0;
        int[] tablica = new int[5];
        tablica[0] = 112;
        tablica[1] = 98;
        tablica[2] = 12;
        tablica[3] = 71;
        tablica[4] = 82;
        while (n < 5){
            System.out.printf("%d elementem talbicy jest: " + tablica[n], n);
            n++;
        }
        double[] tablica2 = new double[5];
        tablica2[0] = 65.2;
        tablica2[1] = 32.6;
        tablica2[2] = 5.7;
        tablica2[3] = 72.8;
        tablica2[4] = 25.4;
        n = 0;
        while (n < 5){
            System.out.printf("%d elementem talbicy jest: " + tablica2[n], n);
            n++;
        }
        String[] tablica3 = new String[5];
        tablica3[0] = "Poniedzialek";
        tablica3[1] = "Wtorek";
        tablica3[2] = "Sroda";
        tablica3[3] = "Czwartek";
        tablica3[4] = "Piatek";
        n = 0;
        while (n < 5){
            System.out.printf("%d elementem talbicy jest: " + tablica3[n], n);
            n++;
        }
        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)a
        */

        int k = 0;
        while(true){
            //Niekonczaca sie petla - Infinite Loop
            System.out.printf("%d petla", k);
            k++;
            if (k == 3){
                break;
            }
        }
        //while (false) - Unreachable Statement - Pętla która nigdy sie nie wykona
    }
}
