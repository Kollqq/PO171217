public class H17 {
    public static void main(String[] args) {
        StringBuffer st = new StringBuffer("qwerty");
    }
    public static String capitalizeEverySecond (StringBuffer st) {
        for (int i = 0; i < st.length(); i++) {
            if (i % 2 != 0 && i > 0) {
                st.charAt(i);
            }
        }
    }
}
