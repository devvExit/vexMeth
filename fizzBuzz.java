public class fizzBuzz {
    public static void main(String[] args) {
        String out = "";
        for (int i = 0; i <= 100; i++) {
            out = "";
            if (i % 3 == 0)
                out = out + "Fizz";
            if (i % 5 == 0)
                out = out + "Buzz";
            if (out == "")
                System.out.println(i);
            else
                System.out.println(out);
        }
    }
}
