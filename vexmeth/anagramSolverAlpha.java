package vexmeth;

public class anagramSolverAlpha {
    public static void main(String[] args) {
        int i, j, k, l;

        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                for (k = 1; k <= 4; k++) {
                    for (l = 1; l <= 4; l++) {
                        if ((i != j) && (j != k) && (i != k) && (l != i) && (l != j) && (l != k)) {
                            System.out.printf("" + i + j + k + l);
                            System.out.print("\t");
                        }
                    }

                }

            }

        }
    }
}