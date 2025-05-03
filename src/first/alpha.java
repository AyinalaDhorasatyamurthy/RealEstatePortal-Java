package first;
import java.util.*;
public class alpha {

	 public static void main(String[] args)
	 {
		 int i,k,a,b;
		 int v;
		 float m;
		 String s;
		 char c;
		 for(c='a';c<='z';c++)
		 {
			 System.out.println(c);
		 }
		 
		 // mutiplucation table:
		 System.out.println("enter the number u want:");
		 Scanner n= new Scanner (System.in);
		 k=n.nextInt();
		 System.out.print("the mutiplication table is:");
		 for(i=0;i<=10;i++)
		 {
			 System.out.println(k+"*"+i+"="+(k*i));
		 }
		 // mutiplucation table:between range a and b:
		 System.out.println("enter the number u want a:");
		 System.out.println("enter the number u want b:");
		 a=n.nextInt();
		 b=n.nextInt();
		 for(i=a;i<=b;i++)
		 {
			 System.out.println(k+"*"+i+"="+(k*i));
		 }
		 
		 System.out.println("you entered number is: ");
		 v=n.nextInt();
		 System.out.println("you entered float num is: ");
		 m=n.nextFloat();
		 System.out.println("you entered number is: ");
		 n.nextLine();// consume leftover newline character
		 s=n.nextLine();
		 System.out.println("you entered number is: "+v);
		 System.out.println("you entered float num is: 	"+m);
		 System.out.println("you entered number is: "+s);
		 
		// addition:
		 int h= new Scanner(System.in).nextInt();
		 int g= n.nextInt(); 
		 System.out.println("sum of the  number is: "+ "="+(h+g));
	 }
}
