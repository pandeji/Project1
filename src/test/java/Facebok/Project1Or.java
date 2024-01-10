package Facebok;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Project1Or {
 
	@FindBy(xpath="//input[@id='email']")
	WebElement loginUname;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement loginPWD;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement loginBttn;
	
	@FindBy(xpath="//a[text()='Create new account']")
	 WebElement CreateNewAccountBttn;
	 
	 @FindBy(xpath="//input[@name='firstname']")
	 WebElement EnterFName;
	 
	 @FindBy(xpath="//input[@name='lastname']")
	 WebElement EnterLName;
	 
	 @FindBy(xpath="//input[@name='reg_email__']")
	 WebElement EnterMobNumborEmail;
	 
	 @FindBy(xpath="//input[@id='password_step_input']")
	 WebElement EnterPWD;
	 
	 @FindBy(xpath="//select[@id='day']")
	 WebElement SelDay;
	 
	 @FindBy(xpath="//select[@id='month']")
	 WebElement SelMonth;
	 
	 @FindBy(xpath="//select[@id='year']")
	 WebElement SelYear;
	 
	 @FindBy(xpath="(//input[@name='sex'])[2]")
	 WebElement SelGenderMale;
	 
	 @FindBy(xpath="//button[@name='websubmit']")
	 WebElement SignUpBttn;
	 
	 @FindBy(xpath="//button[text()='Try it']")
	 WebElement clickFrame;
	 
	 @FindBy(xpath="//p[@id='demo']")
	 WebElement outTextFrame;
	 
	 
	 
}
