package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.ForgetPasswordPage.ForgetPasswordPage;
import pages.LogOutPage.LogOutPage;
import pages.NewAddressPage.NewAddressPage;
import pages.OrderPage.OrderPage;
import pages.QuestionPage.QuestionPage;
import pages.RegisterPage.RegisterPage;
import pages.SalePage.SalePage;
import pages.SignInPage.SignInPage;

public class BaseTest {

    public RegisterPage registerPage = RegisterPage.getInstance();
    public SignInPage signInPage = SignInPage.getInstance();
    public NewAddressPage newAddressPage = NewAddressPage.getInstance();
    public LogOutPage logOutPage = LogOutPage.getInstance();
    public OrderPage orderPage = OrderPage.getInstance();
    public SalePage salePage = SalePage.getInstance();
    public QuestionPage questionPage = QuestionPage.getInstance();
    public ForgetPasswordPage forgetPasswordPage = ForgetPasswordPage.getInstance();

    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }

}
