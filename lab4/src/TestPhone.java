public class TestPhone {

    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBatteryCapacity(1000);
        System.out.println(p1.boostBattery(2, 500));
    }
}

class Phone {
    private int batteryCapacity;

    public void setBatteryCapacity(int value) {
        batteryCapacity = value;
    }

    public int boostBattery(int value1, int value2) {
        batteryCapacity = batteryCapacity*value1 + value2;
        return batteryCapacity;
    }
}
