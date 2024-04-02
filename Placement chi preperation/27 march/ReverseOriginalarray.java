import java.util.Scanner;

public class ReverseOriginalarray {
    public static void main(String args[]) {
        int[] array = { 8, 9, 7, 5, 6, 4, 6 };
        System.out.println("Original Array:");
        printArray(array);
        reverseArray(array);
        System.out.println("\nReverse of original array:");
        printArray(array);
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}