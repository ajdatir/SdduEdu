package in.sdduedu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions extends SdduSteps {
	
	public static void igetElement(By usernametxt) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(usernametxt));
		element.click();
	}
	public static void igetElementandType(By usernametxt, String text) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(usernametxt));
		element.sendKeys(text);
	}


}
