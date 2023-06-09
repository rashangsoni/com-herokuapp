package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {

    public static void main(String[] args) {
        // 1. Setup Chrome browser
        WebDriver driver = new ChromeDriver();
        // 2. Open URL
        String baseUrl = "http://the-internet.herokuapp.com/login";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        // 3. Print the title of the page
        System.out.println(title);
        // 4. Print the current url
        System.out.println("Current Url: " + driver.getCurrentUrl());
        // 5. Print the page source
        System.out.println("Page source:" + driver.getCurrentUrl());
        // 6. Enter the email to email field
        WebElement emailfield = driver.findElement(By.id("username"));
        emailfield.sendKeys("rashangs@yahoo.co.uk");
        // 7. Enter the password to password field
        WebElement passwordfield = driver.findElement(By.id("password"));
        passwordfield.sendKeys("JaisriRam123");
        // 8. Close the browser
         driver.close();

    }
}
