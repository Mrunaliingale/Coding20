import java.util.Scanner;

public class REmoveDuplicateElement {
    public static void main(String[] args) {
        int[] a = { 9, 7, 6, 6, 6, 3, 0, 6, 8, 6 };
        int[] temp = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j] = a[i];
                j++;
            }
        }
        temp[j] = a[a.length - 1];
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + "  ");
        }
    }
}