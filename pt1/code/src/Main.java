import java.util.Scanner;

public class Main {

    private static int[] quadrada(int[] array) {

        int[] max = new int[] { 0, 0, 0 };
        int thisSum = 0;
        int numIte = 0;

        for (int i = 0; i < array.length; i++) {
            numIte ++;
            for (int j = i; j < array.length; j++) {
                numIte++;
                thisSum += array[j];
                if (thisSum > max[2]) {
                    max = new int[] { i, j, thisSum };
                }
            }
            thisSum = 0;
        }

        System.out.println("Iteracions quadrada: " + numIte);
        return max;
    }

    private static int[] lineal(int[] array) {

        int[] max = new int[] { 0, 0, 0 };
        int thisSum = 0;
        int numIte = 0;
        int qt = 0;
        int seqAux = array.length + 1;

        for (int i = 0; i < array.length; i++) {
            numIte++;
            thisSum += array[qt];
            if (thisSum < 0) {
                thisSum = 0;
                qt = i + 1;
                seqAux = array.length + 1;
            } else {
                if (thisSum > max[2]) {
                    max[2] = thisSum;
                    if(qt < seqAux){
                        max[0] = qt;
                        seqAux = qt;
                    }
                    max[1] = i;
                }
                qt++;
            }
        }

        System.out.println("Iteracions lineal: " + numIte);
        return max;
    }

    private static String stringifySequence(int[] sequence) {
        String res = "[ ";

        for (int i = 0; i < sequence.length; i++)
            res += sequence[i] + ", ";

        return res.substring(0, res.length() - 2) + " ]";
    }

    private static void printMenu(int[][] sequences) {
        System.out.println("Selecciona una opció (1-" + (sequences.length + 1) + "):");

        for (int i = 0; i < sequences.length; i++) {
            System.out.println((i + 1) + ". Testcase " + (i + 1) + " " + stringifySequence(sequences[i]));
        }

        System.out.println(sequences.length + 1 + ". Sortir");
    }

    public static void main(String[] args) {
        int [][] sequences = new int[][] {
                { -7, -4, 22, 1, -5, -2 },
                { 23, -2, 15, -5, -7, 49, 23, -50, -2, 78 },
                { -7, 8 }
        };
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        while (choice != sequences.length + 1) {
            printMenu(sequences);
            choice = scanner.nextInt();

            if (choice > 0 && choice <= sequences.length) {
                System.out.println();
                System.out.println("(Inici, Final, Màxim) -> " + stringifySequence(lineal(sequences[choice - 1])));
                System.out.println("(Inici, Final, Màxim) -> " + stringifySequence(quadrada(sequences[choice - 1])));
                System.out.println();
            }
        }
    }
}
