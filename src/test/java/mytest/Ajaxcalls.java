package mytest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Ajaxcalls {

	
	 WebDriver driver;
	    
	    @Test
	    public void validateLogin() {
	        
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
	        
	        driver.findElement(By.xpath("//button[text()='Load AJAX Content']")).click();
	        
	        
	        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        WebElement lodedElement=   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='AJAX Content Loaded']//parent::div")));
	
	        System.out.println(lodedElement.getText());
	        
	        
	    }

	    
	    @AfterMethod
	    public void teardown() {
	    	driver.quit();
}
}