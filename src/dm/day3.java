package dm;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	

	@Test
	public void Day3Test1() {
				
		System.out.println("Day3Test1");
		//System.out.println(url);
		//System.out.println(unam);
	}
	
	@Test(groups= {"Smoke"})
	public void Day3Test2() {
				
		System.out.println("Day3Test2");
	}
	
	@Test
	public void Day3Test3() {
				
		System.out.println("Day3Test3");
	}
	
	@BeforeTest
	public void Day3Test4() {
				
		System.out.println("BeforeTest - Day3Test3");
	}

}
