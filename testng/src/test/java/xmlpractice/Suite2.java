package xmlpractice;

import org.testng.annotations.Test;

public class Suite2 {

	@Test(priority=0)
	public void fourthGear() {
		System.out.println("fourth gear");
		
	}
	@Test(priority=1)
	public void fifthGear() {
		System.out.println("fifth gear");
		
	}
	@Test(priority=2)
	public void sixthGear() {
		System.out.println("sixth gear");
		
	}


}
