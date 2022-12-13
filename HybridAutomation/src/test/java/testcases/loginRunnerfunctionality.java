package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import utilities.logData;
import utilities.readExlData;
import utilities.testData;

public class loginRunnerfunctionality {
	
	@Test
	public static void userLogin() throws IOException, InterruptedException
	{
		//Declare the external excel file path 
		String filepath = testData.externalExcelDatafile;
		
		//import the excel sheet
		readExlData.readExceldata(filepath, "Sheet1");
		
		for (int iRow=1; iRow<=7; iRow++)
		{
			String keywords=readExlData.readCelldata(iRow, 3);
			
			if (keywords.equals("openBrowser"))
			{
				loginKeywords.openBrowser();
				
				System.out.println("opened the browser");
				
				logData.info("opened the browser");
				
				
			}
			else if (keywords.equals("loadAUT"))
			{
				loginKeywords.loadAUT();
				
				System.out.println("open the application URL successfully");
				
				logData.info("open the application URL successfully");
			}
			else if (keywords.equals("loginTitlevalidate"))
			{
				loginKeywords.loginTitlevalidate();
				
				System.out.println("validated the login page");
				
				logData.info("validated the login page");				
				
			}
			else if (keywords.equals("loginFunctionality"))
			{
				loginKeywords.loginFunctionality();
				
				System.out.println("login functionality completed successfully");
				
				logData.info("login functionality completed successfully");
			}
			else if (keywords.equals("afterloginTitlevalidate"))
			{
				loginKeywords.afterloginTitlevalidate();
				
				System.out.println("after login page validated");
				
				logData.info("after login page validated");
			}
			else if (keywords.equals("logoutFunctionality"))
			{
				loginKeywords.logoutFunctionality();
				
				System.out.println("logout functionality completed successfully");
				
				logData.info("logout functionality completed successfully");
			}
			else if (keywords.equals("closeBrowser"))
			{
				loginKeywords.closeBrowser();
				
				System.out.println("closed the browser");
				
				logData.info("closed the browser");
			}
		}
		
	}

}
