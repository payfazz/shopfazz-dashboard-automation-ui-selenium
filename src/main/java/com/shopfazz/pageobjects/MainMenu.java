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
	
	private String togglebutton ="#root > div > div.ant-layout-header > div > div.header-brand > i > svg";
	
	private String titleMainMenu = "/html/body/div[2]/div/div[2]/div/div/div[1]/div";
	
	private String menuDashboard = "/html/body/div[3]/div/div[2]/div/div/div[2]/ul/li[1]/a";
	
	private String menuPemesanan = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[2]/a";
	
	private String menuPembelian = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[3]/a";
	
	private String menuInventarisGudang = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[4]/a";
	
	private String menuProduk = "body > div:nth-child(7) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > ul > li.ant-menu-item.ant-menu-item-active.ant-menu-item-selected > a";
	
//	private String menuProduk = "/html/body/div[3]/div/div[2]/div/div/div[2]/ul/li[5]/a";

	private String menuPayment = "/html/body/div[3]/div/div[2]/div/div/div[2]/ul/li[6]/a";

	private String menuPelanggan = "/html/body/div[3]/div/div[2]/div/div/div[2]/ul/li[7]/a";

	private String menuSupplier = "/html/body/div[3]/div/div[2]/div/div/div[2]/ul/li[8]/a";

	private String menuManajemenPengguna = "/html/body/div[2]/div/div[2]/div/div/div[2]/ul/li[9]/a";

	private String lblDashboard ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	
	private String lblPemesanan ="#root > div > div.ant-layout-header > div > div.header-title > span";
	
	private String lblPembelian ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	
	private String lblInventarisGudang ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	
	private String lblProduk ="#root > div > div.ant-layout-header > div > div.header-title > span";
	
	private String lblPayment ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";

	private String lblPelanggan ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	
	private String lblSupplier ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	
	private String lblManajemenPengguna ="//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	
	public void clickToggleButton() throws TestCaseFailed {
		Log.INFO("Click Toogle Button");
		browser.click(CSS, togglebutton);
	}
	
	public void assertMainMenuTitle() throws TestCaseFailed {
		Log.INFO("Verify Main Menu Title");
		browser.checkElementPresence(XPATH, titleMainMenu);
	}
	
	public void clickMenuDashboard() throws TestCaseFailed {
		Log.INFO("Click Menu Dashboard");
		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/dashboard");
	}
	
	public void clickMenuPemesanan() throws TestCaseFailed{
		Log.INFO("Click Menu Pemesanan");
		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/order");
	}
	
	public void clickMenuPembelian() throws TestCaseFailed {
		Log.INFO("Click Menu Pembelian");
		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/purchase");
	}

	public void clickMenuInventarisGudang() throws TestCaseFailed {
		Log.INFO("Click Menu Inventaris Gudang");
		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/warehouse-invetory");
	}
	
	public void clickMenuProduk() throws TestCaseFailed {
		Log.INFO("Click Menu Produk");
//		browser.hoverOverElement(CSS, menuProduk);
//		WebElement element = browser.getWebElement(CSS, "body > div:nth-child(7) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > ul > li.ant-menu-item.ant-menu-item-active.ant-menu-item-selected > a");
//		List<WebElement> menuProd =element.findElements(By.tagName("a"));
//		
//		Actions actions = new Actions(menuProd);
//		actions.moveToElement(element).click().build().perform();
		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/product");
	}
	
	public void clickMenuPayment() throws TestCaseFailed {
		Log.INFO("Click Menu Payment");
		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/payment");
	}
	
	public void clickMenuPelanggan() throws TestCaseFailed {
		Log.INFO("Click Menu Pelanggan");
		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/customer");
	}
	
	public void clickMenuSupplier() throws TestCaseFailed {
		Log.INFO("Click Menu Supplier");
		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/supplier");
	}
	
	public void clickMenuManajemenPengguna() throws TestCaseFailed {
		Log.INFO("Click Menu User Management");
		browser.clickLinkByHref("https://secure.shopfazz.com/dashboard-dev/user-management");
	}
	
	public void verifyUserOnDashboardPage() {
		assertTrue(browser.isElementDisplayed(XPATH, lblDashboard));
	}
	
	public void verifyUserOnPemesananPage() {
		assertTrue(browser.isElementDisplayed(CSS, lblPemesanan));
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
}

