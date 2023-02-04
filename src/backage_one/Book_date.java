package backage_one;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https:\\www.Booking.com");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/div/form/div[1]/div[2]/div/div/button[1]")).click();
	}

}
