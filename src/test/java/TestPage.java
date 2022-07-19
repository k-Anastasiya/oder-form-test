import org.junit.Assert;
import org.junit.Test;

public class TestPage extends BaseTest {

    String surname = "Ivanov";
    String name = "Peter";


    @Test
    public void verifyLabelContainSurnameTest() {
        Assert.assertEquals("Фамилия", orderFormObject.verifySurname());
    }

    @Test
    public void verifyLabelContainNameTest() {
        Assert.assertEquals("Имя", orderFormObject.verifyLabelName());
    }

    @Test
    public void verifyLabelContainGenderTest() {
        Assert.assertEquals("Пол", orderFormObject.verifyLabelGender());
    }

    @Test
    public void verifyLabelContainButtonSubmitTest() {
        Assert.assertEquals("Заказать", orderFormObject.verifybuttonSubmit());
    }

    @Test
    public void verifyFillingFormTest() {
        StepPage orderFormStep = new StepPage(driver);
        orderFormStep.fillForm(surname, name);
        Assert.assertEquals("Заказ Принят!",orderFormObject.getActualResult());

    }

}
