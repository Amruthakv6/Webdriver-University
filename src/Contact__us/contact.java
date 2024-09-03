package Contact__us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Desktop\\\\Automation\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.navigate().to("https://www.facebook.com");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.navigate().back();
		//driver.navigate().refresh();
		//driver.navigate().forward();
		
		//Xpath with OR 
		//WebElement username = driver.findElement(By.xpath("//*[@id= 'email' or @name ='email']"));
		//username.sendKeys("amrutha");
		
		//driver.findElement(By.name("email")).sendKeys("amrutha");
		WebElement login = driver.findElement(By.xpath("//*[@id= 'u_0_5_x9' or @name = 'login']"));
		login.click();
		//xpath with And
		
		//WebElement password = driver.findElement(By.xpath("//*[@id= 'pass' and  @name = 'pass']"));
		//password.sendKeys("3456");
		WebElement loginn = driver.findElement(By.xpath("//*[@type= 'submit' and @name = 'email']"));
		loginn.click();
	}



		

	}


