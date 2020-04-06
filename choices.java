//  3 - https://grahammitchell.com/assignments/javahard-chap03.html
//      Java has two common commands used to display things on the screen. So far we have only looked at println(), but print() is sometimes used, too. This exercise will demonstrate the difference.

public class choices {
    public static void main(String[] args) {
        System.out.println("Alpha");
        System.out.println("Bravo");

        System.out.println("Charlie");
        System.out.println("Delta");
        System.out.println();

        System.out.print("Echo");
        System.out.print("Foxtrot");

        System.out.println("Golf");
        System.out.print("Hotel");
        System.out.println();
        System.out.println("India");

        System.out.println();
        System.out.println("This" + " " + "is" + " " + "a" + " test.");
    }
}