import java.util.ArrayList;

public class G3 {
    public static void main(String[] args) {
        ArrayList<Integer> lt = new ArrayList<>();
        for (int i = -5; i < 10; i++) {
            lt.add(i);
        }

        int a = minimumValue(lt);
        System.out.println(a);
    }

    public static int minimumValue(ArrayList<Integer> lt) {
        int smallest = Integer.MAX_VALUE;

        for (int j = 0; j < lt.size(); j++) {
            if (lt.get(j) < smallest) {
                smallest = lt.get(j);
            }
        }
        return smallest;
    }
}
