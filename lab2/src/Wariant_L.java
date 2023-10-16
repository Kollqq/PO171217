import java.util.Scanner;

public class Wariant_L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++){

            int current = input.nextInt();
            if (current > largest){
                largest = current;
            }
            if (current < smallest){
                smallest = current;
            }
        }
        System.out.println("MAX: " + largest);
        System.out.println("MIN: " + smallest);
    }
}
