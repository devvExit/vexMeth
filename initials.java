//  2 - https://grahammitchell.com/assignments/your-initials.html
//      Display your initials on the screen in block letters

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        //Calls alphabet array and sets int alphabetLength to the length of the alphabet
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int alphabetLength = alphabet.length;
        String[] ascii = { "  A  \n A A \nA   A\nAAAAA\nA   A\nA   A\nA   A\n",
                "BBBB \nB   B\nB   B\nBBBB \nB   B\nB   B\nBBBB \n",
                " CCC \nC   C\nC    \nC    \nC    \nC   C\n CCC \n",
                "DDDD \nD   D\nD   D\nD   D\nD   D\nD   D\nDDDD \n",
                "EEEEE\nE    \nE    \nEEE  \nE    \nE    \nEEEEE\n",
                "FFFFF\nF    \nF    \nFFF  \nF    \nF    \nF    \n",
                " GGG \nG   G\nG    \nGGGGG\nG   G\nG   G\n GGG \n",
                "H   H\nH   H\nH   H\nHHHHH\nH   H\nH   H\nH   H\n",
                "IIIII\n  I  \n  I  \n  I  \n  I  \n  I  \nIIIII\n",
                "JJJJJ\n  J  \n  J  \n  J  \nJ J  \nJ J  \n JJ  \n",
                "K   K\nK  K \nK K  \nKK   \nK K  \nK  K \nK   K\n",
                "L    \nL    \nL    \nL    \nL    \nL    \nLLLLL\n",
                "M   M\nMM MM\nMM MM\nM M M\nM   M\nM   M\nM   M\n",
                "N   N\nNN  N\nN N N\nN  NN\nN   N\nN   N\nN   N\n",
                " OOO \nO   O\nO   O\nO   O\nO   O\nO   O\n OOO \n",
                "PPPP \nP   P\nP   P\nPPPP \nP    \nP    \nP    \n",
                " QQQ \nQ   Q\nQ   Q\nQ   Q\nQ   Q\nQ  Q \n QQ Q\n",
                "RRRR \nR   R\nR   R\nRRRR \nR R  \nR  R \nR   R\n",
                " SSS \nS   S\nS    \n SSS \n    S\nS   S\n SSS \n",
                "TTTTT\n  T  \n  T  \n  T  \n  T  \n  T  \n  T  \n",
                "U   U\nU   U\nU   U\nU   U\nU   U\nU   U\nUUUUU\n",
                "V   V\nV   V\nV   V\nV   V\nV   V\n V V \n  V  \n",
                "W   W\nW   W\nW   W\nW W W\nWW WW\nWW WW\nW   W\n",
                "X   X\nX   X\n X X \n  X  \n X X \nX   X\nX   X\n",
                "Y   Y\n Y Y \n  Y  \n  Y  \n  Y  \n  Y  \n  Y  \n",
                "ZZZZZ\n    Z\n   Z \n  Z  \n Z   \nZ    \nZZZZZ\n" };

        //Opens scanner for input
        Scanner in = new Scanner(System.in); //Not fixing the leak here

        //Asks for first and last name
        System.out.print("First name: ");
        String first = in.next();
        System.out.print("Last name: ");
        String last = in.next();

        //Generate Strings for the initials of each word (could be one line, but whatever)
        String n1 = first.substring(0, 1);
        String n2 = last.substring(0, 1);

        //Make the characters uppercase so that they always match the array
        n1 = n1.toUpperCase();
        n2 = n2.toUpperCase();
        System.out.print("Initials: " + n1 + " " + n2);

        //Checks each letter in the alphabet against n1 & n2
        for (int i = 0; i < alphabetLength; i++) {
            char ch = (alphabet[i]);
            String chS = Character.toString(ch);
            if (n1.equals(chS)) {
                System.out.print("\n" + ascii[i]);
            }
        }
        for (int i2 = 0; i2 < alphabetLength; i2++) {
            char ch2 = (alphabet[i2]);
            String chS2 = Character.toString(ch2);
            if (n2.equals(chS2)) {
                System.out.print("\n" + ascii[i2]);
            }
        }
    }
}