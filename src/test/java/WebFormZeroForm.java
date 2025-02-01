import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebFormZeroForm {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oea16\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();


        WebElement button = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
        Thread.sleep(3000);
        Actions actions=new Actions(driver);
        actions.moveToElement(button).perform();
        Thread.sleep(3000);
        button.click();

        System.out.println("End of Zero Form test");

        Thread.sleep(3000);
        driver.quit();

    }
}
