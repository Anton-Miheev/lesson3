package lesson3.mail;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class OpenMail {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

       loginToMail();

        driver.findElement(By.xpath("//span[text()='Написать письмо']")).click();

        driver.findElement(By.xpath("//div[@class='inputContainer']")).sendKeys("loginus@internet.ru");

        driver.findElement(By.xpath("//div[@class='editable-zqmn cke_editable cke_editable_inline cke_contents_true cke_show_borders']")).sendKeys("доадфаофжао");
        driver.findElement(By.xpath("//span[@class='button2 button2_base button2_primary button2_hover-support js-shortcut']")).click();

        Thread.sleep(5000);
    }

    public static void loginToMail() {
        driver.get("https://mail.ru/");
        driver.findElement(By.xpath("//*[@id=\"mailbox\"]/form[1]/div[1]/div[2]/input")).sendKeys("loginus@internet.ru");
        driver.findElement(By.xpath("//*[@id=\"mailbox\"]/form[1]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"mailbox\"]/form[1]/div[2]/input")).sendKeys("IjQmw93TNp");
        driver.findElement(By.xpath("//*[@id=\"mailbox\"]/form[1]/button[2]")).click();
        }
}

