package Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void FacebookTest() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		String actualTitle=d.getTitle();
		System.out.println(actualTitle);
		
		
	

}
}
