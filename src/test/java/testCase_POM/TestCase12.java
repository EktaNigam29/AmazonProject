package testCase_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon_POM.Checkout11;
import Amazon_POM.Eachpaymentmethod_12;
import Amazon_POM.HOmepage_amazon;
import Amazon_POM.Login_Amazon;
import Amazon_POM.Search_amazon;
import utility_packages.DataDrivenTesting;
@Listeners(utility_packages.Listen1.class)
public class TestCase12 extends Launch_Quit1 {
	
	
	@Test
	public void Checkpayment() throws EncryptedDocumentException, IOException, InterruptedException
	{
		HOmepage_amazon h1=new HOmepage_amazon(driver);
		h1.accountandlist(driver);
		h1.sigin();
		DataDrivenTesting d1=new DataDrivenTesting();
		d1.credentials();
		Login_Amazon l1=new Login_Amazon(driver);
		l1.un();
		l1.cont1();
		l1.pwd();
		l1.signin();
		Search_amazon a4=new Search_amazon(driver);
		a4.book(driver);
		a4.children();
		
		a4.cb(driver);
		
		a4.addto_cart();
		a4.oneitem();
		a4.buyy();
		
		Checkout11 ck1=new Checkout11(driver);
		ck1.address();
		
		Eachpaymentmethod_12 ep=new Eachpaymentmethod_12(driver);
		ep.visa1();
		ep.credit();
		ep.netbanking1();
		ep.UPI1();
		ep.EMI1();
		ep.COD();
	WebElement w1=	ep.COD1();
	boolean b5=w1.isSelected();
	Assert.assertEquals(b5, true, "failed");

	}

}
 
	
	
	


