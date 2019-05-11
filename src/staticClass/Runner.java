package staticClass;

public class Runner {

	public static void main(String[] args) {

		// creating instance of nested Static class
		OuterClass.NestedStaticClass outernestedstatic=new OuterClass.NestedStaticClass();
		// calling non static method of nested static class
		outernestedstatic.printMessage();

		// In order to create instance of Inner class we need an Outer class instance
		OuterClass outer=new OuterClass();
		OuterClass.InnerClass inner  = outer.new InnerClass();
		// calling non-static method of Inner class
		inner.display();

		// we can also combine above steps in one step to create instance of Inner class 
		OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();    
		// similarly we can now call Inner class method 
		innerObject.display();
	}
}
