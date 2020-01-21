package UdemyAssignments.udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sortTable {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sanil Umakant Kamat\\eclipse-workspace\\sanilselenium\\lib\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		List<WebElement> Originl = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> firstclm = new ArrayList<String>();
		for(int i=0;i<Originl.size();i++) {
			firstclm.add(Originl.get(i).getText());
		}
		System.out.println("---------before sorting------------------------");
		for(String s2:firstclm) {
			System.out.println(s2);
		}
		System.out.println("------------------after sorting-----------------");
	    Collections.sort(firstclm);
	    for(String s1:firstclm) {
	    	System.out.println(s1);
	    }
	}

}
