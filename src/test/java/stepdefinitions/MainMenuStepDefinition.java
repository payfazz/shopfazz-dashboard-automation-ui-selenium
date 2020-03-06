package stepdefinitions;

import com.shopfazz.environment.BaseTest;
import com.shopfazz.methods.TestCaseFailed;

import com.shopfazz.pageobjects.LoginDashboard;
import com.shopfazz.pageobjects.MainMenu;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.After;


public class MainMenuStepDefinition implements BaseTest {
	
	LoginDashboard loginObject = new LoginDashboard();
	MainMenu mainMenu= new MainMenu();
	
	@When("^user click side bar menu$")
	public void user_click_side_bar_menu() throws Throwable {
	    mainMenu.clickSideBarMenuButton();
	}
	
	@Then("^user will see main menu title$")
    public void user_will_see_main_menu_title() throws Throwable {
		Thread.sleep(3000);
        mainMenu.assertMainMenuTitle();
    }
	
    @When("^user click close menu$")
    public void user_click_close_menu() throws Throwable {
        mainMenu.clickCloseButton();
    }

    @Then("^user will see shopfazz logo$")
    public void user_will_see_shopfazz_logo() throws Throwable {
       Thread.sleep(3000);
       mainMenu.verifyUserSeeShopfazzLogo();
    }
    
    @When("^user click menu pemesanan$")
    public void user_click_menu_pemesanan() throws Throwable {
        mainMenu.clickMenuPemesanan();
    }

    @Then("^user will see pemesanan page$")
    public void user_will_see_pemesanan_page() throws Throwable {
       Thread.sleep(3000);
       mainMenu.verifyUserOnPemesananPage();
    }
    
    @When("^user click menu BAST$")
    public void user_click_menu_BAST() throws Throwable {
        mainMenu.clickMenuBAST();
    }

    @Then("^user will see BAST page$")
    public void user_will_see_BAST_page() throws Throwable {
       Thread.sleep(3000);
       mainMenu.verifyUserOnBASTPage();
    }
    
    @When("^user click menu pembelian$")
    public void user_click_menu_pembelian() throws Throwable {
        mainMenu.clickMenuPembelian();
    }

    @Then("^user will see pembelian page$")
    public void user_will_see_pembelian_page() throws Throwable {
    	 Thread.sleep(3000);
    	 mainMenu.verifyUserOnPembelianPage();
    }
    
    @When("^user click menu inventaris gudang$")
    public void user_click_menu_inventaris_gudang() throws Throwable {
    	mainMenu.clickMenuInventarisGudang();
    }

    @Then("^user will see inventaris gudang page$")
    public void user_will_see_inventaris_gudang_page() throws Throwable {
    	Thread.sleep(3000);
    	mainMenu.verifyUserOnInventarisGudangPage();
    }
    
    @When("^user click menu product$")
    public void user_click_menu_product() throws Throwable {
    	mainMenu.clickMenuProduk();
    }

    @Then("^user will see product page$")
    public void user_will_see_product_page() throws Throwable {
        Thread.sleep(3000);
        mainMenu.verifyUserOnProductPage();
    }
    
    @When("^user click menu payment$")
    public void user_click_menu_payment() throws Throwable {
    	mainMenu.clickMenuPayment();
    }

    @Then("^user will see payment page$")
    public void user_will_see_payment_page() throws Throwable {
        Thread.sleep(3000);
        mainMenu.verifyUserOnPaymentPage();
    }
    
    @When("^user click menu customer$")
    public void user_click_menu_customer() throws Throwable {
        mainMenu.clickMenuPelanggan();
    }

    @Then("^user will see customer page$")
    public void user_will_see_customer_page() throws Throwable {
        Thread.sleep(3000);
        mainMenu.verifyUserOnPelangganPage();
    }
    
    @When("^user click menu supplier$")
    public void user_click_menu_supplier() throws Throwable {
        mainMenu.clickMenuSupplier();
    }

    @Then("^user will see supplier page$")
    public void user_will_see_supplier_page() throws Throwable {
        Thread.sleep(3000);
        mainMenu.verifyUserOnSupplierPage();
    }
    
    @When("^user click menu user management$")
    public void user_click_menu_user_management() throws Throwable {
        mainMenu.clickMenuManajemenPengguna();
    }

    @Then("^user will see user management page$")
    public void user_will_see_user_management_page() throws Throwable {
        Thread.sleep(3000);
        mainMenu.verifyUserOnManajemenPenggunaPage();
    }
    
	@When("^user click menu dashboard$")
    public void user_click_menu_dashboard() throws Throwable {
        mainMenu.clickMenuDashboard();
    }

    @Then("^user will see dashboard page$")
    public void user_will_see_dashboard_page() throws Throwable {
        mainMenu.verifyUserOnDashboardPage();
    }
    
	@When("^user click profile button$")
	public void user_click_profile_button() throws Throwable {
        mainMenu.ClickProfileButton();
	}
	
	@And("^user click logout$")
	public void user_click_logout() throws InterruptedException {
		mainMenu.clickLogoutBtn();
	}
	
	@Then("^user logged out from system$")
	public void user_logged_out() throws TestCaseFailed {
		mainMenu.assertLoginPageTitle();
	}
	
	@After
	public void tearDown() {
		browser.closeDriver();
	}
	
}
