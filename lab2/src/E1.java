import java.util.Random;

public class E1 {
    public static void main(String [] args){
        System.out.println(generateRandomInt());
    }

    public static int generateRandomInt()
    {
        Random rn = new Random();
        int res = rn.nextInt();

        return res;
    }
}
