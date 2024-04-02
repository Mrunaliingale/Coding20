import java.util.*;

public class SortingFirsthalf {
    public static void main(String args[]) {
        int[] array = { 8, 9, 6, 7, 2, 5, 4, 3, 1 };
        System.out.println("Original Array:");

        SortFirstHalfAscending(array);
        SortSecondHalfDescending(array);
        System.out.print("Sorted Array");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void SortFirstHalfAscending(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = i + 1; j < array.length / 2; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void sortSecondHalfDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}