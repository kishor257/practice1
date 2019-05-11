package skipMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipAMethod {

	@Test
	public void method1(){
		Reporter.log("method 1",true);
	}
	@Test
	public void method2(){
		Reporter.log("method 2",true);
	}
	@Test
	public void method3(){
		Reporter.log("method 3",true);
	}
	@Test
	public void method4(){
		Reporter.log("method 4",true);
	}
	@Test
	public void method5(){
		Reporter.log("method 5",true);
	}
	@Test
	public void method6(){
		Reporter.log("method 6",true);
	}

}
