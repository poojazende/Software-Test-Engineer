package trainModule;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BusModule {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\selenium jar\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	    WebDriver w= new FirefoxDriver();
	    
	    //Driver gets the web application to open
	    w.get("https://www.goibibo.com/");
	    System.out.println("goibibo.com is opened");
	    
	    w.findElement(By.linkText("Bus")).click();
	
	    w.findElement(By.id("autosuggestBusSRPSrcHome")).sendKeys("Chennai Intl Airport");
	    Thread.sleep(2000);
	    w.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/section[1]/div[1]/section[1]/ul[1]/div[1]/div[1]/li[1]")).click();
	    Thread.sleep(2000);
	    
	    w.findElement(By.id("autosuggestBusSRPDestHome")).sendKeys("Ahmedabad");
	    Thread.sleep(2000);
	    w.findElement(By.xpath("//body[1]/div[1]/section[1]/section[1]/section[1]/section[1]/div[2]/section[1]/ul[1]/div[1]/div[1]/li[1]/span[1]")).click();
	    Thread.sleep(2000);
	    
	    w.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
	    Thread.sleep(1000);
	    w.findElement(By.xpath("//button[contains(text(),'Search Bus')]")).click();
	    Thread.sleep(2000);
	    
	    w.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[5]/section[1]/section[1]/div[1]/div[1]/img[1]")).click();
	    Thread.sleep(2000);
	    
	    Set <String> window = w.getWindowHandles();
		Iterator <String> it = window.iterator(); 
		String parentWindow = it.next();
		String childWindow1 = it.next(); 
							
		//Travel soon
		w.switchTo().window(childWindow1);
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		w.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		w.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		w.close();
		
		w.switchTo().window(parentWindow);
		w.findElement(By.linkText("Bus")).click();
		Thread.sleep(2000);
		
		w.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)w;
		js.executeScript("window.scrollTo(0,750)");
		Thread.sleep(2000);
		
		w.findElement(By.linkText("Manali")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//body/div[@id='root']/div[2]/section[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		//view bus
		w.findElement(By.xpath("//body[1]/div[1]/section[1]/section[1]/div[1]/div[2]/ul[1]/li[1]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
		w.findElement(By.linkText("Bus")).click();
		Thread.sleep(2000); 
		
	    js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);

		w.findElement(By.linkText("Mumbai")).click();
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//body/div[@id='root']/div[2]/section[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]/span[1]")).click();
		w.findElement(By.linkText("Bus")).click();
		Thread.sleep(2000); 
		
	    js.executeScript("window.scrollTo(0,500)");
	  	Thread.sleep(2000);

	  	w.findElement(By.linkText("Digha")).click();
	  	Thread.sleep(2000);
	  		
	  	w.findElement(By.xpath("//body/div[@id='root']/div[2]/section[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
	  	w.findElement(By.linkText("Bus")).click();
	  	Thread.sleep(2000); 
	  		
	    js.executeScript("window.scrollTo(0,500)");
  		Thread.sleep(2000);
	    w.findElement(By.linkText("APSRTC")).click();
	    Thread.sleep(2000);
	    w.findElement(By.xpath("//body[1]/div[1]/div[3]/section[2]/div[2]/div[4]/button[1]")).click();
	    Thread.sleep(2000);
	    w.findElement(By.xpath("//span[contains(text(),'10')]")).click();
	    Thread.sleep(2000);
	    w.findElement(By.xpath("//div[contains(text(),'GOT IT')]")).click();
	    Thread.sleep(2000);
	    w.findElement(By.xpath("//span[contains(text(),'HIDE BUSES')]")).click();
	    
	    w.close();
	}

}
