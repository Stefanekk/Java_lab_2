public class Main {

    public static int main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        for (int i = 1; i<5; i++){
            if (i == 2){
                break;
            }
        }
        for (int x = 0; x <= 5; x++){
            if (x == 2 || x == 3){
                System.out.printf("%d\n", x);
            }
            else{
                continue;
            }
        }
        for (int k = 5; k >= 0; k--){
            if (k == 2){
                return k;
            }
        }
        return 0;
    }
}
