package staticClass;

public class StaticClassDemoRunner {
	
	public static void main(String[] args) {
		
		//we can use static inner class and static methods without creating an object
		StaticClassDemo.InnerClassDemo.study();
		
		String msg = StaticClassDemo.msg;
		System.out.println(msg);
		
		StaticClassDemo.running();
	}

}
