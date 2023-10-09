import java.util.Scanner;

public class B7 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a");
        int a = input.nextInt();
        System.out.println("Podaj b");
        int b = input.nextInt();
        System.out.println("Podaj c");
        int c = input.nextInt();

        if (a>b && b>c)
        {
            System.out.print(c+" "+b+" "+a);
        }
        else if (b>a && a>c)
        {
            System.out.print(c+" "+a+" "+b);
        }
        else if (c>a && a>b)
        {
            System.out.print(b+" "+a+" "+c);
        }
        else if (a>c && c>b)
        {
            System.out.print(b+" "+c+" "+a);
        }
        else if (b>c && c>a)
        {
            System.out.print(a+" "+c+" "+b);
        }
        else if (c>b && b>a)
        {
            System.out.print(a+" "+b+" "+c);
        }
        else
        {
            System.out.println(a+" "+b+" "+c);
        }
    }
}
