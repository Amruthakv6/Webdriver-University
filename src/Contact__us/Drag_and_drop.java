package Contact__us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://webdriveruniversity.com/Actions/index.html");
        //driver.switchTo().frame(0);
        WebElement sourceelement = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p/b"));
        WebElement targetelement = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
        
        Actions ac = new Actions(driver);
        ac.clickAndHold(sourceelement).moveToElement(targetelement).release().build().perform();
        
        
       // Actions acc = new Actions(driver);
        WebElement link = driver.findElement(By.xpath("//*[@id=\"double-click\"]/h2"));
        ac.doubleClick(link).perform();
        
	}
}
        
        
        
        
        
        
	
