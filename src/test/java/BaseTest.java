import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    BasePage orderFormObject;
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:/src/order-form/oder-form-test/order-form.html");
        orderFormObject = new BasePage(driver);

    }

    @After
    public void close()  {
        driver.quit();
    }


}