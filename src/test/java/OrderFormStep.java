import org.openqa.selenium.WebDriver;

public class OrderFormStep extends OrderFormObject {


    public OrderFormStep(WebDriver driver) {
        super(driver);
    }
    public void fillForm(String surname,String name){
        fillInputSurname(surname);
        fillInputName(name);
        selectMaleGender();
        clickButtonSubmit();

    }
}
