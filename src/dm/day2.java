package dm;
import org.testng.annotations.Test;

public class day2 {
	
	
	@Test(groups= {"Smoke"})
	public void Day2Test1() {
				
		System.out.println("Day2Test1");
	}

	@Test(enabled = false)
	public void Day2Test2() {
				
		System.out.println("Day2Test2");
	}
	
	@Test(timeOut = 4000)
	public void Day2Test3() {
				
		System.out.println("Day2Test3");
	}
}
