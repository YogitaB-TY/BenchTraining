package testNgBasics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider {
	
	@Test(dataProvider = "testData")
	public void test(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider(name = "testData")
	public String[][] testData() {
		int row_size= 3;
		int col_size=2;
		String[][] data=new String[row_size][col_size];
		data[0][0]="username1";
		data[0][1]="password1";
		data[1][0]="username2";
		data[1][1]="password2";
		data[2][0]="username3";
		data[2][1]="password3";
		return data;
	}

}
