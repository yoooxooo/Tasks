package technicalTasks.codeSimulator;

import technicalTasks.codeSimulator.classes.Algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Algorithms alg = new Algorithms();

        System.out.println(alg.factorial(5));

        System.out.println(alg.isPrimal(7));

        int[] arr = new int[] {3, 6, 8, 1, 2};

        int[] twoNums = new int[] {4, 6};

        System.out.println(twoNums[0] + " " + twoNums[1]);
        alg.swap(twoNums);
        System.out.println(twoNums[0] + " " + twoNums[1]);

        System.out.println(Arrays.toString(arr));

        System.out.println(alg.linearSearch(arr, 8));

        alg.bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(alg.fibonacci(17));

        alg.matrix();

        System.out.println(alg.uniqueCharacters("a"));
        System.out.println(alg.uniqueCharacters("asdfghjkl;a"));
        System.out.println(alg.uniqueCharacters("asdfghjkl;"));

        System.out.println(alg.equals("ADFGH", "ADFGH"));
        System.out.println(alg.equals("ADFGH", "АDFGH"));
    }
}
