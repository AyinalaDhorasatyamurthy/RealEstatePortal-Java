package first;
import java.util.Scanner;

public class algor5 {
    //returns the largest and smallest number in the array:
    public static void main(String[] args) {
        int n;
        int[] a = new int[20];
        Scanner c = new Scanner(System.in);
        System.out.print("enter the no.of elements:");
        n = c.nextInt();
        
        if (n <= 1) {
            System.out.println("FALSE");
            return;
        }

        System.out.println("the size of the array is:" + n);

        for (int i = 0; i < n; i++) {
            System.out.print("enter the value at index " + i + ": ");
            a[i] = c.nextInt();
        }

        int min = a[0];
        int max = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("the largest element is: " + max);
        System.out.println("the smallest element is: " + min);
    }
}
