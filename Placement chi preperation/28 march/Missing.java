import java.util.Scanner;

public class Missing{
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9 };
        int expected_no = arr.length + 1;
        int total_Sum = expected_no * (expected_no + 1) / 2;
        int Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Sum = Sum + arr[i];
        }
        System.out.println("Missing Number:" + (total_Sum - Sum));

    }
}