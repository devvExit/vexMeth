public class theSequencer {

    public static int sequencer(int n) {
        int a = 1, b = 1, c = 1;
        int sum = 0;
        for (int i = 1; i <= n - 1; i++) {
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(sequencer(22));
        }
    }
}