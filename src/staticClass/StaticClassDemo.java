package staticClass;


public class StaticClassDemo {
	
	public static String msg="kishor";
	private static String pro="singer";
	
	public static void running(){
		
		System.out.println("Running");
	
	}
	
	public static class InnerClassDemo {
		 
		public static void study(){
			
			System.out.println(msg+" is studying");
			
			//private static variables and methods of outer class can be access in inner static class
			StaticClassDemo.running();
		}
	}
}
