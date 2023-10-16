public class D6 {
    public static void main(String[] args){
        System.out.println(sev(3));
    }

    public static double sev(int n)
    {
        double res = 0;
        double il = 1;
        double a = 7;
        for (int i = 0; i < n; i++){
            il = il * a;
        }
        res = 1 / il;
        return res;
    }
}
