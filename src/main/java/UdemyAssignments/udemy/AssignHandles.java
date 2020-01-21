package UdemyAssignments.udemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignHandles {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sanil Umakant Kamat\\eclipse-workspace\\sanilselenium\\lib\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//*[@id='content']/child::ul//li//a[contains(text(),'Windows')]")).click();
		driver.findElement(By.xpath("//div[@class='example']/child::a[contains(text(),'Click')]")).click();
		Set<String> itr = driver.getWindowHandles();
		Iterator<String> it = itr.iterator();
		String parent = it.next();
		String child =it.next();
		//getting child window title.
		System.out.println(driver.switchTo().window(child).getTitle());
		
		//getting parent window title.
		driver.switchTo().window(parent);
		String ParentTitle=driver.findElement(By.xpath("//div[@class='example']/child::h3")).getText();
		System.out.println(ParentTitle);		
			
		
		

	}

}
