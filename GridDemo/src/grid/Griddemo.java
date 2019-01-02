package grid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Griddemo {
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","F:\\javasewebdriver\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.myntra.com/register");
		dr.findElement(By.name("email")).sendKeys("pkiran833@gmail.com");
		dr.findElement(By.name("password")).sendKeys("kiran@123");
		dr.findElement(By.name("mobile")).sendKeys("1234567890");
		dr.findElement(By.id("male")).click();
		dr.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[2]/button")).click();
	
	}

}
