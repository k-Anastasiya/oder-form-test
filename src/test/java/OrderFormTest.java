import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderFormTest extends OrderFormSetting {

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
        OrderFormStep orderFormStep = new OrderFormStep(driver);
        orderFormStep.fillForm(surname, name);
        Assert.assertEquals("Заказ Принят!",orderFormObject.getResult());

    }

}
