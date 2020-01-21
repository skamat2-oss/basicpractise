package UdemyAssignments.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesAssign {
   public static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sanil Umakant Kamat\\eclipse-workspace\\sanilselenium\\lib\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//div[@id = 'content']/child::ul//li//a[contains(text(),'Nested')]")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle") ;
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		
	}

}
