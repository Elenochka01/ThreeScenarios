import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebFormHappyPath {

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oea16\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.id("first-name"));
        firstName.sendKeys("Elena");

        Thread.sleep(2000);
        WebElement lastName= driver.findElement(By.id("last-name"));
        lastName.sendKeys("Odnodvortseva");

        Thread.sleep(2000);
        WebElement jobTitle= driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("AR accountant");

        Thread.sleep(2000);
        WebElement radioButton3= driver.findElement(By.id("radio-button-3"));
        radioButton3.click();

        WebElement button = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
        actions.moveToElement(button).perform();

        Thread.sleep(2000);
        WebElement checkBox2= driver.findElement(By.id("checkbox-2"));
        checkBox2.click();

        Thread.sleep(2000);
        WebElement dropDown= driver.findElement(By.id("select-menu"));
        dropDown.click();
        Thread.sleep(2000);
        WebElement tenOption = driver.findElement(By.xpath("/html/body/div/form/div/div[6]/select/option[5]"));
        tenOption.click();
        dropDown.click();

        Thread.sleep(2000);
        WebElement datePicker= driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("12/04/2024");

        Thread.sleep(2000);
        datePicker.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        button.click();

        System.out.println("Happy path test gone successfully");

        Thread.sleep(2000);
        driver.quit();

    }
}

