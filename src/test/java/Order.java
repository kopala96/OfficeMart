import StepObject.BucketPageSteps;
import StepObject.SearchPageSteps;
import StepObject.OrderPageSteps;
import Utills.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.OrderPageData.*;
import static DataObject.SearchPageData.product;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Order extends ChromeRunner {
    BucketPageSteps bucketPageSteps = new BucketPageSteps();
    SearchPageSteps searchPageSteps = new SearchPageSteps();
    OrderPageSteps orderPageSteps = new OrderPageSteps();

    @Test
    @Description("18)თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება, უნდა გამოვიდეს ორი ფორმა \"იურიდიული პირები\" და \"ფიზიკური პირები\"")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegative() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.AddProduct()
                .Bucket1();
        orderPageSteps.ContinueBtn();
        Assert.assertTrue(orderPageSteps.legalPerson.isEnabled());
        Assert.assertTrue(orderPageSteps.physicalPerson.isDisplayed());
    }

    @Test
    @Description("19)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში,უნდა გაწითლდეს ველი \"კომპანიის სახელწოდება\"")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegativeCheck() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .CompanyNameRed();
        Assert.assertTrue(orderPageSteps.borderColor.is(Condition.visible));

    }

    @Test
    @Description("20)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში,უნდა გაწითლდეს ველი \"საიდენტიფიკაციო კოდი\"")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegativeCheck1() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .CompanyNameRed();
        Assert.assertTrue(orderPageSteps.borderColor1.is(Condition.visible));

    }

    @Test
    @Description("21)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში,უნდა გაწითლდეს ველი \"ფაქტიური მისამართი\"")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegativeCheck2() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .CompanyNameRed();
        Assert.assertTrue(orderPageSteps.borderColor2.is(Condition.visible));

    }

    @Test
    @Description("22)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში,უნდა გაწითლდეს ველი \"საკონტაქტო ნომერი\"")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegativeCheck3() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .CompanyNameRed();
        Assert.assertTrue(orderPageSteps.borderColor3.is(Condition.visible));

    }

    @Test
    @Description("23)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში,უნდა გაწითლდეს ველი \"როდის გსურთ შეკვეთის მიღება\"")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegativeCheck4() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .CompanyNameRed();
        Assert.assertTrue(orderPageSteps.borderColor4.is(Condition.visible));

    }

    @Test
    @Description("24)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში,უნდა გაწითლდეს ველი \"ელ.ფოსტა\"")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegativeCheck5() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .CompanyNameRed();
        Assert.assertTrue(orderPageSteps.borderColor5.is(Condition.visible));


    }

    @Test
    @Description("25)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"კომპანიის სახელწოდება\" წითლდება . თუ ველში ჩავწერთ ნებისმიერ მნიშვნელობას და კვლავ დავაკლიკებთ გაგზავნა ღილაკს")
    @Severity(SeverityLevel.NORMAL)
    public void OrderPositiveCheck() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn();
        Assert.assertTrue(orderPageSteps.borderColor.is(Condition.visible));
        orderPageSteps.CompanyName(companyN)
                .SendBtn();
        Assert.assertTrue(orderPageSteps.borderColorNotRed.is(Condition.visible));

    }

    @Test
    @Description("26)იურიდიული პირის ფორმაზე ველში \"საიდენტიფიკაციო კოდი\" ტექსტური ტიპის მონაცემის შეყვანისას")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegativeCheck6() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .Identity(companyN)
                .SendBtn();
        Assert.assertTrue(orderPageSteps.companyName.is(Condition.empty));
    }

    @Test
    @Description("27)იურიდიული პირის ფორმაზე ველში \"საიდენტიფიკაციო კოდი\" ტექსტური ტიპის მონაცემის შეყვანისას")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegativeCheck7() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .Identity(identityCode)
                .SendBtn();
        Assert.assertTrue(orderPageSteps.borderColor1.is(Condition.visible));
    }

    @Test
    @Description("28)იურიდიული პირის ფორმაზე ველში \"საიდენტიფიკაციო კოდი\" თუ შევიყვანთ მაგ 12 სიმბოლს")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegativeCheck8() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .Identity1(identityCode12)
                .SendBtn();

    }

    @Test
    @Description("29)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"საიდენტიფიკაციო კოდი\"  წითლდება . თუ ველში ჩავწერთ რიცხვით მნიშვნელობას(დასაშვებია მხოლოდ 11 სიმბოლო) და კვლავ დავაკლიკებთ გაგზავნა ღილაკს")
    @Severity(SeverityLevel.NORMAL)
    public void OrderPositiveCheck4() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .Identity2(identityCode9)
                .SendBtn();
        Assert.assertTrue(orderPageSteps.borderColorNotRed.is(Condition.visible));
    }

    @Test
    @Description("30)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ფაქტიური მისამართი\" წითლდება . თუ ველში ჩავწერთ ნებისმიერ მნიშვნელობას და კვლავ დავაკლიკებთ გაგზავნა ღილაკს")
    @Severity(SeverityLevel.NORMAL)
    public void OrderPositiveCheck5() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .Address(companyN)
                .SendBtn();
        Assert.assertTrue(orderPageSteps.borderColorNotRed.is(Condition.visible));
    }

    @Test
    @Description("31)იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" ტექტსური ტიპის მონაცემის შეყვანისას,არ უნდა ჩაიწეროს ველში მნიშვნელობა")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegativeCheck9() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .PhoneNumb(companyN);
        Assert.assertTrue(orderPageSteps.phoneNumber.is(Condition.empty));
    }

    @Test
    @Description("32)იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" თუ შევიყვანთ 9 სიმბოლოზეზე ნაკლებ რიცხვით მნიშნელობას და დავაჭერთ გაგზავნა ღილაკს")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegativeCheck10() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .PhoneNumb(identityCode)
                .SendBtn();
        Assert.assertTrue(orderPageSteps.borderColor3.is(Condition.visible));
    }

    @Test
    @Description("33)იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" თუ შევიყვანთ მაგ 12 სიმბოლს, უნდა ჩაიწეროს მაინც 9 სიმბოლო")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegativeCheck11() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .PhoneNumb1(identityCode12);
    }

    @Test
    @Description("34)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"საკონტაქტო ნომერი\" წითლდება თუ ველში ჩავწერთ 9 სიმბოლოიან რიცხვით მნიშვნელობას და კვლავ დავაჭერთ გაგზავნა ღილაკს")
    @Severity(SeverityLevel.NORMAL)
    public void OrderPositiveCheck6() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .PhoneNumb3(identityCode9)
                .SendBtn();
        Assert.assertTrue(orderPageSteps.borderColorNotRed.is(Condition.visible));


    }

    @Test
    @Description("35)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"როდის გსურთ შეკვეთის მიღება?\" წითლდება თუ ჩავწერთ ნებისმიერ მნიშვნელობას რომელიც 5 სიმბოლოზე ნაკლებია")
    @Severity(SeverityLevel.NORMAL)
    public void OrderNegativeCheck13() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .ReceiveOrder(identityCode);
        Assert.assertTrue(orderPageSteps.borderColor4.is(Condition.visible));


    }

    @Test
    @Description("36)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"როდის გსურთ შეკვეთის მიღება?\" წითლდება თუ ჩავწერთ ნებისმიერ მნიშვნელობას რომელიც 5 სიმბოლოზე ნაკლებია")
    @Severity(SeverityLevel.NORMAL)
    public void OrderPositiveCheck7() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .ReceiveOrder(identityCode9)
                .SendBtn();
        Assert.assertTrue(orderPageSteps.borderColorNotRed.is(Condition.visible));


    }
    @Test
    @Description("37)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დასაშვებ ფორმატში მნიშვნელობას test@gmail.com მაგალითად ")
    @Severity(SeverityLevel.NORMAL)
    public void OrderPositiveCheck8() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .EmailInput3(email)
                .SendBtn();
        Assert.assertTrue(orderPageSteps.borderColorNotRed.is(Condition.visible));

    }
    @Test
    @Description("38)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test.gmail.com ")
    @Severity(SeverityLevel.NORMAL)
    public void OrderPositiveCheck9() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .EmailInput(incorrectEmail)
                .SendBtn();
        Assert.assertTrue(orderPageSteps.borderColor5.is(Condition.visible));

    }
    @Test
    @Description("39)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test@gmail")
    @Severity(SeverityLevel.NORMAL)
    public void OrderPositiveCheck10() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .EmailInput1(IncorrectEmail1)
                .SendBtn();
        Assert.assertTrue(orderPageSteps.borderColor5.is(Condition.visible));
    }
    @Test
    @Description("40)იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test.gmail@")
    @Severity(SeverityLevel.NORMAL)
    public void OrderPositiveCheck11() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps
                .Bucket1();
        orderPageSteps.ContinueBtn()
                .SendBtn()
                .EmailInput2(IncorrectEmail2)
                .SendBtn();
        Assert.assertTrue(orderPageSteps.borderColor5.is(Condition.visible));
    }

}
