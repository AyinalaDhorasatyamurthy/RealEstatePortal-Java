package first;

import java.util.Scanner;

//index of the last occurence of the largest element [1,6,2,3,4,6,5,6] ; o/p:7

public class algor7 
{
	public static void main(String[] args) {
        int n,key = 0;
        int occ=0;
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

        for (int i = 1; i < n; i++) {
            if (a[i] > min) {
                min = a[i];
                key=i;
            }
        }

        System.out.println("the index of the last occurence largest element is: " +occ);
        
    }

}
