package first;

class language {
 String name;
  language()
  {
	  System.out.print("Constructor method called.\n");
  }
   language(String t)
   {
	   name=t;
	   
   }
   
   public static void main(String[] args)
   {
	   language cpp =new language();
	   language java =new language("java");
	   cpp.setname("C++");
	    java.getname();
	    cpp.getname();

   }

   void setname(String t)
   {
	   name =t;
   }
   void getname()
   {
	   System.out.println("Language name: " + name);
   }
     
}
  