package Contact__us;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TODO_LIST {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
       WebElement addnewphoto = driver.findElement(By.cssSelector("#container > input[type=text]"));
       addnewphoto.click();
       addnewphoto.sendKeys("buy groceries");
       addnewphoto.sendKeys(Keys.RETURN);
       
      WebElement delete = driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[2]/span/i"));
      delete.click();
       
        
        
	}

}
