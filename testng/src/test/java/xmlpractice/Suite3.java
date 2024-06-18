package xmlpractice;

import org.testng.annotations.Test;

public class Suite3 {

	@Test(priority=0)
	public void seventhGear() {
		System.out.println("seventh gear");
		
	}
	@Test(priority=1)
	public void eightGear() {
		System.out.println("eight gear");
		
	}
	@Test(priority=2)
	public void nineGear() {
		System.out.println("nine gear");
		
	}


}
