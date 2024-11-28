package mytest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://testautomationpractice.blogspot.com/");
		List <WebElement> tabledatarows=driver.findElements(By.xpath("//table[@id='taskTable']//tr"));
		
		for(int i=1;i<tabledatarows.size();i++)
		{
			WebElement rows=tabledatarows.get(i);
			
			  List<WebElement> columns = rows.findElements(By.xpath(".//td"));

	            // Loop through each column and print the data
	            for (int j = 0; j <columns.size(); j++) {
	                String cellData = columns.get(j).getText();
	                System.out.print(cellData + "\t"); // Print each column's data with a tab space for separation
	            }
	            System.out.println();  // Newline after each row
	        }

	        // Close the driver
	        driver.quit();

}
}
