import java.util.ArrayList;

public class TestPerson {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person();
        Person element = list.get(0);
        System.out.println(element.name);
    }
}

class  Person {
    public String name;

}
