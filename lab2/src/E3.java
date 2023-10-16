import java.util.Random;

public class E3 {
    public static void main (String [] args){
        System.out.println(generateRandomIntInRange(5, 10));
    }

    public static int generateRandomIntInRange(int a, int b)
    {
        Random rn = new Random();
        int res = rn.nextInt(b+1-a)+a;
        return res;
    }
}

