public class H3 {
    public static void main(String [] args) {
        String s1 = "Q w E r T y";
        System.out.println(DelSpace(s1));
    }

    public static String DelSpace(String str) {
        str = str.replaceAll("\\s", "");
        return str;
    }
}
