package Fianlass;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationDriver {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		exerciseOne(driver);
		System.out.println("exerciseOne");
		
		exerciseTwo(driver);
		System.out.println("exerciseTwo");
		
		exerciseThree(driver);
		System.out.println("exerciseThree");
		
		exerciseFour(driver);
		System.out.println("exerciseFour");
		
		exerciseFourPointOne(driver);
		System.out.println("exerciseFourPointOne");
		
		exerciseFourPointTwo(driver);
		System.out.println("exerciseFourPointTwo");
		
		exericseFive(driver);
		System.out.println("exerciseFive");
		
		exerciseSix(driver);
		System.out.println("exerciseSix");
		
		exerciseSeven(driver);
		System.out.println("exerciseSeven");
		
		exerciseEight(driver);
		System.out.println("exerciseEight");
		
		exerciseNine(driver);
		System.out.println("exerciseNine");
		
	
	}
	public static void exerciseOne(WebDriver driver) 
	{
		
		driver.findElement(By.xpath("//input[@ value ='radio1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@ value ='radio1']")).isSelected());
		driver.findElement(By.xpath("//input[@ value ='radio2']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@ value ='radio2']")).isSelected());
		driver.findElement(By.xpath("//input[@ value ='radio3']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@ value ='radio3']")).isSelected());
	}
	
	public static void exerciseTwo(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("United States");
		Thread.sleep(2000);
		List<WebElement> eles = driver.findElements(By.xpath("(//ul/li[@class='ui-menu-item'])[2]"));
		for(WebElement ele:eles) {
			if(ele.getText().equalsIgnoreCase("United States Minor Outlying Island")) {
				
				ele.click();
				break;
			}
		}
	if(driver.findElement(By.id("autocomplete")).getAttribute("value").equalsIgnoreCase("United States Minor Outlying Island"));
		System.out.println("appropriate value is selected");
	}
		
	
	public static void exerciseThree(WebDriver driver)
	{
		driver.get("http://www.qaclickacademy.com/practice.php");
		//Selecting the dropdown tag/field
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		//check Option1 by giving index1
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		String first = dropdown.getFirstSelectedOption().getText();
		if(first.equalsIgnoreCase("Option1"))
		{
			System.out.println("confirmed");
			
		
	    }
		//check option2 by giving index2
		Select dropdown1 = new Select(staticDropdown);
		dropdown.selectByIndex(2);
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		String second = dropdown1.getFirstSelectedOption().getText();
		if(second.equalsIgnoreCase("Option2"))
		{
			System.out.println("confirmed");
		
	    }
		//check for option3 by giving index3
		Select dropdown11 = new Select(staticDropdown);
		dropdown11.selectByIndex(3);
		System.out.println(dropdown11.getFirstSelectedOption().getText());
		String third = dropdown11.getFirstSelectedOption().getText();
		if(third.equalsIgnoreCase("Option3"))
		{
			System.out.println("confirmed");
		
	    }
	}
	public static void exerciseFour(WebDriver driver) 
	{
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption1")).click();
		boolean verify=driver.findElement(By.id("checkBoxOption1")).isSelected();
		if(verify==true) 
		{
			System.out.println("Verified");
		}
		driver.findElement(By.id("checkBoxOption1")).click();
		boolean verify1 = driver.findElement(By.id("checkBoxOption1")).isSelected();
		if(verify1==false) 
		{
			System.out.println("Uncheked");	
		}
		driver.findElement(By.id("checkBoxOption2")).click();
		boolean verify2=driver.findElement(By.id("checkBoxOption2")).isSelected();
		if(verify2==true) 
		{
			System.out.println("Verified");
		}
		driver.findElement(By.id("checkBoxOption2")).click();
		boolean verify21 = driver.findElement(By.id("checkBoxOption2")).isSelected();
		if(verify21==false) 
		{
			System.out.println("Uncheked");	
		}
		driver.findElement(By.id("checkBoxOption3")).click();
		boolean verify3=driver.findElement(By.id("checkBoxOption3")).isSelected();
		if(verify3==true) 
		{
			System.out.println("Verified");
		}
		driver.findElement(By.id("checkBoxOption3")).click();
		boolean verify31 = driver.findElement(By.id("checkBoxOption3")).isSelected();
		if(verify31==false) 
		{
			System.out.println("Uncheked");	
		}	
}
	public static void exerciseFourPointOne(WebDriver driver) {
		driver.findElement(By.id("checkBoxOption1")).click();
		boolean checkBoxOption1 =driver.findElement(By.id("checkBoxOption1")).isSelected();
		
		driver.findElement(By.id("checkBoxOption2")).click();
		boolean checkBoxOption2=driver.findElement(By.id("checkBoxOption2")).isSelected();
		
		driver.findElement(By.id("checkBoxOption3")).click();
		boolean checkBoxOption3=driver.findElement(By.id("checkBoxOption3")).isSelected();
		
		if(checkBoxOption1 && checkBoxOption2 && checkBoxOption3) {
			System.out.println("All Checkboxes are selected");
		}
	}
	
	public static void exerciseFourPointTwo(WebDriver driver) {
		driver.findElement(By.id("checkBoxOption1")).click();
		boolean checkBoxOption1 =driver.findElement(By.id("checkBoxOption1")).isSelected();
		
		driver.findElement(By.id("checkBoxOption2")).click();
		boolean checkBoxOption2=driver.findElement(By.id("checkBoxOption2")).isSelected();
		
		driver.findElement(By.id("checkBoxOption3")).click();
		boolean checkBoxOption3=driver.findElement(By.id("checkBoxOption3")).isSelected();
		
		if(checkBoxOption1 && checkBoxOption2 && checkBoxOption3) {
			System.out.println("All Checkboxes are not selected");
		}
	}

	public static void exericseFive(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("openwindow")).click();
		Set<String> Windows = driver.getWindowHandles();
		Iterator<String> it = Windows.iterator();
		String ParentWindow=it.next();
		String ChildWindow=it.next();
		driver.switchTo().window(ChildWindow);
		String ChildTitle=driver.getTitle();
		System.out.println(ChildTitle);
		if(ChildTitle.equals("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training")) {
			System.out.println("Child Window title is verified");
			
		}
		driver.close();
		driver.switchTo().window(ParentWindow);
		String ParentTitle = driver.getTitle();
		System.out.println(ParentTitle);
		if(ParentTitle.equals("Parent Page")) {
			System.out.println("Parent Window title is verified");
		}
}
	public static void exerciseSix(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("opentab")).click();
		Set<String> Windows1=driver.getWindowHandles();
		Iterator<String> it1=Windows1.iterator();
		String ParentTab=it1.next();
		String ChildTab=it1.next();
		driver.switchTo().window(ChildTab);
		String ChildTitle=driver.getTitle();
		System.out.println(ChildTitle);
		if(ChildTitle.endsWith("Rahul Shetty Academy"))
		{
			System.out.println("Child Tab title is verified");
		}
		driver.close();
		driver.switchTo().window(ParentTab);
		String ParentTitle=driver.getTitle();
		System.out.println(ParentTitle);
		if(ParentTitle.equals("Practice Page")) {
			System.out.println("Parent Tab title is verified");
		}
		
		
	}
	public static void exerciseSeven(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Arpita");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		String name=driver.switchTo().alert().getText();
		if(name.equalsIgnoreCase("Hello Arpita, share this practice page and share your knowledge")) {
			System.out.println("Confirmed");
		}
		driver.switchTo().alert().accept();
	}
	public static void exerciseEight(WebDriver driver) {
		//scroll the table
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600);");
		WebElement table = driver.findElement(By.id("product"));
		List<WebElement> we = table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th"));
		System.out.println(we.get(0).getText());
		System.out.println(we.get(1).getText());
		System.out.println(we.get(2).getText());
		List<WebElement> re = table.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td"));
		System.out.println(re.get(0).getText());
		System.out.println(re.get(1).getText());
		System.out.println(re.get(2).getText());
		List<WebElement> fe = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(fe.get(0).getText());
		System.out.println(fe.get(1).getText());
		System.out.println(fe.get(2).getText());
		List<WebElement> nr = table.findElements(By.tagName("tr")).get(3).findElements(By.tagName("td"));
		System.out.println(nr.get(0).getText());
		System.out.println(nr.get(1).getText());
		System.out.println(nr.get(2).getText());
		List<WebElement> wr = table.findElements(By.tagName("tr")).get(4).findElements(By.tagName("td"));
		System.out.println(wr.get(0).getText());
		System.out.println(wr.get(1).getText());
		System.out.println(wr.get(2).getText());
		List<WebElement> tew = table.findElements(By.tagName("tr")).get(5).findElements(By.tagName("td"));
		System.out.println(tew.get(0).getText());
		System.out.println(tew.get(1).getText());
		System.out.println(tew.get(2).getText());
		List<WebElement> utr = table.findElements(By.tagName("tr")).get(6).findElements(By.tagName("td"));
		System.out.println(utr.get(0).getText());
		System.out.println(utr.get(1).getText());
		System.out.println(utr.get(2).getText());
		List<WebElement> nmt = table.findElements(By.tagName("tr")).get(9).findElements(By.tagName("td"));
		System.out.println(nmt.get(0).getText());
		System.out.println(nmt.get(1).getText());
		System.out.println(nmt.get(2).getText());
		List<WebElement> tyu = table.findElements(By.tagName("tr")).get(10).findElements(By.tagName("td"));
		System.out.println(tyu.get(0).getText());
		System.out.println(tyu.get(1).getText());
		System.out.println(tyu.get(2).getText());
	}
	
	public static void exerciseNine(WebDriver driver) throws InterruptedException
	{
		
		//mouse
		Actions aaa=new Actions(driver);
		WebElement em=driver.findElement(By.id("mousehover"));
		aaa.moveToElement(em).build().perform();
		aaa.click().build().perform();
		WebElement em1=driver.findElement(By.linkText("Top"));
		aaa.moveToElement(em1);
		aaa.click().build().perform();		
	}
}