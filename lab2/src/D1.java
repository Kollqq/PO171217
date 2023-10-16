public class D1 {
    public static void main(String[] args) {
        System.out.println(suma(10));
    }

    public static int suma(int n)
    {
        int sum = 0;
        int i = 1;
        while (i <= n){
            if (i % 2 != 0) {
                sum = sum + i;
            }
            else {
                sum = sum - i;
            }
            i++;
        }
        return sum;
    }
}
