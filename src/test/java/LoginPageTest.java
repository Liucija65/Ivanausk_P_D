import org.junit.jupiter.api.Test;

public class LoginPageTest extends BasePageTest{
    @Test
    void testAccountButtonforLogin(){
        LoginPage homePage = new LoginPage(driver);
        driver.get("");
        homePage.clickAccountButton();
        palaukti();
    }

    void palaukti() {
    }
}
