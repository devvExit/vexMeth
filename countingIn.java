
public class countingIn {
    public static String letterCount(String S) {
        //Count each occurence of every character
        int charCounter = 0;
        String current = "";
        String counted = "";
        String temp = "";
        for (int n = 1; n <= S.length(); n++) {
            current = S.substring(n - 1, n);
            temp += current;

            //Counts every character of one type!!
            for (int ii = 0; ii <= S.length() - 1; ii++) {
                if (temp.contains(S.substring(ii, ii + 1))) {
                    charCounter++;
                }
            }
            //If result string does not contain the current letter, add the result.
            if (!counted.contains(S.substring(n - 1, n))) {
                counted += charCounter + current + " ";
                charCounter = 0;
                temp = "";
            }
            //If result string DOES contain the current letter, reset character counter and reset temp
            if (counted.contains(S.substring(n - 1, n))) {
                charCounter = 0;
                temp = "";
            }
        }
        return counted;
    }
        
    public static void main(String[] args) {
        String S, o, u;
        int l;

        S = "vexolology";
        o = "";
        u = "";
        l = S.length()-1;

        for (int i = 0; i <= l; i++) {
            o += S.substring(i, i + 1) + " ";
            u += i + " ";
        }
        System.out.println("\n\n");
        System.out.println("We are using the string:\t\t\t" + S);
        System.out.println("The length of this string is:\t\t\t" + (S.length()) + " letters");
        System.out.println("In .substring(0,9), it counts like this: \t" + o);
        System.out.println("\t\t\t\t\t\t" + u);
        System.out.print("The string contains:\t\t\t\t");
        System.out.print(letterCount(S));
        
        
    }
}
