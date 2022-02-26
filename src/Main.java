import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String q ="Привет группа 132";
        String qUpper = q.toUpperCase(Locale.ROOT);
        System.out.println(qUpper);
        System.out.println(q.length());

    }
}