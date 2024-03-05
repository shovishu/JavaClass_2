import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Automation_RegisterPage {

    public static WebDriver driver;
    public static void main(String args[]) throws IOException
    {
            String TestFile = "./Test.txt";
            FileReader FR = new FileReader(TestFile);
            BufferedReader BR = new BufferedReader(FR);

            String TestFile2 = "./Test2.txt";
            FileReader FR2 = new FileReader(TestFile2);
            BufferedReader BR2 = new BufferedReader(FR2);

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://demo.opencart.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//html/body/nav/div[2]/div[2]/ul/li[2]/div/a/i[2]")).click();
            driver.findElement(By.linkText("Register")).click();
            driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys(BR.readLine());
            //*[@id="input-firstname"]
            driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys(BR.readLine());
            driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(BR.readLine());
            driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(BR.readLine());

            List checkbox = driver.findElements(By.id("input-newsletter-yes"));

            int Size = checkbox.size();     // Finding the number of check boxes

            for(int i=0; i < Size; i++)          // Starts the loop from first check box to the last one
            {
                    String val = checkbox.get(i).toString();
// check box name stored to the string variable, using ‘Value' attribute

                    if (val.equalsIgnoreCase("input-newsletter-yes"))
// equalsIgnoreCase is ignore case (upper/ lower)
                    {
                            // Selecting the check box if its value is same as that we are looking for
                            checkbox.get(i);
                            break;
                    }
            }


    }
}
