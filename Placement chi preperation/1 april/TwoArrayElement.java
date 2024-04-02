import java.io.*;
import java.util.Scanner;
public class TwoArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of array : ");
        int n = scanner.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the target value : ");
        int val = scanner.nextInt();
        
        int index1=-1, index2=-1;
        
        for(int i=0;i<(n-1);i++) {
            for(int j=(i+1);j<n;j++) {
                if((arr[i]+arr[j]) == val) {
                    index1 = i;
                    index2 = j;
                    break;
                }
            }
            
        }
        if(index1==-1 && index2==-1) {
            System.out.println("Elements not found");
        }else {
            System.out.println("The element at "+index1+" and "+index2+" is equal to "+val);
        }
    }
}