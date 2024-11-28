package mytest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Finding_WebElementsByScrolling {

	WebDriver driver;

	@Test
	public void testbyscroll() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement textbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		textbox.sendKeys("books");
		textbox.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);

		int previouscount = 0;
		int currentcount = 0;
		while (true) {
			List<WebElement> books = driver
					.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//h2"));
			currentcount = books.size();
			for (WebElement book : books) {
				System.out.println(book.getText());
			}

			if (currentcount == previouscount) {
				break;

			}
			previouscount = currentcount;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(3000);

		}
		System.out.println("Total number of books :" + currentcount);
		driver.quit();
	}
}