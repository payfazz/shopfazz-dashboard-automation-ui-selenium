package stepdefinitions;

import com.shopfazz.environment.BaseTest;
import com.shopfazz.methods.TestCaseFailed;
import com.shopfazz.pageobjects.LoginDashboard;
import com.shopfazz.pageobjects.MainMenu;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class LoginDashboardStepDefinition implements BaseTest{

	LoginDashboard loginObject = new LoginDashboard();
	MainMenu mainMenu= new MainMenu();


	@When("^user set username with \"([^\"]*)\"$")
	public void user_set_username_with(String uname) throws TestCaseFailed {
//		loginObject.verifyUsernameElementPresent();
		loginObject.enterTextEmail(uname);
	}
	
	@When("^user set password with \"([^\"]*)\"$")
	public void user_set_password_with(String pwd) throws TestCaseFailed {
//		loginObject.verifyPwdElementPresent();
		loginObject.enterPwd(pwd);
	}
	
	@When("^click login button$")
	public void click_login_button() throws TestCaseFailed, InterruptedException {
		loginObject.clickLoginBtn();
		Thread.sleep(2000);
	}
	
	@Then("^user could see dashboard title$")
	public void user_could_see_dashboard_title() throws TestCaseFailed {
	    loginObject.assertDashboardTitle();
	}
	
	@When("^user click toggle password button$")
	public void user_click_toggle_password_button() {
	    loginObject.clickBtnTogglePassword();
	}
	
	@Then("^user will get error message invalid credential$")
	public void user_get_error_message_credential() {
		loginObject.assertInvalidCredential();
	}
	
	@Then("^user will see password as \"([^\"]*)\"$")
	public void user_will_see_password(String pwd) {
		loginObject.assertPassword(pwd);
	}
	
	@Then("^login button disable$")
	public void login_button_disable() throws Throwable {
		loginObject.LoginBtnDisable();
	}

	@After
	public void tearDown() {
		browser.closeDriver();
	}
	
}
