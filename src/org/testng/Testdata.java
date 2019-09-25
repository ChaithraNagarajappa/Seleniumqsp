package org.testng;

import org.testng.annotations.Test;

public class Testdata {
	
	@Test(dataProviderClass = Readdataxlsdata.class, dataProvider = "CreatUser")
	public void test(String user, String pwd) {
		System.out.println(user);
		System.out.println(pwd);
	}

}

