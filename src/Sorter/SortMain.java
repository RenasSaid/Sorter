package Sorter;

public class SortMain {
    public static void main(String[] args) {

        Sorter sorter = new Sorter();
        int[] intArgs = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            intArgs[i] = Integer.parseInt(args[i]);
        }
        int[] sorted = sorter.sort(intArgs);
        for(int number : sorted){
            System.out.println(number);
        }
    }
}
