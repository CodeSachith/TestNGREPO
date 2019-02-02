package dm;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day7 {
	
	
	@Test(dataProvider = "getData")
	public void Day7Test1(String uname, String pass) {
				
		System.out.println("Day7Test1");
		
		System.out.println(uname);
		System.out.println(pass);
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "uname1";
		data[0][1] = "pass1";
		
		data[1][0] = "uname2";
		data[1][1] = "pass2";
		
		data[2][0] = "uname3";
		data[2][1] = "pass3";
		
		return data;
	}
	
	
	
	

}
