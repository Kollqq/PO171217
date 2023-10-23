import java.util.ArrayList;

public class G10 {
    public static void main(String[] args) {
        ArrayList<Integer> lt = new ArrayList<>();
        for (int i = -5; i < 10; i++) {
            lt.add(i);
        }
        System.out.println(lt);
        System.out.println(copyArray(lt));
    }

    public static ArrayList copyArray(ArrayList<Integer> lt) {
        ArrayList<Integer> cp = new ArrayList<>();
        for (int j = 0; j < lt.size(); j++) {
            cp.add(j, lt.get(j));
        }
        return cp;
    }
}
