 
package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser {
  
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\MARS_FRAMEWORK\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://obemqa-ui.obem.cloud/#/"); // Using navigate().to() method
        driver.manage().window().maximize();
        
        driver.findElement(By.id("ifame"));
        driver.findElement(By.tagName("input")).click();
        driver.findElement(By.name("firstName")); //name="firstName"
        driver.findElement(By.className("Automation")) ; //class="ClasName"
        
        
        ///Css Selector 1. Tag and ID
        driver.findElement(By.cssSelector("Button#idofButton"));
        
        // Css Selector  tag and class      input class="Automation"
        driver.findElement(By.cssSelector("input.Automation"));
        
        //css Selector 
        driver.findElement(By.cssSelector("Tag[Attribute=value]")) ;
        //linked text
        
        driver.findElement(By.linkText("This is a Link")).click();  
        
        //partial linked text
        driver.findElement(By.partialLinkText("This is")).click(); 
      WebElement table=  driver.findElement(By.name("tableName"));
      List<WebElement> rows=table.findElements(By.id("tr"));
      
      for(WebElement row:rows){
    	  List<WebElement>cells=row.findElements(By.id("td"));
    	  
    	  for(WebElement cell:cells) {
    		  String a=cell.getText();
    	  }
    	  
      }
      
      JavascriptExecutor execute=(JavascriptExecutor)driver;
      // scroll page
      execute.executeScript("argument[0].scrollIntoView(true)", table);
      execute.executeScript("window.scrollBy(100,200)");
      //send text
      execute.executeScript("argument[0].value=argument[1]]", table,textToSend);
      
      //Click
      execute.executeScript("arguments[0].click()", table);
      
      //Get inner text of an element
      String innerText = (String) execute.executeScript("return arguments[0].innerText", table);
      
      // get url of the web page
     String url= (String) execute.executeScript("return window.location.href");
     
     
   //  how to handle xpath dynamically
     
     String dynamicPart = "dynamicValue";
     WebElement element = driver.findElement(By.xpath("//input[@id='" + dynamicPart + "']"));
     
     
  // Selecting the parent of a specific element
     WebElement parentElement = driver.findElement(By.xpath("//div[@class='parentClass']/.."));

     // Selecting a following sibling of a specific element
     WebElement siblingElement = driver.findElement(By.xpath("//div[@class='currentElement']/following-sibling::div"));
     
  // Using starts-with function
     WebElement elementa = driver.findElement(By.xpath("//input[starts-with(@id, 'dynamicPart_')]"));

     // Using contains function
     WebElement elemenb = driver.findElement(By.xpath("//input[contains(@id, 'staticPart_')]"));
     
     WebDriverWait wait = new WebDriverWait(driver, 10);
     WebElement dynamicElement = wait.until(ExpectedCondition.visibilityOfElementLocated(By.id("dynamicId")));
      driver.quit();
      
    //Declare and initialise a fluent wait
      FluentWait wait = new FluentWait(driver);
      //Specify the timout of the wait
      wait.withTimeout(5000, TimeUnit.MILLISECONDS);
      //Sepcify polling time
      wait.pollingEvery(250, TimeUnit.MILLISECONDS);
      //Specify what exceptions to ignore
      wait.ignoring(NoSuchElementException.class)

      //This is how we specify the condition to wait on.
      //This is what we will explore more in this chapter
      wait.until(ExpectedConditions.alertIsPresent());
        
    }
}

