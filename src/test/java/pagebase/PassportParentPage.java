package pagebase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PassportParentPage {
	public WebDriver driver;
	public PassportParentPage passportParentPage;
	public String APP_URL = "https://ppprk.com/park/#login";

	//instantiate necessary driver properties
	PassportParentPage() {
		setChromeDriverProperty();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	//return driver
	public WebDriver getDriver() {
		return this.driver;
	}

	//wait for elements to be clickable
	public WebElement elementWait(WebElement element) {
		return (new WebDriverWait(getDriver(), 20)).until(ExpectedConditions.elementToBeClickable(element));
	}

	//set chrome driver to WebDriver(Currently location is the project directory)
	public void setChromeDriverProperty() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	}

}
