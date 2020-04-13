package vexmeth;

public class test {
    public static void main(String[] args) {
        String s = "123456";
        int l = s.length() / 2;
        String newS = s.substring(l);
        if (newS.substring(0, 2).equals("45") && newS.substring(0).endsWith("6")) {
            System.out.print(newS);
        }

        // OUTPUT: One!Two!One!
    }
}