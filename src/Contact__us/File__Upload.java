package Contact__us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File__Upload {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.navigate().to("https://webdriveruniversity.com/File-Upload/index.html");
	       WebElement fileuploadd = driver.findElement(By.xpath("//*[@id=\"myFile\"]"));
	       fileuploadd.sendKeys("C:\\Users\\dell\\Downloads\\interviewqnpostman.pdf");
	       Thread.sleep(5000);
	       
	       WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
			submit.click();
			
	       
	       
	}

}
