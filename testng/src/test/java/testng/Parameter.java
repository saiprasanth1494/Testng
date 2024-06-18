package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	
	@Test
	@Parameters("name")
	public void enterTheName(String name) {
		System.out.println("the name is" +name);
	}

}
