package Facebok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Project1_WebUtility.WebUtility;

public class Project1 extends Project1Or {
 
	WebUtility util;
	
	@BeforeClass
	public void setup() {
		WebDriver driver = new ChromeDriver();
        util = new WebUtility(driver);
        util.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();		
	}
	
	@Test(priority = 0)
	public void TC_01_Verify_if_User_can_Login_With_only_Correct_URL() throws InterruptedException {
		util.openURL("https://www.facebook.com");
		Thread.sleep(3000);
		util.sendKeys(loginUname, "UserName");
		util.sendKeys(loginPWD, "Password");
		Thread.sleep(2000);
		util.clickBy(loginBttn);
		Thread.sleep(5000);

	}
	
	@Test(priority=1)
	public void TC_01_Verify_if_user_can_create_new_account() throws InterruptedException {
		util.openURL("https://www.facebook.com");
		Thread.sleep(3000);
		util.clickBy(CreateNewAccountBttn);
		Thread.sleep(3000);
		util.sendKeys(EnterFName, "Utkarsh");
		Thread.sleep(1000);
		util.sendKeys(EnterLName, "Pandey");
		Thread.sleep(2000);
		util.sendKeys(EnterMobNumborEmail, "1231231230");
		Thread.sleep(1000);
		util.sendKeys(EnterPWD, "Password@123");
		Thread.sleep(1000);
		util.sendKeys(SelDay, "9");
		Thread.sleep(1000);
		util.sendKeys(SelMonth, "November");
		Thread.sleep(1000);
		util.sendKeys(SelYear, "1997");
		Thread.sleep(1000);
		util.clickBy(SelGenderMale);
		Thread.sleep(1000);
		util.clickBy(SignUpBttn);
		Thread.sleep(50000);
	}
	
	@Test(priority = 2)
	public void TC_03_Frame_Handle() throws InterruptedException {
		util.openURL("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(3000);
		util.switchFrame("iframeResult");
		util.clickBy(clickFrame);
		Thread.sleep(1000);
		util.acceptFrame();
		Thread.sleep(2000);
		util.getFrameText(outTextFrame);
		Thread.sleep(3000);
	}
	
	@Test(priority =3)
	public void TC_04_() {
		
	}
	
	@AfterClass
	public void tearDown() {
		util.closeBrowser();
	}


}
