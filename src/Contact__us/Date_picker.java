package Contact__us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Date_picker {

	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions options = new ChromeOptions();
	      WebDriver driver = new ChromeDriver();
	      driver.navigate().to("https://webdriveruniversity.com/Datepicker/index.html");
	      String month ="April 2005";
	      
	      WebElement datepickerInput =driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input"));
	      datepickerInput.click();
	      Thread.sleep(2000);
	      while(true)
	      {
	    	  String monthyeartext = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
	    	  if(monthyeartext.equals(month))
	    	  {
	    		  break;
	    		  
	    	  }
	    	  else
	    	  {
	    		  WebElement leftarrow = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[1]"));
	    		  leftarrow.click();
	    		  
	    		  
	    	  }
	    	  
	    
	      }
	      WebElement day = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[2]/td[5]"));
	      day.click();
	      
		}
	}

	      
	      
	      

	      
	      
	      

	