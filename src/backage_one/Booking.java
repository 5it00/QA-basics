package backage_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {

	public static void main(String[] args) throws InterruptedException {
		String  emailuser= "khitam@hotmail.com";
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.Booking.com");
	//	driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(emailuser);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"new_password\"]")).sendKeys("khatooooooo12oooommmwa");
		driver.findElement(By.xpath("//*[@id=\"confirmed_password\"]")).sendKeys("khatooooooo12oooommmwa");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button")).click();
	}

}
