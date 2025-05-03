package first;
import java.util.*;
import java.math.BigInteger;

public class math {
     public static void main(String[] args)
     {
    	 String num1,num2;
    	 Scanner n= new Scanner(System.in); 
    	 System.out.print("enter the 1st large number");
    	 num1=n.nextLine();
    	 System.out.print("enter the 2st large number");
    	 num2=new Scanner(System.in).nextLine();
    	 BigInteger first=new BigInteger(num1);
    	 BigInteger sec=new BigInteger(num2);
    	 BigInteger sum;
    	 sum=first.add(sec);
    	 System.out.print("RESULT OF ADDTITION ="+sum);
     }
}
