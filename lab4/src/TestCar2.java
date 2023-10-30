public class TestCar2 {

    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.brand = null;
        if (c1.brand == null)
            System.out.println(c1.brand);
    }
}

class Car2 {
    String brand;
}
