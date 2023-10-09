import java.util.Scanner;

public class A1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int a = input.nextInt();
        System.out.println("Podaj druga liczbe");
        int b = input.nextInt();
        System.out.println("Dodawanie:" + (a+b));
    }
}
