package xmlpractice;

import org.testng.annotations.Test;

public class Suite1 {



@Test(priority=0)
public void firstGear() {
	System.out.println("first gear");
	
}
@Test(priority=1)
public void secondGear() {
	System.out.println("second gear");
	
}
@Test(priority=2)
public void ThirdGear() {
	System.out.println("third gear");
	
}}

