package com.shopfazz.pageobjects;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.shopfazz.environment.BaseTest;
import com.shopfazz.logger.Log;
//import com.shopfazz.methods.DataBaseConnector;
import com.shopfazz.methods.PropertiesManagementMethods;
import com.shopfazz.methods.TestCaseFailed;
//import com.shopfazz.model.BaseUser;

import junit.framework.Assert;

import static com.shopfazz.methods.SelectorType.XPATH;
import static com.shopfazz.methods.SelectorType.CSS;
import static com.shopfazz.methods.SelectorType.ID;

public class ProfileDashboard implements BaseTest {

	private static String env = System.getProperty("environment");

	private String profileBtn = "#root > div > div.ant-layout-header > div > div.header-dropdown > a > span.ant-avatar.ant-avatar-circle.ant-avatar-icon > i > svg";

//	private String btnSetting = "btn_setting_menu";
//
//	private String lblProfile = "#root > div > section > section > div > div.header-title";
//
//	private String txtphoneNumber = "txt_phone_number";
//
//	private String txtFullName = "txt_full_name";
//
//	private String txtEmail = "txt_email";
//
//	private String btnSaveUpdateProfile = "btn_save_edit_profile";
//
//	private String btnLogout = "body > div:nth-child(6) > div > div.ant-drawer-content-wrapper > div > div > div.ant-drawer-body > div > ul > li.ant-menu-item";
//
//	private String lblSalesProfile = "#root > div > section > section > main > div > div.app-content > div.ant-card.profile__content.ant-card-bordered > div > div > div > h2";
//
//	private String alertUpdate = "body > div:nth-child(6) > div > span > div > div > div > span";
//
//	private String mnChangePassword = "mn_sb_change_pass";
//
//	private String mnLogout = "mn_logout_profile";
//
//	private String lblSetNewPassword = "#root > div > section > section > main > div > div.app-content > div.ant-card.profile__content.ant-card-bordered > div > div > div > h2";
//
//	private String txtNewPassword = "txt_new_password";
//
//	private String txtRetypeNewPassword = "txt_retype_new_password";
//
//	private String btnSaveChangePass = "btn_save_change_pass";
//
//	private String btnBreadcrumb = "#root > div > section > section > main > div > div.app-breadcrumb > i > svg";
//
//	private String headerUserManagement = "#root > div > section > section > div > div.header-title";
//
//	private String labelCodeUser = "#root > div > section > section > main > div > div.app-content > div.ant-card.profile__nav.ant-card-bordered > div > div > div > div > div:nth-child(2) > div.med-text.--gray";

//	private static String phoneNumberTemp;
//
//	public static HashMap addUserName = helper.generateString("name");
//	public static String phoneUserNumber = helper.generatePhoneNumberRandom();
//	public static String emailUser = helper.generateEmailRandom();
//
//	public static BaseUser userLogin = new BaseUser();
//
//	/* getter */
//	public String getTxtphoneNumber() {
//		return txtphoneNumber;
//	}

	public void userClickProfileButton() {
		browser.click(XPATH, "//*[@id=\"root\"]/div/div[1]/div/div[3]/a");
	}

//	public void userClickBtnSetting() {
//		browser.clickBtnJavaScript(ID, btnSetting);
//	}
//
//	public void verifyUserOnProfilePage() {
//		assertTrue(browser.isElementDisplayed(CSS, lblProfile));
//	}
//
//	public void setPhoneNumber(String phonenumber) throws TestCaseFailed {
//		Log.INFO("Enter phone number : " + phonenumber);
//		browser.click(ID, txtphoneNumber);
//		browser.clearText(ID, txtphoneNumber);
//		try {
//			browser.enterTextBySendKeys(ID, phonenumber, txtphoneNumber);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Log.INFO("After phone number : " + browser.getElementAttribute(ID, txtphoneNumber, "value"));
//
//	}
//
//	public void setPhoneNumber() throws TestCaseFailed {
//		phoneUserNumber = helper.generatePhoneNumberRandom();
//		Log.INFO("Enter phone number : " + phoneUserNumber);
//		browser.click(ID, txtphoneNumber);
//		browser.clearText(ID, txtphoneNumber);
//		try {
//			browser.enterTextBySendKeys(ID, phoneUserNumber, txtphoneNumber);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Log.INFO("After phone number : " + browser.getElementAttribute(ID, txtphoneNumber, "value"));
//
//	}
//
//	public void setFullname(String fullname) throws TestCaseFailed {
//		Log.INFO("Enter fullname : " + fullname);
//		browser.click(ID, txtFullName);
//		browser.clearText(ID, txtFullName);
//		try {
//			browser.enterTextBySendKeys(ID, fullname, txtFullName);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Log.INFO("after enter fullname : " + browser.getElementAttribute(ID, txtFullName, "value"));
//	}
//
//	public void setFullname() throws TestCaseFailed {
//		addUserName = helper.generateString("name");
//		Log.INFO("Enter fullname : " + addUserName.get("fullname"));
//		String fullname = addUserName.get("fullname").toString();
//		browser.click(ID, txtFullName);
//		browser.clearText(ID, txtFullName);
//		try {
//			browser.enterTextBySendKeys(ID, fullname, txtFullName);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Log.INFO("after enter fullname : " + browser.getElementAttribute(ID, txtFullName, "value"));
//	}
//
//	public void setEmail() throws TestCaseFailed {
//		emailUser = helper.generateEmailRandom();
//		Log.INFO("Enter email : " + emailUser);
//		browser.click(ID, txtEmail);
//		Log.INFO("after enter email pre : " + browser.getElementAttribute(ID, txtEmail, "value"));
//		try {
//			browser.enterTextBySendKeys(ID, emailUser, txtEmail);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Log.INFO("after enter email : " + browser.getElementAttribute(ID, txtEmail, "value"));
//	}
//
//	public void setEmail(String email) throws TestCaseFailed {
//		Log.INFO("Enter email : " + email);
//		browser.click(ID, txtEmail);
//		Log.INFO("after enter email pre : " + browser.getElementAttribute(ID, txtEmail, "value"));
//		try {
//			browser.enterTextBySendKeys(ID, email, txtEmail);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Log.INFO("after enter email : " + browser.getElementAttribute(ID, txtEmail, "value"));
//	}
//
//	public void clickBtnUpdateProfile() {
//		Log.INFO("click button update profile");
//		browser.click(ID, btnSaveUpdateProfile);
//	}
//
//	public void verifyAlertUpdateSuccess(String str) {
//		Log.INFO("verify alert");
//		browser.waitForElementToDisplay(CSS, alertUpdate, "10");
//		browser.assertInnerHtml(alertUpdate, CSS, str);
//	}
//
//	public void clickEmailTextField() {
//		browser.click(ID, txtEmail);
//	}
//
//	public void clearEmailTextField() throws InterruptedException {
//		// String text = browser.getElementByValue(ID, txtEmail);
//		// browser.enterTextBySendKeys(ID, text, txtEmail);
//		Thread.sleep(2000);
//		browser.clearText(ID, txtEmail);
//		Log.INFO(("email after clear" + browser.getElementByValue(ID, txtEmail)));
//	}
//
//	public void clearFullnameTextField() throws InterruptedException {
//		// String text = browser.getElementByValue(ID, txtFullName);
//		// browser.enterTextBySendKeys(ID, text, txtFullName);
//		Thread.sleep(2000);
//		browser.clearText(ID, txtFullName);
//		Log.INFO(("fullname after clear" + browser.getElementByValue(ID, txtFullName)));
//	}
//
//	public void clearPhoneNumberTextField() throws InterruptedException {
//		// String text = browser.getElementByValue(ID, txtphoneNumber);
//		// browser.enterTextBySendKeys(ID, text, txtphoneNumber);
//		Thread.sleep(2000);
//		browser.clearText(ID, txtphoneNumber);
//		Log.INFO(("phone number after clear" + browser.getElementByValue(ID, txtphoneNumber)));
//	}
//
//	public void clickBreadcrumb() throws TestCaseFailed {
//		browser.click(CSS, btnBreadcrumb);
//	}
//
//	public void verifyHeaderTitle(String arg) throws InterruptedException {
//		Log.INFO("verify header title");
//		Thread.sleep(5000);
//		browser.assertInnerHtml(headerUserManagement, CSS, arg);
//	}
//
//	public void verifyAlertTextfieldPhoneNumber() {
//		Log.INFO("verify alert on phone number text field");
//		Assert.assertEquals("Please fill out this field.", browser.checkAlertOnTextfield(ID, txtphoneNumber));
//	}
//
//	public void verifyAlertTextfieldFullname() {
//		Log.INFO("verify alert on fullname text field");
//		Assert.assertEquals("Please fill out this field.", browser.checkAlertOnTextfield(ID, txtFullName));
//	}
//
//	public void verifyAlertTextfieldEmail() {
//		Log.INFO("verify alert on email text field");
//		Assert.assertEquals("Please fill out this field.", browser.checkAlertOnTextfield(ID, txtEmail));
//	}
//
//	public void verifyAlertTextfieldPhoneNumberforFormat() {
//		Log.INFO("verify alert format on phone number text field");
//		Assert.assertEquals("Please match the requested format.", browser.checkAlertOnTextfield(ID, txtphoneNumber));
//	}
//
//	public void verifyAlertTextfieldEmailforFormat() {
//		Log.INFO("alert email format wrong on email text field");
//		Assert.assertTrue(browser.checkRuledTextfield(ID, txtEmail));
//	}
//
//	public String setPhoneNumberWithRegisteredPhone(String prefixNumber) throws SQLException {
//		String resultValue = "";
//		String sqlQuery = "select \"Phone\" from \"Account\" where  \"Phone\" like ? order by \"CreatedDateUTC\" desc limit 1;";
//
//		Connection connection = DataBaseConnector.createConnectionDB(env);
//		PreparedStatement stmt = connection.prepareStatement(sqlQuery);
//		stmt.setString(1, prefixNumber + "%");
//		ResultSet rs = stmt.executeQuery();
//
//		try {
//
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
//		Log.INFO("get data : " + resultValue);
//		return resultValue;
//	}
//
//	public String setWithRegisteredEmail() throws SQLException {
//		String resultValue = "";
//		String sqlQuery = "select \"Email\" from \"Account\" order by \"CreatedDateUTC\" desc limit 1;";
//		Connection connection = DataBaseConnector.createConnectionDB(env);
//		PreparedStatement stmt = connection.prepareStatement(sqlQuery);
//		ResultSet rs = stmt.executeQuery();
//
//		try {
//
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
//		Log.INFO("get existing email : " + resultValue);
//		return resultValue;
//	}
//
//	public String setWithRegisteredUsername() throws SQLException {
//		String resultValue = "";
//		String sqlQuery = "select \"Fullname\" from \"Account\" order by \"CreatedDateUTC\" desc limit 1;";
//		Connection connection = DataBaseConnector.createConnectionDB(env);
//		PreparedStatement stmt = connection.prepareStatement(sqlQuery);
//		ResultSet rs = stmt.executeQuery();
//
//		try {
//
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
//		Log.INFO("get data : " + resultValue);
//		return resultValue;
//	}
//
//	public void verifyPrefixPhoneNumberUser(String prefixNumber) throws SQLException, InterruptedException {
//		int resultValue = 0;
//		String phoneNumber, tempPhoneNumber = "";
//		Connection connection = DataBaseConnector.createConnectionDB(env);
//		tempPhoneNumber = browser.getElementByValue(ID, txtphoneNumber);
//		if (tempPhoneNumber.contentEquals("")) {
//			tempPhoneNumber = browser.getElementAttribute(ID, txtphoneNumber, "value");
//		}
//
//		phoneNumber = props.getProperty("phone_number_prefix_" + prefixNumber);
//
//		String sqlQuery = "select \"ID\" from \"Account\" where  \"Phone\" = ?";
//
//		PreparedStatement stmt = connection.prepareStatement(sqlQuery);
//		stmt.setString(1, tempPhoneNumber);
//		ResultSet rs = stmt.executeQuery();
//
//		try {
//
//			while (rs.next()) {
//				resultValue = rs.getInt(1);
//			}
//
//			String SqlUpdate = "UPDATE \"Account\"  " + "SET \"Phone\" = ? " + "WHERE \"ID\" = ?";
//
//			int affectedrows = 0;
//
//			try {
//				stmt = connection.prepareStatement(SqlUpdate);
//				stmt.setString(1, phoneNumber);
//				stmt.setInt(2, resultValue);
//
//				affectedrows = stmt.executeUpdate();
//				// refresh page if success updated
//				if (affectedrows > 0) {
//					browser.refreshDriver();
//					browser.wait(5000);
//				}
//
//			} catch (SQLException ex) {
//				System.out.println(ex.getMessage());
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
//		Log.INFO("get phone number : " + resultValue);
//
//	}
//
//	public void verifyTextFieldDisabled(String elm) throws InterruptedException {
//		boolean isEnabled = true;
//		Thread.sleep(2000);
//		if (elm.contentEquals("phone")) {
//			isEnabled = browser.isElementEnabled(ID, txtphoneNumber);
//		} else if (elm.contentEquals("email")) {
//			isEnabled = browser.isElementEnabled(ID, txtEmail);
//		} else if (elm.contentEquals("fullname")) {
//			isEnabled = browser.isElementEnabled(ID, txtFullName);
//		}
//		Assert.assertFalse(isEnabled);
//	}
//
//	public String setDataAlreadyRegistered(String role, String keyword) throws SQLException {
//		String resultValue = "";
//		String sqlQuery = "select \"Phone\",\"Email\" from \"Account\" where split_part(\"Code\",'-','1') = '"
//				+ role.toUpperCase() + "' limit 1;\n" + "";
//
//		Connection connection = DataBaseConnector.createConnectionDB(env);
//		PreparedStatement stmt = connection.prepareStatement(sqlQuery);
//		ResultSet rs = stmt.executeQuery();
//
//		try {
//
//			while (rs.next()) {
//				resultValue = rs.getString(keyword).toString();
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
//		Log.INFO("get data : " + resultValue);
//		return resultValue;
//	}
//
//	public String setPhoneNumberAlreadyRegisteredByAgent() throws SQLException {
//		String resultValue = "";
//		String sqlQuery = "select \"Phone\" from \"Agent\" limit 1";
//
//		Connection connection = DataBaseConnector.createConnectionDB(env);
//		PreparedStatement stmt = connection.prepareStatement(sqlQuery);
//		ResultSet rs = stmt.executeQuery();
//
//		try {
//
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
//		Log.INFO("get phone numbe : " + resultValue);
//		return resultValue;
//	}
//
//	public String[] getSubordinate(String accCode, String role, String keyword) throws SQLException {
//		String[] resultValue = new String[1000];
//		int i = 0;
//		String sqlQuery = " with recursive ancestor(\"AccountCode\",\"Role\",\"Value\", \"Depth\") as(\n"
//				+ "				select \"AccountCode\", json_extract_path(to_json(\"Value\"),'accountCode') #>> '{}' ,\"Value\", 1 as \"Depth\"\n"
//				+ "				from \"AccountVariable\"\n"
//				+ "				where json_extract_path(to_json(\"Value\"),'accountCode') #>> '{}' = '" + accCode
//				+ "' and json_extract_path(to_json(\"Value\"),'enabled') #>> '{}' = 'true'\n"
//				+ "				union all \n"
//				+ "				select c.\"AccountCode\", json_extract_path(to_json(c.\"Value\"),'accountCode') #>> '{}',c.\"Value\", p.\"Depth\" + 1 \n"
//				+ "				from ancestor p, \"AccountVariable\" c  \n"
//				+ "				where json_extract_path(to_json(c.\"Value\"),'accountCode') #>> '{}' = p.\"AccountCode\" )\n"
//				+ "			  select b.\"AccountCode\", json_extract_path(to_json(b.\"Value\"),'code') #>> '{}' as \"Role\", \"Depth\", d.\"Fullname\"\n"
//				+ "			  from ancestor\n"
//				+ "				join \"AccountVariable\" b on ancestor.\"AccountCode\" = b.\"AccountCode\"\n"
//				+ "				join \"Account\" d on ancestor.\"AccountCode\" = d.\"Code\"\n"
//				+ "				join (select \"AccountCode\" from \"AccountVariable\" av where av.\"VariableName\" = 'FazzAccountMap' and av.\"Value\" ->> 'enabled' = 'true') as accVar on ancestor.\"AccountCode\" = accvar.\"AccountCode\"\n"
//				+ "			  where json_extract_path(to_json(b.\"Value\"),'code') #>> '{}' is not null\n"
//				+ "			  and split_part(d.\"Code\",'-',1) = '" + role.toUpperCase() + "'\n"
//				+ "			  order by \"Depth\"";
//
//		Connection connection = DataBaseConnector.createConnectionDB(env);
//		PreparedStatement stmt = connection.prepareStatement(sqlQuery);
//		ResultSet resultSet = stmt.executeQuery();
//
//		try {
//
//			while (resultSet.next()) {
//				resultValue[i] = resultSet.getString(keyword);
//				i++;
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
//		Log.INFO("get account subordinate: " + resultValue);
//		return resultValue;
//	}
//
//	public String getAgentUnderUser(String[] arrSE, String keyword) throws SQLException {
//		String resultValue = "";
//		String sqlQuery = "SELECT\n" + "			a.\"CreatedDateUTC\",\n" + "			a.\"AgentID\",\n"
//				+ "			a.\"Address\",\n" + "			a.\"BusinessName\",\n" + "			a.\"BusinessType\",\n"
//				+ "			a.\"ContactPerson\",\n" + "			a.\"Phone\",\n" + "			a.\"Verified\",\n"
//				+ "			a.\"ZipCode\",\n" + "			a.\"Level\",\n" + "			a.\"RegisteredAtClient\",\n"
//				+ "			aa.\"Status\",\n" + "			a.\"VillageName\",\n" + "			a.\"VillageCode\",\n"
//				+ "			a.\"DistrictName\",\n" + "			a.\"DistrictCode\",\n"
//				+ "			a.\"RegencyName\",\n" + "			a.\"RegencyCode\",\n"
//				+ "			a.\"ProvinceName\",\n" + "			a.\"ProvinceCode\",\n"
//				+ "			a.\"TypeMerchant\",\n" + "			a.\"Email\",\n" + "			a.\"OutletImage\",\n"
//				+ "			acc.\"Code\",\n" + "			acc.\"Fullname\",\n" + "			subs.\"EndDate\",\n"
//				+ "			mo.\"Type\"\n" + "		FROM\n" + "			\"Agent\" a\n"
//				+ "		JOIN \"AccountAgent\" aa ON\n" + "			a.\"AgentID\" = aa.\"AgentID\"\n"
//				+ "		JOIN \"Account\" acc ON\n" + "			acc.\"Code\" = aa.\"AccountCode\"\n"
//				+ "		LEFT JOIN \"Subscribe\" subs ON\n" + "			a.\"AgentID\" = subs.\"AgentID\" \n"
//				+ "		LEFT JOIN \"MasterOutlet\" mo ON\n" + "			a.\"BusinessType\" = mo.\"ID\"\n"
//				+ "		WHERE\n" + "		aa.\"Status\" in ('Approved','Pending') and aa.\"AccountCode\" = ANY(?)\n"
//				+ "		and a.\"Phone\" not in (select \"Phone\" from \"Account\")" + "	limit 1;";
//
//		Connection connection = DataBaseConnector.createConnectionDB(env);
//		PreparedStatement stmt = connection.prepareStatement(sqlQuery);
//		stmt.setArray(1, connection.createArrayOf("text", arrSE));
//		ResultSet rs = stmt.executeQuery();
//
//		try {
//
//			while (rs.next()) {
//				resultValue = rs.getString(keyword).toString();
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
//		Log.INFO("get agent : " + resultValue);
//		return resultValue;
//
//	}
//
//	public void storeValueBeforeUpdated() {
//		String codeTemp = browser.getElementText(CSS, labelCodeUser);
//		userLogin.setCode(codeTemp);
//		String fullNameTemp = browser.getElementAttribute(ID, txtFullName, "value");
//		userLogin.setFullname(fullNameTemp);
//		String phoneNumberTemp = browser.getElementAttribute(ID, txtphoneNumber, "value");
//		userLogin.setPhoneNumber(phoneNumberTemp);
//		String emailTemp = browser.getElementAttribute(ID, txtEmail, "value");
//		userLogin.setEmail(emailTemp);
//	}
//
//	public void updateDataAccount(Boolean fullname, Boolean phoneNumber, Boolean email) throws SQLException {
//		String resultValue = "";
//		String sqlQuery = "update \"Account\" set ";
//		if (fullname) {
//			sqlQuery += "\"Fullname\"='" + userLogin.getFullname() + "',";
//		}
//		if (phoneNumber) {
//			sqlQuery += "\"Phone\"='" + userLogin.getPhoneNumber() + "',";
//		}
//		if (email) {
//			sqlQuery += "\"Email\"='" + userLogin.getEmail() + "'";
//		}
//		sqlQuery += "where \"Code\"='" + userLogin.getCode() + "'";
//
//		Connection connection = DataBaseConnector.createConnectionDB(env);
//		PreparedStatement stmt = connection.prepareStatement(sqlQuery);
//		
//		try {
//			stmt.executeQuery();
//			connection.commit();
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
//		Log.INFO("reset data table account : " + resultValue);
//
//	}

}
