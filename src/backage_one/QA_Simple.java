package backage_one;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA_Simple {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		driver.findElement(By.id("email")).sendKeys("dr.kwady@hotmail.com");
		driver.findElement(By.id("pass")).sendKeys("dr.com");
		driver.findElement(By.id("bd")).sendKeys("10-7-2000");
		driver.findElement(By.id("phone")).sendKeys("596789980");
		driver.findElement(By.id("name")).sendKeys("khitam");
		driver.findElement(By.tagName("button")).click();
		//excellent Khitam ^-^

}

}
