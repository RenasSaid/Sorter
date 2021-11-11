package Sorter;
public class SortMain {
    public static void main(String[] args) throws Exception {
        int [] intArgs = new int[args.length];
        for (int a = 0; a < args.length; a++) {
            intArgs[a] = Integer.parseInt(args[a]);
        }
        for (int a : intArgs) {
            System.out.println(a);
        }
    }
}
