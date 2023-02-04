package backage_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	
	public  static void main (String[] args){
	String useremail = "dr.kwady@hotmail.com";
	String userpass ="0098098";
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(useremail);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(userpass);
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/a")).click();
		
		//super*_*
	
	}
}
