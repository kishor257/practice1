package options;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestOptional {
	@Parameters({"s1","s2"})
	@Test
	//if we dont take value from suite file, then it will print "sad year"
	public void abc(@Optional("sad")String s1,@Optional(" year")String s2){
		Reporter.log(s1+s2,true);	
	}
}
