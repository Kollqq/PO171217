import java.util.Arrays;

public class F1 {
    public static void main(String [] args){
        int[] tab;
        tab = new int[10];
        for (int j = 0; j < 10; j++){
            tab[j] = j;
        }
        System.out.println(Arrays.toString(tab));
        reveresArray(tab);
        System.out.println(Arrays.toString(tab));
    }

    public static void reveresArray(int[] tab)
    {
        for (int i = 0; i<tab.length/2; i++)
        {
            int temp = tab[i];
            tab[i] = tab[tab.length-1-i];
            tab[tab.length-1-i] = temp;
        }
    }
}
