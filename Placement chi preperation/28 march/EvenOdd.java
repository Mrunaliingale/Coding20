import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = { 0, 5, 6, 8, 9, 3, 2, 6, 1, 0 };
        int evenc = 0, oddc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenc++;
            } else {
                oddc++;
            }
        }
        System.out.println("Count of Even Number:" + evenc);
        System.out.println("Count of Odd Number:" + oddc);
    }
}
