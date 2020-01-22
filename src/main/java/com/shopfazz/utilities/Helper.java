package com.shopfazz.utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;
import com.shopfazz.logger.Log;
//import com.shopfazz.methods.DataBaseConnector;
//import com.github.javafaker.Faker;

public class Helper {
	

private static String env = System.getProperty("environment");

	public static void main(String[] args) {

	}
	
	
	public static String generatePhoneNumberRandom(){
		
		long number=0;
		Boolean isValid = false;
		
		while(!isValid) {
			number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
			String tempPhoneNumber = "8"+String.valueOf(number);
			
//			try {
//				isValid = checkPhoneNumberRegistered(tempPhoneNumber);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
		}
        
		return "08" + String.valueOf(number);
	}
	
	

	public static String generateEmailRandom() {
		String SALTCHARS = "abcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString()+"@mailinator.com";
		return saltStr;
	}
	
	public static HashMap generateString(String param) {
		HashMap result=new HashMap();
		Faker faker = new Faker();
		if(param.contentEquals("name")) {
			String firstName = faker.name().firstName().replaceAll("[^a-zA-Z0-9\\s+]", "");
			String lastName = faker.name().lastName().replaceAll("[^a-zA-Z0-9\\s+]", "");
			
			result.put("username", firstName+"."+lastName+".automation");
			result.put("fullname", firstName+" "+lastName+" automation");
		}else if(param.contentEquals("alamat")) {
			String email = faker.address().streetAddress();
			//result = faker.address().streetAddress();
		}
		return result;
	}
	
	public static int generateRandomNumber(int max) {
		int random = (int )(Math.random() * max + 1);
		return random;
	}
	
	public static boolean listContainString(List<String> arrStr, String keyword) {
		boolean isContain = arrStr.contains(keyword);
		return isContain;
	}
	
//	public static Boolean checkPhoneNumberRegistered(String phoneNumber) throws SQLException {
//		Boolean result = false;
//		
//		String sqlQuery = "select \"Code\" from \"Account\" where \"Phone\" like '%"+phoneNumber+"%'";
//        Connection connection = DataBaseConnector.createConnectionDB(env);
//        PreparedStatement stmt = connection.prepareStatement(sqlQuery);
//        ResultSet rs=stmt.executeQuery();
//        
//        try {
//        		
//            	if(rs.getFetchSize() > 0) {
//            		result =  false;
//            	}else {
//            		result =  true;
//            	}
//           
//            
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        catch (NullPointerException err) {
//            System.out.println("No Records obtained for this specific query");
//            err.printStackTrace();
//        }
//        
//        connection.close();
//        
//        return result;
//	}
	
}
