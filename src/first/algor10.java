package first;

import java.util.Scanner;

public class algor10 {
	public static void main(String[] args) {
        int n,key = 0; 
        int f=0;  
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

    

        for (int i = 0; i < n; i++)
        {
            if (a[i]>a[i+1]) {
            	key=i;
            	break;
              
            }
        }
        
        System.out.println("index found at "+(key));
       

	}  

}
