package UdemyAssignments.udemy;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class uiDropdownsedit {
    public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sanil Umakant Kamat\\eclipse-workspace\\sanilselenium\\lib\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		//adult tab
		WebElement adult= driver.findElement(By.id("Adults"));
		Select select= new Select(adult);
		select.selectByVisibleText("2");
		//children tab
		WebElement children = driver.findElement(By.id("Childrens"));
		Select tr = new Select(children);
		tr.selectByIndex(2);
		//infant tab
		WebElement infant = driver.findElement(By.id("Infants"));
		Select in = new Select(infant);
		in.selectByIndex(2);
		// calender selection
		driver.findElement(By.id("DepartDate")).click();
		while(!driver.findElement(By.cssSelector("div[class='title'] span[class='ui-datepicker-month']")).getText().equalsIgnoreCase("October")) {
			driver.findElement(By.className("nextMonth")).click();
		}
		List<WebElement> th =driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = th.iterator();
		for(int i = 0;i<th.size();i++) {
		
			it.next();
			String rg=th.get(i).getText();
			if(rg.equalsIgnoreCase("26"))
				th.get(i).click();
				//System.out.println(rg);
			
		}
		driver.findElement(By.id("SearchBtn")).click();
		String txt=driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(txt);
		
	}

	}
