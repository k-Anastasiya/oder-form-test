import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderFormSetting  {
    OrderFormObject orderFormObject;
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:/src/order-form/oder-form-test/order-form.html");
        orderFormObject = new OrderFormObject(driver);

    }

    @After
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


}