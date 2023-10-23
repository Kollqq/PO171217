public class War_341 {
    public static void main(String [] args) {

        int[] tab = {-1, -2, 4, 5, 6};
        int odp = liczbaWartosci(tab);
        System.out.println(odp);
    }

    public static int liczbaWartosci(int[] tab)
    {
        int a = 0;
        for (int i = 0; i < tab.length; i++)
        {
            if (tab[i] > 0) {
                a += 1;
            }
        }
        return a;
    }
}
