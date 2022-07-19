import org.junit.Assert;
import org.junit.Test;

public class TestPage extends BaseTest {

    String surname = "Ivanov";
    String name = "Peter";


    @Test
    public void verifyLabelContainSurnameTest() {
        Assert.assertEquals("Фамилия", orderFormObject.getValueFieldOfSurname());
    }

    @Test
    public void verifyLabelContainNameTest() {
        Assert.assertEquals("Имя", orderFormObject.getValueFieldOfName());
    }

    @Test
    public void verifyLabelContainGenderTest() {
        Assert.assertEquals("Пол", orderFormObject.getValueOfLabelGender());
    }

    @Test
    public void verifyLabelContainButtonSubmitTest() {
        Assert.assertEquals("Заказать", orderFormObject.getValueOfButtonSubmit());
    }

    @Test
    public void verifyFillingFormTest() {
        StepPage orderFormStep = new StepPage(driver);
        orderFormStep.fillForm(surname, name);
        Assert.assertEquals("Заказ Принят!",orderFormObject.getActualResult());

    }

}
