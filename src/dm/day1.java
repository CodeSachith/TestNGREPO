package dm;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@Parameters({"URL","uname"})
	@Test
	public void Day1Test1(String url,String unam) {
		
		System.out.println("Day1Test1");
		System.out.println(url);
		System.out.println(unam);
			
	}
	
	
	
	@Test(groups= {"Smoke"})
	public void Day1Test2() {
		
		System.out.println("Day1Test2");
	}
	
	@BeforeMethod
	public void Day1Test3() {
		
		System.out.println("run before every method");
		
	}
	
	@AfterMethod
	public void Day1Test4() {
		
		System.out.println("run after every method");
		
	}
}
