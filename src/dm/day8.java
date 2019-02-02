package dm;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day8 {
	
	
	@Test
	public void MoDay8Test1() {
		
		Properties prop = new Properties();
		
		System.out.println("Day8Test1");
			
	}
	
	
	@Test
	public void MoDay8Test2() {
		
		System.out.println("Day8Test2");
	}
	
	@Test
	public void PoDay8Test3() {
		
		System.out.println("Day8Test3");
	}
	
	@BeforeSuite
	public void PoDay8Test4() {
		
		System.out.println("PoDay8Test4 - before suite");
	}
	
	@AfterSuite
	public void PoDay5Test5() {
		
		System.out.println("PoDay5Test5 - after suite");
	}
}
