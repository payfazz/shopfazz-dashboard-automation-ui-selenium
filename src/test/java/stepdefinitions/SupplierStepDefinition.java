package stepdefinitions;

import com.shopfazz.environment.BaseTest;
import com.shopfazz.methods.TestCaseFailed;

import com.shopfazz.pageobjects.LoginDashboard;
import com.shopfazz.pageobjects.MainMenu;
import com.shopfazz.pageobjects.Supplier;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.After;

public class SupplierStepDefinition implements BaseTest {

	LoginDashboard loginObject = new LoginDashboard();
	MainMenu mainMenu= new MainMenu();
	Supplier supplierMenu= new Supplier();
	
	@When("^user input with \"([^\"]*)\"$")
	public void user_input_with(String uname) throws TestCaseFailed {
		supplierMenu.enterTextName(uname);
	}
	
    @And("^user click search button$")
    public void user_click_search_button() throws Throwable {
    	supplierMenu.clickSearchButton();
    }
    
    @Then("^user will see data not found$")
    public void user_will_see_data_not_found() throws Throwable {
       supplierMenu.verifyDataNotFound();
    }
    
    @Then("^user will see supplier name$")
    public void user_will_see_supplier_name() throws Throwable {
       Thread.sleep(3000);
       supplierMenu.verifySupplierName();
    }
    
	@After
	public void tearDown() {
		browser.closeDriver();
	}
	
}
