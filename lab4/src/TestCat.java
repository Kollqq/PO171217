public class TestCat {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat res = c1.createCat("Qwerty");
        System.out.println(res.name);
    }
}

class Cat {
    String name;

    Cat createCat(String value) {

        Cat temp = new Cat();

        if(value != null) {
            temp.name = value;
        }
        else {
            System.out.println("null");
        }
        return temp;
    }
}
