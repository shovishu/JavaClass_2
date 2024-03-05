import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_LoginPage {

    public static void main(String[] args) throws IOException {

        String TestFile = "./Test2.txt";
        FileReader FR = new FileReader(TestFile);
        BufferedReader BR2 = new BufferedReader(FR);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");


        driver.findElement(By.xpath("//html/body/nav/div[2]/div[2]/ul/li[2]/div/a/i[2]")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(BR2.readLine());
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(BR2.readLine());
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();


//        driver.findElement(By.xpath("//span[@class='caret']")).click();
//        driver.findElement(By.linkText("Logout")).click();

    }
}