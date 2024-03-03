package in.sdduedu;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SdduSteps extends Srm {

	By usernametxt = By.xpath("//input[@id='Login1_UserName']");
	By passwordtxt = By.id("Login1_Password");
	By button = By.id("Login1_LoginButton");
	By sdstrans = By.xpath("//span[text()='  SRM Transaction']/ancestor::a/span");
	By directpo = By.xpath("//span[text()='5-    Direct PO']/ancestor::a");
	By supppliername = By.xpath("//input[@name='ddlBasicInformation_SupplierName']/../../td[2]");
	By supppliernametext = By.xpath("//li[text()='Aarunya Care Pvt Ltd']");
	By intedno = By.xpath("//input[@id='txtBasicInformation_IndentNo']");
	By dept1 = By.xpath("//input[@name='ddlBasicInformation_Department']/../../td[2]");
	By dept1value = By.xpath("//li[text()='Anaesthesiology']");
	By billingsite = By.xpath("//input[@id='ddlBasicInformation_BillingSite_Input']/../../td[2]");
	By billingsitetext = By.xpath("//li[text()='SRI DEVARAJ URS ACADEMY OF HIGHER EDUCATION & RESEARCH']");
	By itemtext = By.xpath("//body[@onload='getDivs()']//div[@class='rcbScroll rcbWidth']/ul/li[@class= 'rcbHovered']");

	By Delevryaddress = By.xpath("//textarea[@id='txtBasicInformation_DelAddress']");
	By totaopo = By.xpath("//input[@id='txtBasicInformation_POTotal']");
	By POcalButton = By.xpath("//input[@id='btnCalculate']");
	By item = By.xpath("//input[@id='dgItemDetails_ctl00_ctl04_rgEditItem_Input']/../../td[2]");
	By Qty = By.xpath("//input[@id='dgItemDetails_ctl00_ctl04_rgEditQty']");
	By Rate = By.xpath("//input[@id='dgItemDetails_ctl00_ctl04_rgEditRate']");
	By Savebuttun = By.xpath("//input[@id='ImageButton5']");

	
	By intentdate = By.xpath("//input[@id='rdpBasicInformation_IndentDate_dateInput']");
	By Deleverydate = By.xpath("//input[@id='rdpBasicInformation_CommonDeliveryDate_dateInput']");
	By framename =  By.xpath("//iframe[@name='PagePane']");
	By itemname = By.xpath("//input[@name='dgItemDetails$ctl00$ctl04$rgEditItem']");
	By warehoue = By.xpath("//input[@name='ddlBasicInformation_CommonDeliveryWarehouse']/../../td[2]");
	By warehouevalue = By.xpath("//li[text()='Engineering Store Inward']");
	By suppliersearchbtn = By.xpath("//input[@name='btnShowHide']");
	By suppliernamesrcarrow = By.xpath("//input[@name='ddlSearchFilter_Supplier']/../../td[2]");
	By suppliernamesrctext = By.xpath("//div[@id='ddlSearchFilter_Supplier_DropDown']//li[text()='Aarunya Care Pvt Ltd']");
	By searchbtn = By.xpath("//input[@name='btnSearch']");
	By okbtn = By.xpath("//span[text()='OK']/ancestor::a");
	
	public void iOpenLoginPage() throws Exception {
		
		CommonActions.igetElementandType(usernametxt,"c1439");
		CommonActions.igetElementandType(passwordtxt,"passwd@1");
		CommonActions.igetElement(button);
		CommonActions.igetElement(sdstrans);
		CommonActions.igetElement(directpo);
		
		driver.switchTo().frame(driver.findElement(framename));
		
		CommonActions.igetElementandType(intedno,"1233455");
		CommonActions.igetElement(warehoue);
		CommonActions.igetElement(warehouevalue);
		CommonActions.igetElement(dept1);
		
		CommonActions.igetElement(dept1value);
		CommonActions.igetElement(billingsite);
		CommonActions.igetElement(billingsitetext);
		
		CommonActions.igetElementandType(intentdate,"07/03/2024");
		CommonActions.igetElementandType(Deleverydate,"20/03/2024");
//		CommonActions.igetElementandType(Delevryaddress,"hjhfgdasfshrd");
		CommonActions.igetElementandType(itemname, " 35 SQMM COPPER LUGS");
		Thread.sleep(3000);
		CommonActions.igetElement(item);		
		Thread.sleep(3000);
		
		CommonActions.igetElement(Qty);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
//		CommonActions.igetElementandType(Qty,"10");
//		Thread.sleep(3000);
//		CommonActions.igetElementandType(Rate,"20");
		
//		
		try {
			System.out.println("Inside try block");
//			CommonActions.igetElementandType(Qty,"10");
		CommonActions.igetElement(Qty);
		Thread.sleep(10000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		CommonActions.igetElementandType(Qty,"10");
		CommonActions.igetElementandType(Rate,"20");
		
		}catch (Exception e) {
			System.out.println("Inside catch block");
			CommonActions.igetElementandType(Qty,"10");
			CommonActions.igetElementandType(Rate,"20");
		}
		
		
				
		CommonActions.igetElement(supppliername);
		CommonActions.igetElement(supppliernametext);
//		
		
//		CommonActions.igetElement(itemtext);	
//		CommonActions.igetElement(totaopo);
		Thread.sleep(10000);
		CommonActions.igetElement(POcalButton);
		Thread.sleep(2000);
		CommonActions.igetElement(Savebuttun);
		Thread.sleep(2000);
		CommonActions.igetElement(okbtn);
		Thread.sleep(8000);
		//driver.switchTo().alert().accept();
		CommonActions.igetElement(suppliersearchbtn);
		Thread.sleep(2000);
		CommonActions.igetElement(suppliernamesrcarrow);
		Thread.sleep(4000);
		
		String str = driver.findElement(suppliernamesrctext).getText();
		System.out.println("Supplier name Is   "+str);
		if(str.equals("Aarunya Care Pvt Ltd")) {
			CommonActions.igetElement(suppliernamesrctext);
			System.out.println("Supplier name is Matched...........");
		}
		else {
			System.out.println("Supplier name is notMatched...........");
		}
		
		
		CommonActions.igetElement(searchbtn);
		Thread.sleep(5000);
		
//		driver.findElement(usernametxt).sendKeys("c1439");
//		Thread.sleep(2000);
//		driver.findElement(passwordtxt).sendKeys("passwd@1");
//		Thread.sleep(2000);
//		driver.findElement(button).click();
//	}
//
//	public void sdsTransection() throws Exception {
//		Thread.sleep(2000);
//		driver.findElement(sdstrans).click();
//		Thread.sleep(2000);
//		driver.findElement(directpo).click();
//		Thread.sleep(5000);
//	}
//
//	public  void iFillDirectPo() throws InterruptedException {
//		System.out.println("fghjkdfghj");
//		driver.switchTo().frame(driver.findElement(framename));
//		driver.findElement(supppliername).click();
//		
//		Thread.sleep(2000);
//		System.out.println("fghjkdfghj");
//		driver.findElement(supppliernametext).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(intedno).sendKeys("1233455");
//		Thread.sleep(2000);
//		driver.findElement(dept1).click();
//		Thread.sleep(2000);
//		driver.findElement(dept1text).click();
//		Thread.sleep(2000);
//		driver.findElement(billingsite).click();
//		Thread.sleep(2000);
//		driver.findElement(billingsitetext).click();
//		Thread.sleep(2000);
//		driver.findElement(intentdate).sendKeys("07/03/2024");
//		Thread.sleep(2000);
//		driver.findElement(Deleverydate).sendKeys("20/03/2024");
//		Thread.sleep(2000);
//		driver.findElement(Delevryaddress).sendKeys("hjhfgdasfshrd");
//		Thread.sleep(2000);
//		
//		
//		driver.findElement(item).click();
//		Thread.sleep(4000);
//		driver.findElement(itemtext).click();
//		Thread.sleep(2000);
//		driver.findElement(Qty).sendKeys("10");
//		Thread.sleep(2000);
//		driver.findElement(Rate).sendKeys("20");
//		Thread.sleep(2000);
//		
//		//driver.findElement(totaopo).click();
//		
//		driver.findElement(POcalButton).click();
//		Thread.sleep(5000);
//		
//		driver.findElement(Savebuttun).click();
	}

}
