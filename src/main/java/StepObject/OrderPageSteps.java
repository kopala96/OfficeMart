package StepObject;
import PageObject.BucketPage;
import PageObject.OrderPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import java.time.Duration;
import static DataObject.OrderPageData.*;
import static com.codeborne.selenide.Condition.visible;

public class OrderPageSteps extends OrderPage {
    @Step("შეკვეთაზე გადასვლა")
    public OrderPageSteps ContinueBtn() {
        continueBtn.shouldBe(visible, Duration.ofMillis(15000)).click();
        return this;
    }

    @Step("გაგზავნა")
    public OrderPageSteps SendBtn() {
        sendBtn.click();
        return this;
    }

    @Step("ველი წითელია")
    public OrderPageSteps CompanyNameRed() {
        String borderColor = companyName.getCssValue("border");
        System.out.println(borderColor);
        return this;
    }

    @Step("ველი წითელია")
    public OrderPageSteps CompanyNameRed1() {
        String borderColor = identityCoden.getCssValue("border");
        System.out.println(borderColor);
        return this;
    }

    @Step("კომპანიის სახელის ველის შევსება")
    public OrderPageSteps CompanyName(String companyN) {
        companyName.setValue(companyN);
        return this;
    }

    @Step("საიდენტიფიკაციო ველის შევსება 11 ზე ნაკლები რიცხვით")
    public OrderPageSteps Identity(String identityCode) {
        identityCodee.setValue(identityCode);
        return this;
    }

    @Step("საიდენტიფიკაციო ველის შევსება")
    public OrderPageSteps Identity1(String identityCode) {
        identityCodee.setValue(identityCode);
        Assert.assertEquals(identityCodee.setValue(identityCode).getValue(), identityCode9, "უნდა გამოიტანოს რა ჩაიწერა");
        return this;
    }

    @Step("საიდენტიფიკაციო ველის შევსება")
    public OrderPageSteps Identity2(String identityCode9) {
        identityCodee.setValue(identityCode9);
        return this;
    }

    @Step("ფაქტიური მისამართი ველის შევსება")
    public OrderPageSteps Address(String companyN) {
        address.setValue(companyN);
        return this;
    }

    @Step(" საკონტაქტო ნომერის ველის შევსება , ტექსტური მონაცემის შეყვანა ")
    public OrderPageSteps PhoneNumb(String companyN) {
        phoneNumber.setValue(companyN);
        return this;
    }

    @Step("საკონტაქტო ნომერის ველის შევსება")
    public OrderPageSteps PhoneNumb1(String identityCode12) {
        phoneNumber.setValue(identityCode12);
        Assert.assertEquals(phoneNumber.setValue(identityCode12).getValue(), identityCode9, "უნდა გამოიტანოს რა ჩაიწერა");
        return this;
    }
    @Step("საკონტაქტო ნომერის ველის შევსება")
    public OrderPageSteps PhoneNumb3(String identityCode9) {
        phoneNumber.setValue(identityCode9);
        return this;
    }
    @Step("საკონტაქტო ნომერის ველის შევსება")
    public OrderPageSteps PhoneNumb2() {
        String PhoneValue = phoneNumber.getCssValue("border-color");
        System.out.println(PhoneValue);
        String hex = Color.fromString(PhoneValue).asHex();
        System.out.println(hex);
        return this;
    }

    @Step("საკონტაქტო ნომერის ველის შევსება")
    public OrderPageSteps ReceiveOrder(String identityCode) {
        reciveOrder.setValue(identityCode);
        return this;
    }
    @Step("იმეილი ველის შევსება")
    public OrderPageSteps EmailInput(String incorrectEmail) {
        emailInput.setValue(incorrectEmail);
        return this;
    }
    @Step("იმეილი ველის შევსება")
    public OrderPageSteps EmailInput3(String email) {
        emailInput.setValue(email);
        return this;
    }
    @Step("იმეილი ველის შევსება")
    public OrderPageSteps EmailInput1(String incorrectEmail1) {
        emailInput.setValue(incorrectEmail1);
        return this;
    }
    @Step("იმეილი ველის შევსება")
    public OrderPageSteps EmailInput2(String incorrectEmail2) {
        emailInput.setValue(incorrectEmail2);
        return this;
    }
}