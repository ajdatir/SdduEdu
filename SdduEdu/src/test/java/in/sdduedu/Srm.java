package in.sdduedu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Srm {
	
	public static WebDriver driver;
	public static String ulr = "http://40.80.91.220/SDUU_LIVE_TEST/Default.aspx";
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get(ulr);
		Thread.sleep(4000);
	   new SdduSteps().iOpenLoginPage();
	   Thread.sleep(2000);
		new SdduSteps().sdsTransection();
		Thread.sleep(2000);
		 new SdduSteps().iFillDirectPo();
	   
		driver.close();
		
		
		
		
		
		
	}

}
