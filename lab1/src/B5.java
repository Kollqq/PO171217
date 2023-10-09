import java.util.Scanner;

public class B5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Napisz ile masz lat");
        int a = input.nextInt();
        if (a<18)
        {
            System.out.println("Jesteś niepełnoletni");
        }
        else if (a>=18 && a<65)
        {
            System.out.println("Jesteś dorosły");
        }
        else
        {
            System.out.println("Jesteś emerytem");
        }
    }
}
