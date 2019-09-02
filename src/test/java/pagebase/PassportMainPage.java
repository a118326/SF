package pagebase;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class PassportMainPage extends PassportParentPage {

	//Page Factory
	
	@FindBy(id = "registerBtn")
	WebElement startBtn;

	@FindBy(id = "acceptTermsConditionsBtn")
	WebElement accpetBtn;

	@FindBy(id = "declineTermsConditionsBtn")
	WebElement declineBtn;

	@FindBy(id = "regPhoneNo")
	WebElement regPhoneNumIn;

	@FindBy(id = "verify_sms")
	WebElement textMeBtn;

	@FindBy(id = "verify_call")
	WebElement callMeBtn;

	@FindBy(xpath = "//*[@id=\"verify\"]/div[4]/div/div[2]/button[1]")
	WebElement yesBtn;

	@FindBy(xpath = "//*[@id=\"verify\"]/div[4]/div/div[2]/button[2]")
	WebElement noBtn;

	@FindBy(id = "verificationCode")
	WebElement verifyCodeIn;

	@FindBy(xpath = "//*[@id=\"verifyCode\"]")
	WebElement verifyBtn;

	@FindBy(xpath = "//*[@id=\"verifyAgain\"]")
	WebElement againBtn;

	@FindBy(xpath = "//*[@id=\"mobileVerification\"]/div[4]/div/div[2]/button")
	WebElement okBtn;

	@FindBy(xpath = "//*[@id=\"pin\"]")
	WebElement pinIn;

	@FindBy(xpath = "//*[@id=\"loginBtn\"]")
	WebElement loginBtn;

	@FindBy(xpath = "//*[@id=\"zoneNumber\"]")
	WebElement zoneNumberIn;

	@FindBy(xpath = "//*[@id=\"recentZonesList\"]/li/Btn")
	WebElement savedZoneNumberBtn;

	@FindBy(xpath = "//*[@id=\"zoneNext\"]")
	WebElement zoneNextBtn;

	@FindBy(xpath = "//*[@id=\"spaceNumber\"]")
	WebElement spaceNumberIn;

	@FindBy(xpath = "//*[@id=\"spaceNext\"]")
	WebElement spaceNextBtn;

	@FindBy(xpath = "//*[@id=\"lengthOfStayContent\"]/button[2]")
	WebElement lengthStayBtn;

	@FindBy(xpath = "//*[@id=\"lengthOfStayContent\"]/button[1]")
	WebElement maxStayBtn;

	@FindBy(xpath = "//*[@id=\"hourPlus\"]")
	WebElement hourPlusBtn;

	@FindBy(xpath = "//*[@id=\"hourMinus\"]")
	WebElement hourMinusBtn;

	@FindBy(xpath = "//*[@id=\"minPlus\"]")
	WebElement minPlusBtn;

	@FindBy(xpath = "//*[@id=\"minMinus\"]")
	WebElement minMinusBtn;

	@FindBy(xpath = "//*[@id=\"pickerNext\"]")
	WebElement pickerNextBtn;

	@FindBy(xpath = "//*[@id=\"creditCards\"]/div[4]/div/button")
	WebElement creditCardBtn;

	@FindBy(xpath = "//*[@id=\"creditCards\"]/div[6]/div/div[2]/button[1]")
	WebElement confirmPayBtn;

	@FindBy(xpath = "//*[@id=\"extendBtn\"]")
	WebElement extendBtn;

	@FindBy(xpath = "/html/body/div[82]/div/div[2]/button[1]")
	WebElement extendYesBtn;

	@FindBy(xpath = "//*[@id=\"closeSessionOverlay\"]")
	WebElement tapCloseScreen;

	@FindBy(xpath = "//*[@id=\"sessStopBtn\"]")
	WebElement sessionStopBtn;

	@FindBy(xpath = "//*[@id=\"session\"]/div[7]/div/div[2]/button[1]")
	WebElement sessionStopYesBtn;

	@FindBy(xpath = "//*[@id=\"session\"]/div[7]/div/div[2]/button")
	WebElement sessionCancelOkBtn;

	//Test Data
	String phoneValue = "5550000012";
	String pinValue = "6767";
	String verifyValue = "777";
	String zoneNumber = "6100";
	String parkSpaceNum = "6";

	//The constructor instantiate all elements and open app url
	public PassportMainPage() {
		PageFactory.initElements(getDriver(), this);
		driver.get(APP_URL);
		driver.manage().window().maximize();
	}

	public void startBtnClick() {
		elementWait(startBtn).click();
	}

	public void accpetBtnClick() {
		elementWait(accpetBtn).click();
	}

	public void regPhoneNumEnter() {
		elementWait(regPhoneNumIn).click();
		regPhoneNumIn.sendKeys(phoneValue);
	}

	public void declineBtnClick() {
		elementWait(declineBtn).click();
	}

	public void textMeBtnClick() {
		elementWait(textMeBtn).click();
	}

	public void callMeBtnClick() {
		elementWait(callMeBtn).click();
	}

	public void yesBtnClick() {
		elementWait(yesBtn).click();
	}

	public void noBtnClick() {
		elementWait(noBtn).click();
	}

	public void verifyCodeEnter() {
		elementWait(verifyCodeIn).click();
		verifyCodeIn.sendKeys(verifyValue);
	}

	public void verifyBtnClick() {
		elementWait(verifyBtn).click();
	}

	public void againBtnClick() {
		elementWait(againBtn).click();
	}

	public void okBtnClick() {
		elementWait(okBtn).click();
	}

	public void pinCodeEnter() {
		elementWait(pinIn).click();
		pinIn.sendKeys(pinValue);
	}

	public void loginBtnClick() {
		elementWait(loginBtn).click();
	}

	public void zoneNumberEnter() {
		elementWait(zoneNumberIn).click();
		zoneNumberIn.sendKeys(zoneNumber);
	}

	public void zoneNextClick() {
		elementWait(zoneNextBtn).click();
	}

	public void spaceNumberEnter() {
		elementWait(spaceNumberIn).click();
		spaceNumberIn.sendKeys(parkSpaceNum);
	}

	public void spaceNextBtnClick() {
		elementWait(spaceNextBtn).click();
	}

	public void lengthStayBtnClick() {
		elementWait(lengthStayBtn).click();
	}

	public void hourPlusBtnClick() {
		elementWait(hourPlusBtn).click();
	}

	public void hourMinusBtnClick() {
		elementWait(hourMinusBtn).click();
	}

	public void minPlusBtnClick() {
		elementWait(minPlusBtn).click();
	}

	public void minMinusBtnClick() {
		elementWait(minMinusBtn).click();
	}

	public void pickerNextBtnClick() {
		elementWait(pickerNextBtn).click();
	}

	public void creditCardBtnClick() {
		elementWait(creditCardBtn).click();
	}

	public void confirmPayBtnClick() {
		elementWait(confirmPayBtn).click();

	}

	public void tapCloseScreen() {
		elementWait(tapCloseScreen).click();
	}

	public void extendBtnClick() {
		elementWait(extendBtn).click();
	}

	public void extendYesBtnClick() {
		elementWait(extendYesBtn).click();
	}

	public void sessionStopBtnClick() {
		elementWait(sessionStopBtn).click();
	}

	public void sessionStopYesBtnClick() {
		elementWait(sessionStopYesBtn).click();
	}

	public void sessionCancelOkBtnClick() {
		elementWait(sessionCancelOkBtn).click();
	}

	public void closeDriver() {
		getDriver().close();
	}

	public void cleanup() {
		elementWait(sessionStopBtn).click();
		elementWait(sessionStopYesBtn).click();
		elementWait(sessionCancelOkBtn).click();
		getDriver().close();
	}
	
	//Combination method to create a new parking session
	public void createNewParking() {
				startBtnClick();
				accpetBtnClick();
				regPhoneNumEnter();
				callMeBtnClick();
				yesBtnClick();
				verifyCodeEnter();
				verifyBtnClick();
				okBtnClick();
				pinCodeEnter();
				loginBtnClick();
				zoneNumberEnter();
				zoneNextClick();
				spaceNumberEnter();
				spaceNextBtnClick();
				lengthStayBtnClick();
				minPlusBtnClick();
				pickerNextBtnClick();
				creditCardBtnClick();
				confirmPayBtnClick();
				tapCloseScreen();
	}

}
