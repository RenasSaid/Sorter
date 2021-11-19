package Test;
import Sorter.Sorter;

public class SortTest {
    public static void main(String[] args) {
        SortTester();
    }
    public static boolean SortTester(){   
        if (testSorterMain1()){
            System.out.println("Test1 Ok");
        } else {
            System.err.println("Error Test1: Not Sorted");
        }

        if (testSorterMain2()){
            System.out.println("Test2 Ok");
        } else {
            System.err.println("Error Test2: Not Sorted");
        }

        if (testSorterMain3()){
            System.out.println("Test3 Ok");
        } else {
            System.err.println("Error Test3: Not Sorted");
        }

        if (testSorterMain4()){
            System.out.println("Test4 Ok");
        } else {
            System.err.println("Error Test4: Not Sorted");
        }

        if (testSorterMain5()){
            System.out.println("Test5 Ok");
        } else {
            System.err.println("Error Test5: Not Sorted");
        }
        
        return true;
    }

    public static boolean testSorterMain1(){
        Sorter s = new Sorter();
        int[] arrList = {337, 765, 525, 234};
        int[] result = s.sort(arrList);
        int[] expected = {6, 234, 337, 525, 765};
        for (int i = 0; i < result.length; i++) {
            if (result[i] != expected[i]){
                System.out.println("Test1 Failed");
                return false;
            }
            
        }
        return true;
    }
    public static boolean testSorterMain2(){
        Sorter s = new Sorter();
        int[] arrList = {};
        int[] result = s.sort(arrList);
        int[] expected = {};
        for (int i = 0; i < result.length; i++) {
            if (result[i] != expected[i]){
                System.out.println("Test2 Failed");
                return false;
            }
            
        }
        return true;
    }

    public static boolean testSorterMain3(){
        Sorter s = new Sorter();
        int[] arrList = {-1, 23, -55, -134, 0};
        int[] result = s.sort(arrList);
        int[] expected = {-134, -55, -1, 0, 23};
        for (int i = 0; i < result.length; i++) {
            if (result[i] != expected[i]){
                System.out.println("Test3 Failed");
                return false;
            }
            
        }
        return true;
    }

    public static boolean testSorterMain4(){
        Sorter s = new Sorter();
        int[] arrList = {6, 337, 765, 525, 234};
        int[] result = s.sort(arrList);
        int[] expected = {6, 234, 337, 525, 765};
        for (int i = 0; i < result.length; i++) {
            if (result[i] != expected[i]){
                System.out.println("Test4 Failed");
                return false;
            }
            
        }
        return true;
    }

    public static boolean testSorterMain5(){
        Sorter s = new Sorter();
        int[] arrList = {6, 337, 765, 525, 234};
        int[] result = s.sort(arrList);
        int[] expected = {6, 234, 337, 525, 765};
        for (int i = 0; i < result.length; i++) {
            if (result[i] != expected[i]){
                System.out.println("Test5 Failed");
                return false;
            }
            
        }
        return true;
    }
}
