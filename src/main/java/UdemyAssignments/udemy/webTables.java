package UdemyAssignments.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTables {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sanil Umakant Kamat\\eclipse-workspace\\sanilselenium\\lib\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement table = driver.findElement(By.id("product"));
		//ROWS
		System.out.println(table.findElements(By.tagName("tr")).size());
		
		//COLUMNS
		System.out.println(table.findElements(By.tagName("th")).size());
		
		//PRINTING THE SECOND ROW
		System.out.println(driver.findElement(By.xpath("//*[@id='product']/child::tbody/child::tr[2]")).getText());
		
	}

}
