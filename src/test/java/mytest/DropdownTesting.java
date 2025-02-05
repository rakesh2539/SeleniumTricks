package mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTesting {
	
public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        
        driver.findElement(By.xpath("//*[@id='country']")).click();
        
        List <WebElement> dropdownoptions=   driver.findElements(By.xpath("//*[@id='country']//option"));
        
        List<String> Aftersortedoptions= new ArrayList<String>();
        
        for (WebElement element : dropdownoptions) {
        	
        	Aftersortedoptions.add(element.getText());
        	
		}
        
        Collections.sort(Aftersortedoptions);
        
        for (String sortlist : Aftersortedoptions) {
        	
        	System.out.println(sortlist);
			
		}
        
        if(dropdownoptions.equals(Aftersortedoptions)) {
        	
        	System.out.println("Dropdown is sorted");
        }
        else {
        	System.out.println("Dropdown is not sorted");
        }
        
        
        
        driver.quit();
		
		
	}

	

}
