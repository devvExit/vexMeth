
public class firstLinux {

    public static void main(String[] args) {
        l(3);
        String s = "FANCY";
        for (int i = 0; i < s.length(); i++) {
            spacer(i);
            System.out.println(s.charAt(i));
        }
        l(1);
    }

    public static void spacer(int n) {
        for (int i = n; i != 0; i--) {
            System.out.print(" ");
        }
    }

    public static void l(int n) {
        for (int i = n; i != 0; i--) {
            System.out.println("");
        }
    }
}