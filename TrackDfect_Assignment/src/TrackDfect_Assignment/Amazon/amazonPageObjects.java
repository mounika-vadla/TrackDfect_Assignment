package TrackDfect_Assignment.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPageObjects {
	WebDriver driver;
	public amazonPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
		
		@FindBy(id="twotabsearchtextbox")
		WebElement search;
		
		public WebElement search() {
			return search;
		}
			@FindBy(xpath="//input[@value='Go']")
			WebElement clickOnSearch;
			
			public WebElement clickOnSearch() {
				return clickOnSearch;
			}
			@FindBy(id="a-autoid-1-announce")
			WebElement addItemtoCart;
			
			public WebElement addItemtoCart() {
				return addItemtoCart;
			}
			
			
			@FindBy(id="ap_email")
			WebElement emailId;
			
			public WebElement emailId() {
				return emailId;
			}
			@FindBy(id="continue")
			WebElement clickOnEmailId;
			
			public WebElement clickOnEmailId() {
				return clickOnEmailId;
			}
			@FindBy(id="ap_password")
			WebElement password;
			
			public WebElement password() {
				return password;
			}
			@FindBy(id="signInSubmit")
			WebElement clickOnSubmitt;
			
			public WebElement clickOnSubmitt() {
				return clickOnSubmitt;
			}
			@FindBy(id="nav-cart-count-container")
			WebElement cartCount;
			
			public WebElement cartCount() {
				return cartCount;
			}
			@FindBy(id="nav-cart")
			WebElement clickOnCart;
			
			public WebElement clickOnCart() {
				return clickOnCart;
			}
			@FindBy(name="proceedToRetailCheckout")
			WebElement proceedToBuy;
			
			public WebElement proceedToBuy() {
				return proceedToBuy;
			}
			
			
			
			@FindBy(id="address-ui-widgets-countryCode-dropdown-nativeId")
			WebElement selectCountry;
			
			public WebElement selectCountry() {
				return selectCountry;
			}

			
			
			@FindBy(id="address-ui-widgets-enterAddressFullName")
			WebElement fullName;
			
			public WebElement fullName() {
				return fullName;
			}
			
			@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
			WebElement phoneNumber;
			
			public WebElement phoneNumber() {
				return phoneNumber;
			}
			@FindBy(id="address-ui-widgets-enterAddressPostalCode")
			WebElement postalCode;
			
			public WebElement postalCode() {
				return postalCode;
			}
			@FindBy(id="address-ui-widgets-enterAddressLine1")
			WebElement address;
			
			public WebElement address() {
				return address;
			}
			@FindBy(id="address-ui-widgets-enterAddressLine2")
			WebElement area;
			
			public WebElement area() {
				return area;
			}
			@FindBy(id="address-ui-widgets-landmark")
			WebElement landmark;
			
			public WebElement landmark() {
				return landmark;
			}
			
				
				@FindBy(xpath="//span[@id=\"address-ui-widgets-form-submit-button\"]")
				WebElement clickONSubmittAddress;
				
				public WebElement clickONSubmittAddress() {
					return clickONSubmittAddress;
				}
				
				
				@FindBy(xpath="//input[@value='Continue']")
				 WebElement continuetopayment  ;
				
				public WebElement continuetopayment() {
					return continuetopayment;
				}


				@FindBy(id="nav-cart")
				 WebElement goToCart  ;
				
				public WebElement goToCart() {
					return goToCart;
				}
				@FindBy(xpath="//input[@value='Delete']")
				 WebElement deleteCartItems  ;
				
				public WebElement deleteCartItems() {
					return deleteCartItems;
				}
				
				
				
				
				
				
				
			
			
			

	
	


	}


