package in.sddu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SdduSteps extends Srm {

	By usernametxt = By.xpath("//input[@id='Login1_UserName']");
	By passwordtxt = By.id("Login1_Password");
	By button = By.id("Login1_LoginButton");
	By sdstrans = By.xpath("//span[text()='  SRM Transaction']/ancestor::a/span");
	By directpo = By.xpath("//span[text()='5-    Direct PO']/ancestor::a");
	By supppliername = By.xpath("//input[@name='ddlBasicInformation_SupplierName']/../../td[2]");
	By supppliernametext = By.xpath("//input[text()='ddlBasicInformation_SupplierName']");
	By intedno = By.xpath("//input[@id='txtBasicInformation_IndentNo']");
	By dept1 = By.xpath("//input[@name='ddlBasicInformation_Department']/../../td[2]");
	By Delevryaddress = By.xpath("//textarea[@id='txtBasicInformation_DelAddress']");
	By totaopo = By.xpath("//input[@id='txtBasicInformation_POTotal']");
	By POcalButton = By.xpath("//input[@id='btnCalculate']");
	By item = By.xpath("//input[@id='dgItemDetails_ctl00_ctl04_rgEditItem_Input']/../../td[2]");
	By Qty = By.xpath("//input[@id='dgItemDetails_ctl00_ctl04_rgEditQty']");
	By Rate = By.xpath("//input[@id='dgItemDetails_ctl00_ctl04_rgEditRate']");
	By Savebuttun = By.xpath("//input[@id='ImageButton5']");

	By billingsite = By.xpath("//input[@id='ddlBasicInformation_BillingSite_Input']/../../td[2]");
	By intentdate = By.xpath("//input[@id='rdpBasicInformation_IndentDate_dateInput']");
	By Deleverydate = By.xpath("//input[@id='rdpBasicInformation_IndentDate_dateInput']");



	public void iOpenLoginPage() throws Exception {

		driver.findElement(usernametxt).sendKeys("c1439");
		Thread.sleep(2000);
		driver.findElement(passwordtxt).sendKeys("passwd@1");
		Thread.sleep(2000);
		driver.findElement(button).click();
	}

	public void sdsTransection() throws Exception {
		Thread.sleep(2000);
		driver.findElement(sdstrans).click();
		Thread.sleep(2000);
		driver.findElement(directpo).click();
		Thread.sleep(5000);
	}

	public  void iFillDirectPo() throws InterruptedException {
		driver.findElement(supppliername).click();
		driver.findElement(supppliernametext).click();
		
		driver.findElement(intedno).sendKeys("1233455");
		
		driver.findElement(dept1).click();
		
		driver.findElement(Delevryaddress).sendKeys("hjhfgdasfshrd");
		
		
		driver.findElement(intentdate).sendKeys("07/03/2024");
		
		driver.findElement(Deleverydate).sendKeys("20/03/2024");
		
		driver.findElement(billingsite).click();
		
		driver.findElement(item).click();
		
		driver.findElement(Qty).sendKeys("10");
		
		driver.findElement(Rate).sendKeys("20");
		
		//driver.findElement(totaopo).click();
		
		driver.findElement(POcalButton).click();
		
		driver.findElement(Savebuttun).click();
	}

}
