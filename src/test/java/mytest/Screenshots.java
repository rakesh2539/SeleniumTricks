package mytest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        
        //Full Screenshot
		
      /*  TakesScreenshot ts=(TakesScreenshot) driver;
        File sourcefile= ts.getScreenshotAs(OutputType.FILE);
        File targatefile=new File(System.getProperty("user.dir")+"\\Screenshots\\Fullpage.png");
        sourcefile.renameTo(targatefile);*/
        
        //Section of Page
        
    /*    WebElement SectionOfElement=  driver.findElement(By.xpath("//div[@class='a-section a-spacing-none aok-relative']"));
        File sourcefile=SectionOfElement.getScreenshotAs(OutputType.FILE);
        File targatefile=new File(System.getProperty("user.dir")+"\\Screenshots\\Sectionofpage.png");
        sourcefile.renameTo(targatefile)  ;   */
        
        
        //specific webElement
        
        WebElement logo= driver.findElement(By.xpath("//span[@id='logo-ext']/ancestor::a"));
        File sourcefile=logo.getScreenshotAs(OutputType.FILE);
        File targatefile=new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
        sourcefile.renameTo(targatefile);
        
        driver.quit();
        
	}
}
