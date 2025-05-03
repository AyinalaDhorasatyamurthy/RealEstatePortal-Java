package first;

import java.util.Scanner;

public class fartoces {
	
		public static void main(String[] args) {
			
			float temp,temp1,c;
			double f;
			System.out.print("enter the temperatue in Fahrenheit =");
			temp=new Scanner (System.in).nextInt();
			c= ((temp-32)*5)/9;
			System.out.print("Temperatue in Celsius"+"="+c);
			System.out.print("\n enter the temperatue in Celsius=");
			temp1=new Scanner (System.in).nextInt();
			f=((temp1*(1.8))+32);
			System.out.print("Temperatue in Fahrenheit"+"="+f);
		
			fartoces.staticmethod();   
			fartoces object = new   fartoces();
		    object.nonStaticMthod();

		} 
		static {
		    System.out.println("Static block is executed before main method.");
		  }

		static void staticmethod()
		{
		 
		    int n;
		    String s = "Java programming", t = "", u = "";
		 
		    System.out.println(s);
		 
		    // Find length of string
		 
		    n = s.length();
		    System.out.println("Number of characters = " + n);
		 
		    // Replace characters in string
		 
		    t = s.replace("Java", "C++");
		    System.out.println(s);
		    System.out.println(t);
		 
		    // Concatenating string with another string
		 
		    u = s.concat(" is fun");
		    System.out.println(s);
		    System.out.println(u);
		  }

		  void nonStaticMthod() {
		    System.out.println("Non static method must be called by creating an object");
		  }

}






