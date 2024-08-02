import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class RegistrationPageTest extends BasePageTest{
    RegistrationPage registrationPage;
    HomePage homePage;

    @Test
    @Order(2)
    void fillSuccessfulRegisterForm(){
        registrationPage = new RegistrationPage(RegistrationPage(driver);
        driver.get("");
    }
}
