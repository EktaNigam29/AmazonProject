package testCase_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon_POM.Search_amazon;
import Amazon_POM.Withoutlogin_15;
@Listeners(utility_packages.Listen1.class)
public class Testcase15 extends Launch_Quit1
{
@Test
//(retryAnalyzer=utility_packages.RetryLogic.class)
public void search_product() throws InterruptedException, EncryptedDocumentException, IOException
{
	Search_amazon a4=new Search_amazon(driver);
	a4.book(driver);
	a4.children();
	a4.cb(driver);
	a4.addto_cart();
	//a4.buyy();
String s=	driver.getTitle();
	Assert.assertEquals(s, "Amazon.in Shopping Cart", "failed");
	Withoutlogin_15 wl=new Withoutlogin_15(driver);
	
	
	
	
}
}
