import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int rev = 0, rem;
        int backup = n;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (backup == rev) {
            System.out.println("The  number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }

    }
}