package testcase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;



public class MytestCase {

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	DesktopOptions option = new DesktopOptions();

	option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
	
	WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
	pause(10);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement num = driver.findElement(By.name("Two"));
	num.click();
	WebElement plus = driver.findElement(By.id("93"));
	plus.click();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	num.click();
	WebElement equals = driver.findElement(By.name("Equals"));
	equals.click();
	pause(20);
	//driver.close();

}
	
	
	
	 public static void pause( int text) {
		 
		 try {  
			 
			 
			   
			 // The main thread sleeps for the 1000 milliseconds, which is 1 sec  
			
			 Thread.sleep(text*1000);  
			 System.out.println("Loading....in "+text+".....seconds."); 
			
		//	 logger.log(LogStatus.INFO, "wait For'" + text + "' for element: ");
			   
			 }  
			 catch (Exception expn)   
			 {  
			 // catching the exception  
			 System.out.println(expn);  
			 }  
		 }
}
