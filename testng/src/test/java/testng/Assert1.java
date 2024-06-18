package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 {
	
	String name="santh";
	
	
	@Test
	public void nameCheck() {
		
Assert.assertEquals(name, "santh");
		
	}

}
