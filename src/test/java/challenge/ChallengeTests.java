package challenge;

import org.testng.annotations.Test;
import pagebase.PassportMainPage;

public class ChallengeTests {
	
	// prerequisites: N/A
	// Expected Result: New parking session created 
	@Test
	public void NewParking_01() {
		PassportMainPage passportMainPage = new PassportMainPage();
		// 1. Start the app
		passportMainPage.startBtnClick();

		// 2. Accpet the term
		passportMainPage.accpetBtnClick();

		// 3. Enter Phone number
		passportMainPage.regPhoneNumEnter();

		// 4. Click Text me
		passportMainPage.callMeBtnClick();

		// 5. Click Yes
		passportMainPage.yesBtnClick();

		// 6. Enter Verify Code
		passportMainPage.verifyCodeEnter();

		// 7. Click Verify Btn
		passportMainPage.verifyBtnClick();

		// 8. Click OK Btn
		passportMainPage.okBtnClick();

		// 9. Enter Pin
		passportMainPage.pinCodeEnter();

		// 10. Click Pin OK
		passportMainPage.loginBtnClick();

		// 11. Enter Zone Number
		passportMainPage.zoneNumberEnter();

		// 12. Click Continue
		passportMainPage.zoneNextClick();

		// 13. Enter Space Number
		passportMainPage.spaceNumberEnter();

		// 14. Click Next
		passportMainPage.spaceNextBtnClick();

		// 15. Click Choose Stay
		passportMainPage.lengthStayBtnClick();

		// 16. Adding one hour 15 minutes
		passportMainPage.hourPlusBtnClick();
		passportMainPage.minPlusBtnClick();

		// 17. Select payment method
		passportMainPage.pickerNextBtnClick();

		// 18. Pick payment card
		passportMainPage.creditCardBtnClick();

		// 19. Confirm Payment
		passportMainPage.confirmPayBtnClick();

		// 20. Close confirmation
		passportMainPage.tapCloseScreen();

		// Close session for next test
		passportMainPage.cleanup();

	}

	// prerequisites: A parking Session
	// Expected Result: Session extended
	@Test
	public void ExtendParking_02() {

		PassportMainPage passportMainPage = new PassportMainPage();
		passportMainPage.createNewParking();
		// 1. Click extend parking
		passportMainPage.extendBtnClick();

		// 2. Go to length parking select
		passportMainPage.lengthStayBtnClick();

		// 3. Select Parking Time
		passportMainPage.minPlusBtnClick();
		passportMainPage.hourPlusBtnClick();

		// 4. Go to confirmation page
		passportMainPage.pickerNextBtnClick();

		// 5. Extend confirmation
		passportMainPage.extendYesBtnClick();

		// Close session for next test
		passportMainPage.cleanup();
	}
	
	// prerequisites: A parking Session
	// Expected Result: Session terminated
	@Test
	public void StopParking_03() {

		PassportMainPage passportMainPage = new PassportMainPage();
		passportMainPage.createNewParking();

		// 1. Click Stop Parking
		passportMainPage.sessionStopBtnClick();

		// 2. Click Yes to Stop Parking 
		passportMainPage.sessionStopYesBtnClick();

		// 3. Click Session Cancel
		passportMainPage.sessionCancelOkBtnClick();
		
		// Close session for next test
		passportMainPage.closeDriver();
	}

}
