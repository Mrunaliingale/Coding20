import java.util.HashSet;
import java.util.Scanner;

public class Commonelementarray {
    public static void main(String args[]) {
        int[] arr1 = { 3, 3, 6, 9, 7, 8, 5 };
        int[] arr2 = { 2, 3, 4, 2, 6, 9, 1 };
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    hs.add(arr1[i]);
                }
            }
        }
        for (int no : hs) {
            System.out.println(no + " ");
        }
    }
}