package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotActiveException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.jsoup.select.Evaluator.Id;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{

	
	public RemoteWebDriver driver;
	
	int i=1;
	
	public static Properties prop;
	
	public void loadObjects() {
		
		try {
			 prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void unloadObjects() {
		prop=null;
	}
	
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			} else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			//System.out.println("The browser "+browser+" is launched with given URL : "+url);
			reportStep("The browser "+browser+" is launched with given URL : "+url, "pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("The browser "+browser+" is not launched due to session not created error", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error", "fail");	
		}
		
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with data "+ data);
			reportStep("The element with id "+idValue+" is entered with data "+ data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to uknown error");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to uknown error", "Fail");
		} 
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data "+ data);
			reportStep("The element with name "+nameValue+" is entered with data "+ data, "Pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with name "+nameValue+" is not found in the DOM");
			reportStep("The Element with name "+nameValue+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with name "+nameValue+" is not visible in the application");
			reportStep("The Element with name "+nameValue+" is not visible in the application", "Fail");
		}catch(ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with name "+nameValue+" is not intractable in the application");
			reportStep("The Element with name "+nameValue+" is not intractable in the application", "Fail");
		}catch(StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element witn name "+nameValue+" is not Stable in the applicaiton");
			reportStep("The Element with name "+nameValue+" is not intractable in the application", "Fail");
		}catch(WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to uknown error");
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to uknown error", "Fail");
		}
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The Element with xapth "+xpathValue+" is entered with data "+ data);
			reportStep("The Element with xapth "+xpathValue+" is entered with data "+ data, "Pass");
		
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The Element with xapth "+xpathValue+" is not found int he DOM");
			reportStep("The Element with xapth "+xpathValue+" is not found int he DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with xapth "+xpathValue+" is not visible in the application");
			reportStep("The Element with xapth "+xpathValue+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with xapth "+xpathValue+" is not interactable in the application");
			reportStep("The Element with xapth "+xpathValue+" is not interactable in the application", "Fail");
		}catch(StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element witn xapth "+xpathValue+" is not Stable in the applicaiton");
			reportStep("The Element witn xapth "+xpathValue+" is not Stable in the applicaiton", "Fail");
		}catch(WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xapth "+xpathValue+" is not entered with data " +data+ " due to uknown error");
			reportStep("The element with xapth "+xpathValue+" is not entered with data " +data+ " due to uknown error", "Fail");
		}
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		String titleverify;
		try {
			titleverify = driver.getTitle();
			if(title.equals(titleverify)) {
				//System.out.println("The title "+titleverify+" of the page "+title+" is matched ");
				reportStep("The title "+titleverify+" of the page "+title+" is matched ", "Pass");
			}else
				System.err.println("The title "+titleverify+" of the page "+title+" is not matched ");
				reportStep("The title "+titleverify+" of the page "+title+" is not matched ", "Fail");
			
		}catch(WebDriverException e){
			System.err.println("The title of the page cannot be verified due to unknown error");
			reportStep("The title of the page cannot be verified due to unknown error", "Fail");
			
		}finally {
			takeSnap();
		}
		
		}
				
		
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext = driver.findElementById(id).getText();
			
			if(text.equals(actualtext)) {
				//System.out.println("The element with id "+id+" is holding the text "+actualtext+" is matched with expecte text "+ text);
				reportStep("The element with id "+id+" is holding the text "+actualtext+" is matched with expecte text "+ text, "Pass");
			}else
				//System.err.println("The element with id "+id+" is holding the text "+actualtext+" is not matched with expecte text "+ text);
				reportStep("The element with id "+id+" is holding the text "+actualtext+" is not matched with expecte text "+ text, "Fail");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not visible in the application");
			reportStep("The Element with id "+id+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not interactable in the application");
			reportStep("The Element with id "+id+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not Stable in the applicaiton");
			reportStep("The Element with id "+id+" is not Stable in the applicaiton", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not entered with data "+text+" due to uknown error");
			reportStep("The Element with id "+id+" is not entered with data "+text+" due to uknown error", "Fail");
		}
	
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

		
		try {
			String actualtext  = driver.findElementByXPath(xpath).getText();
			if(text.equals(actualtext))
			{
				//System.out.println("The Element with xpath "+xpath+ " is having the "+actualtext+ " is getting matched "+ text);
				reportStep("The Element with xpath "+xpath+ " is having the "+actualtext+ " is getting matched "+ text, "Pass");
			}else {
				//System.err.println("The Element with xpath "+xpath+ " is having the "+actualtext+ " is not getting matched "+ text);
				reportStep("The Element with xpath "+xpath+ " is having the "+actualtext+ " is not getting matched "+ text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpath+" is not found in the DOM");
			reportStep("The Element with xpath "+xpath+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpath+" is not visible in the application");
			reportStep("The Element with xpath "+xpath+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element witn xpath "+xpath+" is not Stable in the applicaiton");
			reportStep("The Element witn xpath "+xpath+" is not Stable in the applicaiton", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not entered with data "+text+" due to uknown error");
			reportStep("The element with xpath "+xpath+" is not entered with data "+text+" due to uknown error", "Fail");
		}
		

	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		WebElement textelement;
		try {
			 textelement= driver.findElementByXPath(xpath);
			String actualtext = textelement.getText();
			if(text.contains(actualtext))
			{
				//System.out.println("The Element with xpath "+xpath+ " is having the text "+actualtext+" is getting matched "+ text);
				reportStep("The Element with xpath "+xpath+ " is having the text "+actualtext+" is getting matched "+ text, "Pass");
			}else {
				//System.err.println("The Element with xpath "+xpath+ " is having the text "+actualtext+" is not getting matched "+ text);
				reportStep("The Element with xpath "+xpath+ " is having the text "+actualtext+" is not getting matched "+ text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpath+" is not found in the DOM");
			reportStep("The Element with xpath "+xpath+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpath+" is not visible in the application");
			reportStep("The Element with xpath "+xpath+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element witn xpath "+xpath+" is not Stable in the applicaiton");
			reportStep("The Element witn xpath "+xpath+" is not Stable in the applicaiton", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not entered with data "+text+" due to uknown error");
			reportStep("The element with xpath "+xpath+" is not entered with data "+text+" due to uknown error", "Fail");
		}

	}
	
	public String replaceString(String xpath, String option) {
		String replaceValue = null;
		if(xpath.contains("$option$")) {
			replaceValue= xpath.replace("$option$", option);
		} else {
			replaceValue=xpath;
		}
		
		return replaceValue;
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//
			System.out.println("The Element with id "+id+" is clicked");
			reportStep("The Element with id "+id+" is clicked", "Pass");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clickable in the application");
			reportStep("The element with id "+id+" is not clickable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not Stale in the applicaiton");
			reportStep("The Element with id "+id+" is not Stale in the applicaiton", "Fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application due to uknown error");
			reportStep("The element with id "+id+" is not interactable in the application due to uknown error", "Fail");
		}
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The Element with name" +classVal+" is clicked");
			reportStep("The Element with name" +classVal+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with name" +classVal+" is not found in the DOM");
			reportStep("The Element with name" +classVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+classVal+" is not visible in the application");
			reportStep("The element with name "+classVal+" is not visible in the application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+classVal+" is not clickable in the application");
			reportStep("The element with name "+classVal+" is not clickable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+classVal+" is not Stale in the application");
			reportStep("The element with name "+classVal+" is not Stale in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with name "+classVal+" is not interactable in the application due to uknown error");
			reportStep("The element with name "+classVal+" is not interactable in the application due to uknown error", "Fail");
		}
		
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			System.out.println("The Element with name "+name+" is clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element with name "+name+" is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not visible in the application");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not clickable in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not Stale in the application");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not interactable in the application due to uknown error");
		}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element with LinkText "+name+" is Clicked");
			reportStep("The Element with LinkText "+name+" is Clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with LinkText "+name+" is not found in the DOM");
			reportStep("The Element with LinkText "+name+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText  "+name+" is not visible in the application");
			reportStep("The element with LinkText  "+name+" is not visible in the application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not clickable in the application");
			reportStep("The element with LinkText "+name+" is not clickable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not Stale in the application");
			reportStep("The element with LinkText "+name+" is not Stale in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not interactable in the application due to uknown error");
			reportStep("The element with LinkText "+name+" is not interactable in the application due to uknown error", "Fail");
		} 
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element with link"+name+" is Clicked");
			reportStep("The Element with link"+name+" is Clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with linktext"+name+" is not found in the DOM");
			reportStep("The Element with linktext"+name+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not visible in the application");
			reportStep("The element with linktext "+name+" is not visible in the application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not clickable in the application");
			reportStep("The element with linktext "+name+" is not clickable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not Stale in the application");
			reportStep("The element with linktext "+name+" is not Stale in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not interactable in the application due to uknown error");
			reportStep("The element with linktext "+name+" is not interactable in the application due to uknown error", "Fail");
			
		} 
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element with xpath "+xpathVal+" is Clicked");
			reportStep("The Element with xpath "+xpathVal+" is Clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with xpath "+xpathVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the application");
			reportStep("The element with xpath "+xpathVal+" is not clickable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not Stale in the application");
			reportStep("The element with xpath "+xpathVal+" is not Stale in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application due to uknown error");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application due to uknown error", "Fail");
		}
		
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element with xpath "+xpathVal+" is Clicked");
			reportStep("The Element with xpath "+xpathVal+" is Clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with xpath "+xpathVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the application");
			reportStep("The element with xpath "+xpathVal+" is not clickable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not Stale in the application");
			reportStep("The element with xpath "+xpathVal+" is not Stale in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application due to uknown error");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application due to uknown error", "Fail");
		}
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String actualtext = null;
		try {
			actualtext = driver.findElementById(idVal).getText();
			System.out.println("The Element with ID "+idVal+" is having the text of "+actualtext+" is getting display");
			reportStep("The Element with ID "+idVal+" is having the text of "+actualtext+" is getting display", "Pass");
		} catch (NoSuchElementException e) {
			System.err.println("The Element with id "+idVal+" is not found in the DOM");
			reportStep("The Element with id "+idVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idVal+" is not visible in the application");
			reportStep("The element with id "+idVal+" is not visible in the application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idVal+" is not clickable in the application");
			reportStep("The element with id "+idVal+" is not clickable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idVal+" is not Stale in the application");
			reportStep("The element with id "+idVal+" is not Stale in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idVal+" is not interactable in the application due to uknown error");
			reportStep("The element with id "+idVal+" is not interactable in the application due to uknown error", "Fail");
		}
		return actualtext;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String actualtext = null;
		try {
			actualtext = driver.findElementByXPath(xpathVal).getText();
			
			//System.out.println("The Element with xpath "+xpathVal+" is having the text of "+actualtext+" is getting display");
			reportStep("The Element with xpath "+xpathVal+" is having the text of "+actualtext+" is getting display", "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with xpath "+xpathVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not Stale in the application");
			reportStep("The element with xpath "+xpathVal+" is not Stale in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application due to uknown error");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application due to uknown error", "Fail");
		}	
		
		return actualtext;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			Select select = new Select(driver.findElementById(id));
			select.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" is entered with data "+value);
			reportStep("The element with id "+id+" is entered with data "+value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+id+" is not visible in the application");
			reportStep("The Element with id "+id+" is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element witn id "+id+" is not interactable in the applicaiton");
			reportStep("The Element witn id "+id+" is not interactable in the applicaiton", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The Element witn id "+id+" is not Select in the applicaiton");
			reportStep("The Element witn id "+id+" is not Select in the applicaiton", "Fail");
		}catch(StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element witn id "+id+" is not Stable in the applicaiton");
			reportStep("The Element witn id "+id+" is not Stable in the applicaiton", "Fail");
		}catch(WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+id+" is not entered with data "+value+" due to uknown error");
			reportStep("The element with id "+id+" is not entered with data "+value+" due to uknown error", "Fail");
		}
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
		Select select = new Select(driver.findElementById(id));
		select.selectByIndex(value);
		//System.out.println("The element with id "+id+" is selected with data "+ value);
		reportStep("The element with id "+id+" is selected with data "+ value, "Pass");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Element with id "+id+" is not found in the DOM");
		reportStep("The Element with id "+id+" is not found in the DOM", "Fail");
	}catch (ElementNotVisibleException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Element with id "+id+" is not visible in the application");
		reportStep("The Element with id "+id+" is not visible in the application", "Fail");
	}
	catch(ElementNotInteractableException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Element witn id "+id+" is not interactable in the applicaiton");
		reportStep("The Element witn id "+id+" is not interactable in the applicaiton", "Fail");
	}catch (ElementNotSelectableException e) {
		// TODO: handle exception
		//System.err.println("The Element witn id "+id+" is not Select in the applicaiton");
		reportStep("The Element witn id "+id+" is not Select in the applicaiton", "Fail");
	}catch(StaleElementReferenceException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Element witn id "+id+" is not Stable in the applicaiton");
		reportStep("The Element witn id "+id+" is not Stable in the applicaiton", "Fail");
	}catch(WebDriverException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with id "+id+" is not entered with data "+value+" due to uknown error");
		reportStep("The element with id "+id+" is not entered with data "+value+" due to uknown error", "Fail");
	}
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
		Set<String> alltextid = driver.getWindowHandles();
		for(String eachID:alltextid) {
			driver.switchTo().window(eachID);
		break;
		}
		//sysout
		}catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The target window does not exist ");
			reportStep("The target window does not exist ", "Fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to switch Parent window due to unknown error");
			reportStep("Unable to switch Parent window due to unknown error", "Fail");
		}
		

		}
		

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> alltextid = driver.getWindowHandles();
			for(String eachID:alltextid) {
				driver.switchTo().window(eachID);
			}

			}catch (NoSuchWindowException e) {
				// TODO Auto-generated catch block
				//System.err.println("The target window does not exist ");
				reportStep("The target window does not exist ", "Fail");
				
			}catch (WebDriverException e) {
				// TODO: handle exception
				System.err.println("Unable to switch last window due to unknown error");
				reportStep("Unable to switch last window due to unknown error", "Fail");
			}
			

			}
	

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The user able to accept the Alert");
			reportStep("The user able to accept the Alert", "Pass");
		}catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The alreat screen is not getting display");
			reportStep("The alreat screen is not getting display", "Fail");
		} 
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to get the text Due to unknown Error");
			reportStep("Unable to get the text Due to unknown Error", "Fail");
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The user able to dismiss the Alert");
			reportStep("The user able to dismiss the Alert", "Pass");
		}catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The alreat screen is not getting display");
			reportStep("The alreat screen is not getting display", "Fail");
		} 
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to get the text Due to unknown Error");
			reportStep("Unable to get the text Due to unknown Error", "Fail");
		}
		}

	public String getAlertText() {
		// TODO Auto-generated method stub
		
		String poptext = null;
		try {
			Alert alert = driver.switchTo().alert();
			poptext = alert.getText();
			//System.out.println("The Alert pop string is getting display");
			reportStep("The Alert pop string is getting display", "Pass");
		}catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The Alert Message is not getting display");
			reportStep("The Alert Message is not getting display", "Fail");
		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to get the text Due to unknown Error");
			reportStep("Unable to get the text Due to unknown Error", "Fail");
		}
		return poptext;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number = 0;
		try {
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./reports/screenshots/"+number+".png");
			
			FileUtils.copyFile(tmp, dest);
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			
			reportStep("Unable to take screenshot due to unknown error", "Fail");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			reportStep("Unable to take screenshot due to input/output", "Fail");
		}
		
		return number;
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("Browser successfully Closed");
			reportStep("Browser successfully Closed", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to  Close the browser due to unknown Error");
			reportStep("Unable to  Close the browser due to unknown Error", "Fail");
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			reportStep("All browser Browser successfullyl Closed", "Pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			reportStep("Unable to  Close  all the browser due to unknown Error", "Fail" , false);
		}
		
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			reportStep("current thread has been interrupted", "Fail");
			
		}
	}

	public void selectValueByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElementByXPath(xpathVal);
			Select select = new Select(element);
			select.selectByValue(value);
			//System.out.println("The element with Xpath "+xpathVal+" is entered with data "+value);
			reportStep("The element with Xpath "+xpathVal+" is entered with data "+value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with Xpath "+xpathVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with Xpath "+xpathVal+" is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element witn Xpath "+xpathVal+" is not interactable in the applicaiton");
			reportStep("The Element witn Xpath "+xpathVal+" is not interactable in the applicaiton", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The Element witn Xpath "+xpathVal+" is not Select in the applicaiton");
			reportStep("The Element witn Xpath "+xpathVal+" is not Select in the applicaiton", "Fail");
		}catch(StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element witn Xpath "+xpathVal+" is not Stable in the applicaiton");
			reportStep("The Element witn Xpath "+xpathVal+" is not Stable in the applicaiton", "Fail");
		}catch(WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with Xpath "+xpathVal+" is not entered with data "+value+" due to uknown error");
			reportStep("The element with Xpath "+xpathVal+" is not entered with data "+value+" due to uknown error", "Fail");
		}
	
	}

	public void selectVisibleTextByXpath(String xpathVal, String value) {
		
		// TODO Auto-generated method stub
		
		try {
			Select select = new Select(driver.findElementByXPath(xpathVal));
			select.selectByVisibleText(value);
			//System.out.println("The element with Xpath "+xpathVal+" is entered with data "+value);
			reportStep("The element with Xpath "+xpathVal+" is entered with data "+value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with Xpath "+xpathVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with Xpath "+xpathVal+" is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element witn Xpath "+xpathVal+" is not interactable in the applicaiton");
			reportStep("The Element witn Xpath "+xpathVal+" is not interactable in the applicaiton", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The Element witn Xpath "+xpathVal+" is not Select in the applicaiton");
			reportStep("The Element witn Xpath "+xpathVal+" is not Select in the applicaiton", "Fail");
		}catch(StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element witn Xpath "+xpathVal+" is not Stable in the applicaiton");
			reportStep("The Element witn Xpath "+xpathVal+" is not Stable in the applicaiton", "Fail");
		}catch(WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+xpathVal+" is not entered with data "+value+" due to uknown error");
			reportStep("The element with Xpath "+xpathVal+" is not entered with data "+value+" due to uknown error", "Fail");
		}
	}
	public void pageDown(String xpath, String value) {
		// TODO Auto-generated method stub
		
		try {
			if(value.equalsIgnoreCase("TAB")) {
			driver.findElementByXPath(xpath).sendKeys(Keys.TAB);
			//System.out.println("Tab operation is performed successfully");
			reportStep("Tab operation is performed successfully", "Pass");
			}else if(value.equalsIgnoreCase("PAGE_DOWN")) {
				driver.findElementByXPath(xpath).sendKeys(Keys.PAGE_DOWN);
				//System.out.println("Page down operation is performed successfully");
				reportStep("Page down operation is performed successfully", "Pass");
			}else if(value.equalsIgnoreCase("PAGE_UP"))
				driver.findElementByXPath(xpath).sendKeys(Keys.PAGE_UP);
			//System.out.println("page up operation is performed successfully");
			reportStep("page up operation is performed successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the dom");
			reportStep("The element with xpath "+xpath+" is not found in the dom", "Fail");
		
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is clicked sue to unknown error");
			reportStep("The element with xpath "+xpath+" is clicked sue to unknown error", "Fail");
		}
		
	}

	public void mouseHover(String xpath) {
		// TODO Auto-generated method stub
		
		WebElement hover;
		try {
			hover = driver.findElementByXPath(xpath);
			Actions builder = new Actions(driver);
			builder.moveToElement(hover).perform();
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			reportStep("The element with xpath "+xpath+" is clicked sue to unknown error", "Fail");
		}
	}

	public void mousehoverhold(String xpath)
	{
		WebElement hover;
		
		hover=driver.findElementByXPath(xpath);
		Actions builder = new Actions(driver);
		builder.moveToElement(hover).clickAndHold().build().perform();
	}
	
	public void mousehoverclick(String xpath) {
		// TODO Auto-generated method stub
		
		try {
			WebElement hover = driver.findElementByXPath(xpath);
			
			Actions builder = new Actions(driver);
			
			builder.moveToElement(hover).build().perform();
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			reportStep("The element with xpath "+xpath+" is clicked due to unknown error", "Fail");
		}
		
	}
}

	

