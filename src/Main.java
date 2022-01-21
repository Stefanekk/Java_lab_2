import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class Main {


    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 Napisać program który 
                a) stworzy listę ArrayList<String> (lista tablicowa),
                  Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                  elementów i elementami mają być nazwy zwierząt (niech niektóre wartości dublują się).
                  -- podpowiedź: List<String> nazwaListy = new ArrayList<>();
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                  -- podpowiedź: for(String zmienna : List<String>) { }
                c) proszę usunąć 2 ostatnie elementy listy i drugi element, następnie dodać do niej 4 inne elementy,
                  następnie wyświetlić listę i wielkość listy,
                d) proszę wyświetlić posortowną listę, oraz odwrotniee posortowaną i znów użyć metody z punktu b) do wyświetlenia
                  elementów listy
          */
        Scanner scan = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        for (int i = 0; i<5; i++){
            String temp = scan.nextLine();
            lista.add(temp);
        }
        wypisywanie(lista);
        lista.remove(-1);
        lista.remove(-1);
        lista.remove(2);
        lista.add("Papuga");
        lista.add("Slon");
        lista.add("Zolw");
        lista.add("Pingwin");
        wypisywanie(lista);
        System.out.print(lista.size());
        Collections.sort(lista);
        wypisywanie(lista);
        Collections.sort(lista, Collections.reverseOrder());
        wypisywanie(lista);


         /* zad.2 Napisać program który :
                a) stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury, liczby mają się powtarzać,
                b) następnie wyświetlić zawartość set-a w konsoli,
                c) następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
        Set<Integer> set = new TreeSet<>();
        for (int k = 0; k < 10; k++){
            set.add(scan.nextInt());
        }
        wypisywanie(set);

        
        /* zad.3* Dla chętnych, nie będzie oceniane:
                Napisać podobny program jak w zad.1 zamiast zwierząt wprowadzć dowolne dane 
                np. imiona, nazwiska, miasta, samochody ... . (dowolność),
                Wykonać na TreeSet 
                -- podpowiedź: Set<String> nazwaSeta = new TreeSet<>();
        */

    }
    public static void wypisywanie(List<String> a){
        for(String zmienna : a){
            System.out.printf(zmienna);
        }
    }
    public static void wypisywanie(Set<Integer> a){
        for(Integer zmienna : a){
            System.out.println(zmienna);
        }
    }

}
