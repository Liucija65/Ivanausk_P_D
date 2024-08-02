import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BasePageTest{
    @Test
    @Order(1)
    public void clickCreateAccountbutton(){
        HomePage homePage = new HomePage(driver);
        homePage.clickAccountButton();
    }
}
