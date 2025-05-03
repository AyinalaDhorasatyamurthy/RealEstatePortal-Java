package first;
import java.util.* ;
class grandfather {
 int a;
 grandfather(int a)
 {
	 this.a=a;
 }
}
 class parent extends grandfather {
		  int b;
		 
		  parent(int a, int b)
		  {
		    super(a);
		    this.b = b;
           }
		  
		  
		  void show() {
			    System.out.println("GrandParent's a = " + a);
			    System.out.println("Parent's b      = " + b);
			  }

	 }
 class father {
	 int a;
	 father(int c)
	 {
		 a=c;
	 }
	}
	 class child extends father  {
			  int b;
			 
			  child(int c, int d)
			  {
			    super(c);
			    b = d;
	           }
			  
			  
			  void show() {
				    System.out.println("father's a = " + a);
				    System.out.println("childs's b = " + b);
				  }

		 }
	 
public class grand
{
	public static void main(String[] args)
	{
		int c,d;
		 c=new Scanner(System.in).nextInt();
		 d=new Scanner(System.in).nextInt();

		parent p= new parent(c,d);
		child k= new child(8,9);
		k.show();
		p.show();

	}
}
		  
