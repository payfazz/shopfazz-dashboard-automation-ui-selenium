package com.shopfazz.environment;

import com.shopfazz.methods.BrowserUtils;
import com.shopfazz.methods.PropertiesManagementMethods;

public interface BaseTest {
	PropertiesManagementMethods props = new PropertiesManagementMethods();
	BrowserUtils browser = new BrowserUtils();
//	Helper helper = new Helper();
}
