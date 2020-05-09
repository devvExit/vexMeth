
public class emptyLines {
    public static void main(String[] args) {
        sout("________________________________________");
        l(1);
        sout("First line");
        l(2);
        sout("Second line");
        l(3);
        sout("________________________________________");
    }

    public static void l(int n) {
        for (int i = n; i != 0; i--) {
            System.out.println(i + "*");
        }
    }

    public static void sout(String s) {
        System.out.println(s);
    }

}