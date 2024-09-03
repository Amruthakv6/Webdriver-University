package Contact__us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_ {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://webdriveruniversity.com/Login-Portal/index.html");
        WebElement username = driver.findElement(By.xpath("//*[@id=\"text\"]"));
        username.sendKeys("ammu");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("1234");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login.click();
	}

}
