package Contact__us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Checkbox_Radiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/");
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		Select dropdown = new Select(driver.findElement(By.id("dropdowm-menu-1")));
		//dropdown.selectByIndex(2);
		//dropdown.selectByValue("Java");
		dropdown.selectByVisibleText("SQL");
		
		Select dropdownn = new Select(driver.findElement(By.id("dropdowm-menu-2")));
		dropdownn.selectByIndex(3);
		//dropdownn.selectByValue("eclipse");
		//dropdownn.selectByVisibleText("Eclipse");
		
		Select dropdowns = new Select(driver.findElement(By.id("dropdowm-menu-3")));
		//dropdowns.selectByIndex(3);
		dropdowns.selectByValue("javascript");
		//dropdowns.selectByVisibleText("Javascript");
		
		
		WebElement option2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input"));
        option2.click();
        
        WebElement option4 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input"));
        option4.click();
        
       // WebElement yellow=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]"));
        //yellow.click();
        
        WebElement orange=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[4]"));
        orange.click();
        
        WebElement pumpkin=driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[3]"));
        pumpkin.click();
        
       Select drop = new Select(driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]")));
        //drop.selectByIndex(2);
        drop.selectByValue("apple");
       // drop.selectByVisibleText("Apple");
        
        
        
        
        
        
        
        
        
        
        
	}

}
