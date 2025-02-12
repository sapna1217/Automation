import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverManager.firefoxdriver().create();


        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        driver.findElement(By.xpath("//input[@id='gh-ac']")).click();
        driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Iphone");



        Select selectCategory = new Select(driver.findElement(By.id("gh-cat")));
        selectCategory.selectByVisibleText("Cell Phones & Accessories");


        driver.findElement(By.cssSelector("#gh-search-btn")).click();
        Thread.sleep(2000);



    }
}
