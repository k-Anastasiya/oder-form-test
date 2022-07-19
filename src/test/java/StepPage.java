import org.openqa.selenium.WebDriver;

public class StepPage extends BasePage {


    public StepPage(WebDriver driver) {
        super(driver);
    }

    public void fillForm(String surname,String name){
        fillInputSurname(surname);
        fillInputName(name);
        selectMaleGender();
        clickButtonSubmit();
    }
}
