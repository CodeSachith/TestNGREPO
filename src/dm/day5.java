package dm;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day5 {
	
	
	@Test
	public void MoDay5Test1() {
		
		System.out.println("Day5Test1");
			
	}
	
	
	@Test
	public void MoDay5Test2() {
		
		System.out.println("Day4Test2");
	}
	
	@Test
	public void PoDay5Test3() {
		
		System.out.println("Day5Test3");
	}
	
	@BeforeSuite
	public void PoDay5Test4() {
		
		System.out.println("PoDay5Test4 - before suite");
	}
	
	@AfterSuite
	public void PoDay5Test5() {
		
		System.out.println("PoDay5Test5 - after suite");
	}
}
