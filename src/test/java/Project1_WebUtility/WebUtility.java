package Project1_WebUtility;
Test 


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtility {
//	protected static ThreadLocal<WebDriver> thDriver = new ThreadLocal<WebDriver>();
	WebDriver driver;
	public WebUtility(WebDriver driver) {
        this.driver = driver;
    }
	
	public WebDriver getDriver() {
		return driver;
	}
	public void openURL(String URL) {
		driver.get(URL);
	}
	
	public WebElement findElement(By locator) {
        try {
            return driver.findElement(locator);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
	public void clickBy(WebElement locator) {
		if(locator!=null){
			locator.click();
		}
	}
	
	public void sendKeys(WebElement locator, String text) {
        if (locator != null) {
        	locator.sendKeys(text);
        }
        else {
        	System.out.println("Done");
        }
    }
	
	public void closeBrowser() {
		driver.close();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void ScrollToTop() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}
	
	public void clearText(WebElement locator) {
		locator.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	}
	
	public void loopClickElement(WebElement locator) throws InterruptedException {
//		int a=0;
		while(locator.equals(new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(locator)))){
//			System.out.println(a++);
			Thread.sleep(3000);
			locator.click();
		}
	}
	public void switchFrame(String frame) {
		driver.switchTo().frame(frame);
	}
	public void acceptFrame() {
		driver.switchTo().alert().accept();
	}
	public void getFrameText(WebElement locator) throws InterruptedException {
		String ptext2= locator.getText();
//        Thread.sleep(3000);
        System.out.println(ptext2);
	}
}






