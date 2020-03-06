package com.shopfazz.pageobjects;

import static com.shopfazz.methods.SelectorType.CSS;
import static com.shopfazz.methods.SelectorType.XPATH;
import static org.junit.Assert.assertTrue;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.shopfazz.environment.BaseTest;
import com.shopfazz.logger.Log;
import com.shopfazz.methods.TestCaseFailed;


public class MainMenu implements BaseTest {

	private static String env = System.getProperty("environment");
	
	private String Btn_SideBarMenu ="#root > div > div.ant-layout-header > div > div.header-brand > i > svg";
//	private String Btn_SideBarMenu = "//*[@id=\"root\"]/div/div[1]/div/div[1]/i";
	private String Btn_close = "/html/body/div[2]/div/div[2]/div/div/div[1]/button/i";
	private String Btn_menuPemesanan = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[2]";
	private String Btn_menuBAST = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[3]";	
	private String Btn_menuPembelian = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[4]";
	private String Btn_menuInventarisGudang = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[5]";
	private String Btn_menuProduk = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[6]";
//	private String Btn_menuProduk = "body > div:nth-child(7) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > ul > li.ant-menu-item.ant-menu-item-active.ant-menu-item-selected > a";
	private String Btn_menuPayment = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[7]";
	private String Btn_menuPelanggan = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[8]";
	private String Btn_menuSupplier = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[9]";
	private String Btn_menuManajemenPengguna = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[10]";
	private String Btn_menuDashboard = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[1]";
	private String Btn_profileMenu = "//*[@id=\"root\"]/div/div[1]/div/div[3]/a";
//	private String Btn_Logout = "/html/body/div[3]/div/div/ul/li[3]";
	
	private String titleMainMenu = "/html/body/div[2]/div/div[2]/div/div/div[1]/div";
	private String logoShopfazz = "//*[@id=\"root\"]/div/div[1]/div/div[1]/span/img";
//	private String lblPemesanan ="#root > div > div.ant-layout-header > div > div.header-title > span";
	private String lblPemesanan = "//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	private String lblBAST = "//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	private String lblPembelian ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	private String lblInventarisGudang ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	private String lblProduk ="#root > div > div.ant-layout-header > div > div.header-title > span";
	private String lblPayment ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	private String lblPelanggan ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	private String lblSupplier ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	private String lblManajemenPengguna ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	private String lblDashboard ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	private String lblLogin = "#root > div > div > h1";
	
	public void clickSideBarMenuButton() throws TestCaseFailed {
		Log.INFO("Click Side Bar Menu Button");
		browser.click(CSS, Btn_SideBarMenu);
//		browser.click(XPATH, Btn_SideBarMenu);
	}
	
	public void clickCloseButton() throws TestCaseFailed{
		Log.INFO("Click Close Button");
		browser.click(XPATH, Btn_close);
	}
	
	public void clickMenuPemesanan() throws TestCaseFailed{
		Log.INFO("Click Menu Pemesanan");
		browser.click(XPATH, Btn_menuPemesanan);
//		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/order");
	}
	
	public void clickMenuBAST() throws TestCaseFailed{
		Log.INFO("Click Menu BAST");
		browser.click(XPATH, Btn_menuBAST);
//		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/bast");
	}
	
	public void clickMenuPembelian() throws TestCaseFailed {
		Log.INFO("Click Menu Pembelian");
		browser.click(XPATH, Btn_menuPembelian);
//		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/purchase");
	}
	
	public void clickMenuInventarisGudang() throws TestCaseFailed {
		Log.INFO("Click Menu Inventaris Gudang");
		browser.click(XPATH, Btn_menuInventarisGudang);
//		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/warehouse-invetory");
	}
	
	public void clickMenuProduk() throws TestCaseFailed {
		Log.INFO("Click Menu Produk");
		browser.click(XPATH, Btn_menuProduk);
//		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/product");
		
//		browser.hoverOverElement(CSS, menuProduk);
//		WebElement element = browser.getWebElement(CSS, "body > div:nth-child(7) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > ul > li.ant-menu-item.ant-menu-item-active.ant-menu-item-selected > a");
//		List<WebElement> menuProd =element.findElements(By.tagName("a"));
//		Actions actions = new Actions(menuProd);
//		actions.moveToElement(element).click().build().perform();
	}
	
	public void clickMenuPayment() throws TestCaseFailed {
		Log.INFO("Click Menu Payment");
		browser.click(XPATH, Btn_menuPayment);
//		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/payment");
	}
	
	public void clickMenuPelanggan() throws TestCaseFailed {
		Log.INFO("Click Menu Pelanggan");
		browser.click(XPATH, Btn_menuPelanggan);
//		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/customer");
	}
	
	public void clickMenuSupplier() throws TestCaseFailed {
		Log.INFO("Click Menu Supplier");
		browser.click(XPATH, Btn_menuSupplier);
//		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/supplier");
	}
	
	public void clickMenuManajemenPengguna() throws TestCaseFailed {
		Log.INFO("Click Menu User Management");
		browser.click(XPATH, Btn_menuManajemenPengguna);
//		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/user-management");
	}
	
	public void clickMenuDashboard() throws TestCaseFailed {
		Log.INFO("Click Menu Dashboard");
		browser.click(XPATH, Btn_menuDashboard);
//		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/dashboard");
	}
	
	public void ClickProfileButton() {
		Log.INFO("Click Profile Menu Button");
		browser.click(XPATH, Btn_profileMenu);
//		browser.click(XPATH, "//*[@id=\"root\"]/div/div[1]/div/div[3]/a");
	}
	
	public void clickLogoutBtn() {
		Log.INFO("Click Logout Button");
		WebElement dropDownProfile = browser.getWebElement(XPATH, "/html/body/div[2]/div/div/ul");
		List<WebElement> btnLogout =dropDownProfile.findElements(By.tagName("li"));
		//WebElement elm = browser.getWebElement(XPATH, "/html/body/div[2]/div/div/ul/li[3]");
		WebElement elm = btnLogout.get(2);
		elm.click();
	}
	
	public void assertMainMenuTitle() throws TestCaseFailed {
		Log.INFO("Verify Main Menu Title");
		browser.checkElementPresence(XPATH, titleMainMenu);
	}
	
	public void verifyUserSeeShopfazzLogo() {
		assertTrue(browser.isElementDisplayed(XPATH, logoShopfazz));
	}
	
	public void verifyUserOnPemesananPage() {
//		assertTrue(browser.isElementDisplayed(CSS, lblPemesanan));
		assertTrue(browser.isElementDisplayed(XPATH, lblPemesanan));
//		browser.maximizeBrowser();
	}
	
	public void verifyUserOnBASTPage() {
		assertTrue(browser.isElementDisplayed(XPATH, lblBAST));
	}
	
	public void verifyUserOnPembelianPage() {
		assertTrue(browser.isElementDisplayed(XPATH, lblPembelian));
	}
	
	public void verifyUserOnInventarisGudangPage() {
		assertTrue(browser.isElementDisplayed(XPATH, lblInventarisGudang));
	}
	
	public void verifyUserOnProductPage() {
		assertTrue(browser.isElementDisplayed(CSS, lblProduk));
	}
	
	public void verifyUserOnPaymentPage() {
		assertTrue(browser.isElementDisplayed(XPATH, lblPayment));
	}
	
	public void verifyUserOnPelangganPage() {
		assertTrue(browser.isElementDisplayed(XPATH, lblPelanggan));
	}

	public void verifyUserOnSupplierPage() {
		assertTrue(browser.isElementDisplayed(XPATH, lblSupplier));
	}
	
	public void verifyUserOnManajemenPenggunaPage() {
		assertTrue(browser.isElementDisplayed(XPATH, lblManajemenPengguna));
	}
	
	public void verifyUserOnDashboardPage() {
		assertTrue(browser.isElementDisplayed(XPATH, lblDashboard));
	}
	
	public void assertLoginPageTitle() throws TestCaseFailed {
		Log.INFO("Verify Login Page Title");
		browser.checkElementPresence(CSS, lblLogin);
	}

}

