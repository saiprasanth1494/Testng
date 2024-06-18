package testng;

import org.testng.annotations.Test;

public class Grouping {

	@Test	(groups= {"apple"})
	public void apple1() {
		System.out.println("apple1");
	}

	@Test	(groups= {"apple"})
	public void apple2() {
		System.out.println("apple2");
	}
	@Test	
	public void mac1() {
		System.out.println("mac1");
	}
	@Test	
	public void mac2() {
		System.out.println("mac2");
	}
	@Test	
	public void pod1() {
		System.out.println("pod1");
	}
	@Test	
	public void pod2() {
		System.out.println("pod2");
	}


}
