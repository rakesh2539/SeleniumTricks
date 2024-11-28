package mytest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parallel_with_Dataprovider {
    
    WebDriver driver;
    
    @Test(dataProvider = "dp")
    public void validateLogin(String username, String password) {
        
        driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://adactinhotelapp.com/");
        
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();
        
        boolean status;
        try {
        status = driver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed();
        Assert.assertTrue(status, "Login failed with username: " + username);
        }catch(Exception e) {
        	status=false;
            Assert.assertTrue(status, "Login failed with username: " + username);
        }
        finally {
        driver.quit();
        }
    }
    
    @DataProvider(name="dp",parallel = true)
    public String[][] Testdata() {
    	String [][] data= {
    			
    			{"reyaz080","reyaz123"},
    			{"reyaz0806","reyaz13"},
    			{"reyaz080","reyaz13"},
    			{"reyaz0806","reyaz123"}
    			
    	};
    	
        return data;
       
}
}