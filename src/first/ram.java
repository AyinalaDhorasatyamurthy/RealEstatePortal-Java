package first;
import java.util.*;
public class ram {

	public static void main(String[] args) {
		
		int i,s,c;
		int l;
		Scanner h= new Scanner (System.in);
		c =h.nextInt();
		for(i=1;i<=c;i++)
		{
		  	System.out.println("the numbers are:"+"="+ i);
		}
		// if-else conditions:
		if(c%2==0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("given number is noteven");
		}
	    /// print stars
		System.out.println("enter the no.of rows");
		l = new Scanner(System.in).nextInt();
		for(i=1;i<=l;i++)
		{
			for(s=1;s<=i;s++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
