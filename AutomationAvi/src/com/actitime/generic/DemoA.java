package com.actitime.generic;

import java.io.IOException;

public class DemoA {
	public static void main(String[] args) throws IOException {
			FileLib f = new FileLib();
			String url = f.readDataFromProperty("Url");
			String un = f.readDataFromProperty("Username");
			String pwd = f.readDataFromProperty("Password");
			System.out.println(url);
			System.out.println(un);
			System.out.println(pwd);
			String data = f.readDataFormProperty("invalidLogin", 7, 1);
			String data1 = f.readDataFormProperty("createCustomer", 1, 2);
			String data2 = f.readDataFormProperty("multipleData", 4, 13);
			System.out.println(data);
			System.out.println(data1);
			System.out.println(data2);
			f.writeDataIntoExcel("createCustomer", 1, 5,"password");
			f.writeDataIntoExcel("multipleData", 21, 2, "Sumanth");
			f.writeDataIntoExcel("invalidLogin", 0, 2, "Pass");

		}
}
