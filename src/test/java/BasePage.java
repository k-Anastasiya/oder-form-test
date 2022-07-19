import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {


    WebDriver driver;

    By inputSurnameLocator = By.xpath("//input[@surname]");
    By inputNameLocator = By.xpath("//input[@name]");
    By selectGeneder = By.xpath("//input[@value='m']");
    By SurnameLocator = By.xpath("//td[contains(text(),'Фамилия')]");
    By NameLocator = By.xpath("//td[contains(text(),'Имя')]");
    By genderLocator = By.xpath("//td[contains(text(),'Пол')]");
    By buttonSubmitLocator = By.xpath("//input[@value= 'Заказать']");
    By actualResultLocator = By.xpath("/html/body/pre");

    public String getActualResult(){
        return driver.findElement(actualResultLocator).getText();
    }
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public String verifySurname() {
        return driver.findElement(SurnameLocator).getText();
    }
    public String verifyLabelName() {
        return driver.findElement(NameLocator).getText();
    }
    public String verifybuttonSubmit() {
        return driver.findElement(buttonSubmitLocator).getAttribute("value");
    }
    public String verifyLabelGender() {
        return driver.findElement(genderLocator).getText();
    }


    public void fillInputSurname(String surname) {
        WebElement fillSurname = driver.findElement(inputSurnameLocator);
        fillSurname.sendKeys(surname);
    }

    public void fillInputName(String name) {
        WebElement fillSurname = driver.findElement(inputNameLocator);
        fillSurname.sendKeys(name);
    }

    public void selectMaleGender() {
        WebElement inputGender = driver.findElement(selectGeneder);
        inputGender.click();
    }

    public void clickButtonSubmit() {
        WebElement buttonSubmit = driver.findElement(buttonSubmitLocator);
        buttonSubmit.click();
    }





}
