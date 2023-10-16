import java.util.Arrays;

public class F9 {
    public static void main(String[] args){

        int[] tab;
        tab = new int[20];
        for (int j = 0; j < 20; j++){
            tab[j] = j;
        }

        int a = 0;
        int b = 0;

        for (int i = 0; i < 20; i++){
            if (tab[i] % 2 == 0){
                a += 1;
            }
            else {
                b += 1;
            }
        }
        System.out.println("liczb parzystych: " + a);
        System.out.println("liczb nieparzystych: " + b);
    }
}
