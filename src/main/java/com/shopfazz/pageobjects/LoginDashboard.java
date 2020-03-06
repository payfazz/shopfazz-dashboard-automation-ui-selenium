package com.shopfazz.pageobjects;

import static com.shopfazz.methods.SelectorType.CSS;
import static com.shopfazz.methods.SelectorType.ID;
import static com.shopfazz.methods.SelectorType.NAME;
import static com.shopfazz.methods.SelectorType.XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shopfazz.environment.BaseTest;
import com.shopfazz.logger.Log;
//import com.shopfazz.methods.DataBaseConnector;
import com.shopfazz.methods.SelectorType;
import com.shopfazz.methods.TestCaseFailed;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;

import java.util.List;
import org.junit.*;

public class LoginDashboard implements BaseTest {
	
	private static String env = System.getProperty("environment");
	private String email = "email";
	private String pwd = "password";
	private String btnLogin = "//*[@id=\"root\"]/div/div/form/div[3]/div/div/span/button";
	private String titleDashboard = "//*[@id=\"root\"]/div/div[1]/div/div[2]/span";
	private String btn_toggle_password = "//*[@id=\"root\"]/div/div/form/div[2]/div/div/span/span/span/span/i";
	private String alertInvalidCredential = "/html/body/div[2]/div/span/div/div/div/span";
	private static String userLogin = "";
//	private static String accCode = "";
	
	
	/*SETTER GETTER*/
	public String getEmail() {
		return email;
	}

	public String getPwd() {
		return pwd;
	}
	
	public static String getUserLogin() {
		return userLogin;
	}

	public static void setUserLogin(String userLogin) {
		LoginDashboard.userLogin = userLogin;
	}
	
//	public static String getAccCode() {
//		return accCode;
//	}

//	public static void setAccCode(String accCode) {
//		LoginDashboard.accCode = accCode;
//	}
//	
	/*SETTER GETTER*/
//	
//	public void assertInvalidCredential() {
//		Log.INFO("Verify alert invalid credential is displayed");
//		browser.waitForElementToDisplay(XPATH, alertInvalidCredential, "5");
//	}
//
	
	public void clickBtnTogglePassword() {
		browser.click(XPATH, btn_toggle_password);
	}

	public void assertPassword(String pwdParam) {
		// String txtPwd = this.txtPassword.getAttribute("value");
		// Assert.assertEquals(pwd, txtPwd);

		Log.INFO("Verify password user as " + pwd);
		String txtPwd = browser.getElementByValue(NAME, pwd);
		Assert.assertEquals(pwdParam, txtPwd);
	}

	public void verifyUsernameElementPresent() throws TestCaseFailed {
		Log.INFO("Verify text username is displayed");
		browser.checkElementPresence(NAME, email);
	}

	public void verifyPwdElementPresent() throws TestCaseFailed {
		Log.INFO("Verify text password is displayed");
		browser.checkElementPresence(NAME, pwd);
	}

	public void enterTextEmail(String searchText) throws TestCaseFailed {
		Log.INFO("Enter email: " + searchText);
		browser.click(NAME, email);
		browser.enterTextByActions(NAME, searchText, email);
	}

	public void enterPwd(String searchText) throws TestCaseFailed {
		Log.INFO("Enter password: " + searchText);
		browser.click(NAME, pwd);
		browser.enterTextByActions(NAME, searchText, pwd);
	}

	public void clickLoginBtn() throws TestCaseFailed {
		Log.INFO("Click Login Button");
		browser.click(XPATH, btnLogin);
	}
	
	public void LoginBtnDisable() throws TestCaseFailed {
		Log.INFO("Click Login Button");
		browser.isElementEnabled(XPATH, btnLogin);
		Assert.assertEquals(false, browser.isElementEnabled(XPATH, btnLogin));
	}

	public void assertDashboardTitle() throws TestCaseFailed {
		Log.INFO("Verify Dashboard Title");
		browser.checkElementPresence(XPATH, titleDashboard);
		browser.maximizeBrowser();
	}
	
//	public void verifyAlertTextfieldUsername() {
//		Log.INFO("verify alert on username text field");
//		Assert.assertEquals("Please fill out this field.", browser.checkAlertOnTextfield(ID,username));
//	}
//	
//	public void verifyAlertTextfieldPassword() {
//		Log.INFO("verify alert on password text field");
//		Assert.assertEquals("Please fill out this field.", browser.checkAlertOnTextfield(ID,pwd));
//	}
	
	public void setUsernamePassword(String uname, String pass) {
		Log.INFO("Enter email: " + uname);
		browser.click(NAME, email);
		browser.enterTextByActions(NAME, uname, email);
		
		Log.INFO("Enter password: " + pass);
		browser.click(NAME, pwd);
		browser.enterTextByActions(NAME, pass, pwd);
		
	}

	public void assertInvalidCredential() {
		// TODO Auto-generated method stub
		Log.INFO("Verify alert invalid credential is displayed");
		browser.waitForElementToDisplay(XPATH, alertInvalidCredential, "5");	
	}
	
	
//	public String getAccountCode(String fullname) throws SQLException {
//		
//		String accCode = "";
//		String resultValue = "";
//		String sqlQuery = "select acc.\"Code\" from \"Account\" acc where lower(\"Fullname\")=lower('"+fullname+"')";
//
//		Connection connection = DataBaseConnector.createConnectionDB(env);
//		PreparedStatement stmt = connection.prepareStatement(sqlQuery);
//		ResultSet rs = stmt.executeQuery();
//
//		try {
//			while (rs.next()) {
//				resultValue = rs.getString(1).toString();
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (NullPointerException err) {
//			System.out.println("No Records obtained for this specific query");
//			err.printStackTrace();
//		}
//
//		connection.close();
//
//		return resultValue;
//	}
	
}
