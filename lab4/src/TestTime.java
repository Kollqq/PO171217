public class TestTime {

    public static void main(String[] args) {
        Time t1 = new Time();
        t1.hours = 10;
        t1.minutes = 35;
        Time t2 = new Time();
        t2.hours = 5;
        t2.minutes = 39;
        Time result = t1.addTime(t2);
        System.out.println(result.hours+":"+result.minutes);
    }
}

class Time {
    int hours;
    int minutes;

    Time addTime(Time otherTime) {
        hours += otherTime.hours;
        minutes += otherTime.minutes;

        if(minutes > 59) {
            minutes -= 60;
            hours += 1;
        }

        if(hours > 23) {
            hours -= 24;
        }

        Time temp = new Time();
        temp.hours = hours;
        temp.minutes = minutes;
        return temp;
    }
}
