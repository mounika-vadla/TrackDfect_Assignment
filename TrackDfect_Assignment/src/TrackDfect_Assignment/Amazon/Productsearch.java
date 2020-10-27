package TrackDfect_Assignment.Amazon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;



@Test
public class Productsearch {
	WebDriver driver;
	amazonPageObjects amazonPageObject;
	@BeforeTest
	public void  setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aparna\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		amazonPageObject=new amazonPageObjects(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority=1)
	
	public void selectItem() throws InterruptedException {
		
		amazonPageObject.search().sendKeys("The Power of Your Subconscious Mind");
		amazonPageObject.clickOnSearch().click();
		 List<WebElement> books = driver.findElements(By.tagName("a"));
		    Iterator<WebElement> i = books.iterator();

		    while(i.hasNext()) {
		        WebElement book = i.next();
		        if(book.getText().contains("The Power of Your Subconscious Mind" )) {
		        	book.click();
		            break;
		        }
		    }
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

	
		}

		}
		
		amazonPageObject.addItemtoCart().click();
		
	}	
	@DataProvider
	public Iterator<Object[]> getdata() {
		ArrayList<Object[]> testData=TestUtil.getDataFromExcel();
		return testData.iterator();
	}
		
	@Test(dataProvider="getdata",dependsOnMethods="selectItem")
	
		public void addItem(String emailId,String password,String fullName,String phoneNo,String postalCode,String address,
				String area,String landmark,String city) throws InterruptedException
		{
		//System.out.println(emailId);
		amazonPageObject.emailId().sendKeys(emailId);
		amazonPageObject.clickOnEmailId().click();
		amazonPageObject.password().sendKeys(password);
		amazonPageObject.clickOnSubmitt().click();
		 String Cartcount=amazonPageObject.cartCount().getText();
	        System.out.println(Cartcount);
	        
	        

	        if (Cartcount.equals(1)) {
	            System.out.println("Item Added to Cart ") ;   
	        }
	        else
	        {
	            System.out.printf("Item is not added to cart");
	        }
	        amazonPageObject.clickOnCart().click();
	        amazonPageObject.proceedToBuy().click();
	        WebElement countryDropDown =amazonPageObject.selectCountry();  
			Select dropdown = new Select(countryDropDown); 
			dropdown.selectByValue("IN");  
	   
			amazonPageObject.fullName().sendKeys(fullName);
			amazonPageObject.phoneNumber().sendKeys(phoneNo.toString());
			System.out.println(phoneNo);
			amazonPageObject.postalCode().sendKeys(postalCode);
			Thread.sleep(2000);
			amazonPageObject.address().sendKeys(address);
			amazonPageObject.area().sendKeys(area);
			amazonPageObject.landmark().sendKeys(landmark);
			
			amazonPageObject.clickONSubmittAddress().click();
			amazonPageObject.continuetopayment().click();
			System.out.println(driver.getTitle());
			

			for(int i1 =0; i1<3;i1++) {
				driver.navigate().back();
			}
			
			  
			amazonPageObject.goToCart().click();
			amazonPageObject.deleteCartItems().click();
			WebElement s=driver.findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']"));
			String text=s.getText();
			System.out.println(text);
			Assert.assertEquals(text, "Your Amazon Cart is empty.");
	                
		
		}
		

		@AfterTest
		public void teardown() {
			System.out.println("text");
			driver.quit();
		
		}
		}


