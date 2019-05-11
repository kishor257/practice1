package staticClass;

public class OuterClass {
	
	private static String firstName = "kishor";
	public String lastName = "kumar";
	
	// Static nested class
	public class InnerClass {
		
		// Both static and non-static members of Outer class are accessible in this Inner class
		public void display(){ 
	          System.out.println(firstName+" " + lastName); 
	       } 
	}
	
	// non-static nested class - also called Inner class
	public static class NestedStaticClass{ 
	       
	       // Only static members of Outer class is directly accessible in nested  
	       // static class  
	       public void printMessage() {   
	         System.out.println(firstName);  
	       } 
	    } 
}
