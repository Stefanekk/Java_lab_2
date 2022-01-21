import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
        int x = 60729 % 10;
        for (int i =100; i >= 0; i--){
            if (i % x == 0){
                System.out.printf("%d\n",i);
            }
        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */
        int [] tablica = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int k = 0; k < 5; k++){
            tablica[k] = scan.nextInt();
        }
        for (int num : tablica){
            System.out.printf("%d\n", num);
        }

    }
}
