package backage_one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Options {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("http://127.0.0.1:5500/select.html");
String mytitle = driver.getTitle();
System.out.println(mytitle);
List<WebElement>  myelements = driver.findElements(By.tagName("option"));
for(int i=0 ; i<myelements.size();i++) {
	System.out.println(myelements.get(i).getText());
}

	}

}
