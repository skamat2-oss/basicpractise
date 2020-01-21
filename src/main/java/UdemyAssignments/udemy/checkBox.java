package UdemyAssignments.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox { 
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sanil Umakant Kamat\\eclipse-workspace\\sanilselenium\\lib\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//div[@id='checkbox-example']/child::fieldset/child::label//input[@value='option1']")).click();
		//driver.findElement(By.id("checkBoxOption2")).click();
		Boolean th=driver.findElement(By.xpath("//div[@id='checkbox-example']/child::fieldset/child::label//input[@value='option1']")).isSelected();
		System.out.println(th);
		driver.findElement(By.xpath("//div[@id='checkbox-example']/child::fieldset/child::label//input[@value='option1']")).click();
		Boolean tth=driver.findElement(By.xpath("//div[@id='checkbox-example']/child::fieldset/child::label//input[@value='option1']")).isSelected();
		System.out.println(tth);
		int a = driver.findElements(By.xpath("//div[@id='checkbox-example']/child::fieldset/child::label")).size();
		System.out.println(a);
		
	}

}
