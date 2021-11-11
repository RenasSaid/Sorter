package Sorter;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) throws Exception {
        int [] intArgs = new int[args.length];
        for (int a = 0; a < args.length; a++) {
            intArgs[a] = Integer.parseInt(args[a]);
        }
        Arrays.sort(intArgs);
        System.out.println("Sorted list: ");
        for (int a : intArgs) {
            System.out.println(a);
        }
    }
}
