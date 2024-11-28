package mytest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MandatoryFiledsChecking {
	
	WebDriver driver;
	
	@Test
	public void mandatoryfieldstest()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		List <WebElement> elements=	driver.findElements(By.xpath("//form[@method='post']/div"));
		
		for(WebElement element:elements)
		{
			System.out.println(element.getText());
		}
	}

}
