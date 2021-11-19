package Sorter;

public class SortMain {
    public static void main(String[] args) {

        Sorter sorter = new Sorter();   //hämtar data från Sorter filen.
        int[] intArgs = new int[args.length]; //Tar längden av argument som ges, in i listan.

        for (int i = 0; i < args.length; i++) {  //Lopar igenom listan.
            intArgs[i] = Integer.parseInt(args[i]);  //Parsear argument till Int.
        }
        int[] sorted = sorter.sort(intArgs);  //hämtar sorterad lista från Sorter
        for(int number : sorted){       //Loopar igenom sorterad lista
            System.out.println(number);     //Printar ut sorterad lista
        }
    }
}
