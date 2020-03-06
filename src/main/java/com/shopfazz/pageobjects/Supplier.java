package com.shopfazz.pageobjects;

import static com.shopfazz.methods.SelectorType.CSS;
import static com.shopfazz.methods.SelectorType.NAME;
import static com.shopfazz.methods.SelectorType.XPATH;
import static org.junit.Assert.assertTrue;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.shopfazz.environment.BaseTest;
import com.shopfazz.logger.Log;
import com.shopfazz.methods.TestCaseFailed;


public class Supplier implements BaseTest {
	
	private String name = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[1]/div/span/input";
	private String Btn_search = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[1]/div/span/span";
	private String listName ="//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div/div/div/table/tbody/tr/td[1]";
	
	public void enterTextName(String searchText) throws TestCaseFailed {
		Log.INFO("Enter name: " + searchText);
		browser.click(XPATH, name);
		browser.enterTextByActions(XPATH, searchText, name);
	}
	
	public void clickSearchButton() throws TestCaseFailed{
		Log.INFO("Click Search Button");
		browser.click(XPATH, Btn_search);
	}
	
	public void verifySupplierName() {
		assertTrue(browser.isElementDisplayed(XPATH, listName));
	}
	
}
