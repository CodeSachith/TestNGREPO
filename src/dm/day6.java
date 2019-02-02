package dm;
import org.testng.annotations.Test;

public class day6 {
	
	
	@Test
	public void Sachith() {
				
		System.out.println("Sachith");
	}
	
	@Test(dependsOnMethods = {"Sachith"})
	public void Chapa() {
				
		System.out.println("Chapa");
	}

	
	@Test
	public void Doll() {
				
		System.out.println("Doll");
	}

	
	

}
