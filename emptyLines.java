
public class emptyLines {
    public static void main(String[] args) {
        sout("________________________________________");
        l(1);
        sout("sorry was making food");
        l(2);
        sout("ok dumb it down for me im high");
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