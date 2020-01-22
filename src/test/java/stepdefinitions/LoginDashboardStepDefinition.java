package stepdefinitions;



import com.shopfazz.environment.BaseTest;
import com.shopfazz.methods.TestCaseFailed;
import com.shopfazz.pageobjects.LoginDashboard;
import com.shopfazz.pageobjects.ProfileDashboard;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginDashboardStepDefinition implements BaseTest{

	LoginDashboard loginObject = new LoginDashboard();
	ProfileDashboard profilDashboard= new ProfileDashboard();


@When("^user set username with \"([^\"]*)\"$")
public void user_set_username_with(String uname) throws TestCaseFailed {
	loginObject.enterTextEmail(uname);
    // Express the Regexp above with the code you wish you had
    
}

@When("^user set password with \"([^\"]*)\"$")
public void user_set_password_with(String pwd) throws TestCaseFailed {
    // Express the Regexp above with the code you wish you had
   loginObject.enterPwd(pwd);
}

@When("^click login button$")
public void click_login_button() throws TestCaseFailed {
    // Express the Regexp above with the code you wish you had
  loginObject.clickLoginBtn();
}

@Then("^user could see dashboard title$")
public void user_could_see_dashboard_title() throws TestCaseFailed {
    // Express the Regexp above with the code you wish you had
    loginObject.assertDashboardTitle();
}

@When("^user click profile button$")
public void user_click_profile_button() throws InterruptedException {
	Thread.sleep(5000);
	profilDashboard.userClickProfileButton();
}

@When("^user click logout$")
public void user_click_logout() throws InterruptedException {
	
	loginObject.clickLogoutBtn();
}

@Then("^user logged out from system$")
public void user_logged_out() throws TestCaseFailed {
	loginObject.assertLoginPageTitle();
}


	
}
