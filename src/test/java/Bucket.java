import StepObject.BucketPageSteps;
import StepObject.SearchPageSteps;
import Utills.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.SearchPageData.product;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Bucket extends ChromeRunner {
    BucketPageSteps bucketPageSteps = new BucketPageSteps();
    SearchPageSteps searchPageSteps = new SearchPageSteps();

    @Test
    @Description("4)კონკრეტული პროდუქტის კალათაში დამატების ღილაკზე დაჭერით")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());

    }

    @Test
    @Description("5)პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს, დასახელება")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck1() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.Bucket1();
        Assert.assertTrue(bucketPageSteps.productName.is(Condition.visible));

    }

    @Test
    @Description("6)პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს, ფერი")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck2() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.Bucket1();
        Assert.assertTrue(bucketPageSteps.productColor.is(Condition.visible));

    }

    @Test
    @Description("7)პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს,კოდი")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck3() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.Bucket1();
        Assert.assertTrue(bucketPageSteps.productCode.is(Condition.visible));
    }

    @Test
    @Description("8)პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს,რაოდენობა")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck4() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.Bucket1();
        Assert.assertTrue(bucketPageSteps.productValue.is(Condition.visible));

    }

    @Test
    @Description("9)პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს, ფასი")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck5() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.Bucket1();
        Assert.assertTrue(bucketPageSteps.productPrice.isDisplayed());

    }

    @Test
    @Description("10)პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს, ჯამი")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck6() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.Bucket1();
        Assert.assertTrue(bucketPageSteps.productSum.is(Condition.visible));
    }

    @Test
    @Description("11)თუ გავზრდით კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა გაიზარდოს თითოეული ველის \"სულ\" მნიშვნელობა")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck7() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.Bucket1();
        Assert.assertTrue(bucketPageSteps.productSum.is(Condition.visible));
        bucketPageSteps.BucketCountPrice();

    }

    @Test
    @Description("12)თუ შევამცირებთ კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა შემცირდეს თითოეული ველის \"სულ\" მნიშვნელობა")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck8() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.Bucket1();
        Assert.assertTrue(bucketPageSteps.productSum.is(Condition.visible));
        bucketPageSteps
                .BucketCountPrice2();

    }

    @Test
    @Description("13)შესაძლებელი უნდა იყოს კალათაში არსებული კონკრეტული პროდუქტის წაშლა, \"X\" ღილაკზე დაჭერით")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck9() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.Bucket1();
        Assert.assertTrue(bucketPageSteps.productSum.is(Condition.visible));
        bucketPageSteps.ClearX();


    }
    @Test
    @Description("14)თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck10() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.AddProduct()
                 .Bucket1()
                .AllClear();
        Assert.assertFalse(bucketPageSteps.productPrice.is(Condition.visible));


    }
    @Test
    @Description("15)თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება, გამოდის ტექსტი კალათა ცარიელია")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck11() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.AddProduct()
                .Bucket1()
                .AllClear();
        Assert.assertTrue(bucketPageSteps.emptyBucket.is(Condition.visible));


    }
    @Test
    @Description("16)თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება, უნდა გაქრეს ღილაკი \"გაგრძელება")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck12() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.AddProduct()
                .Bucket1()
                .AllClear();
        Assert.assertFalse(bucketPageSteps.continueBtn.is(Condition.visible));

    }
    @Test
    @Description("17)თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება, უნდა გაქრეს ღილაკი \"კალათის გასუფთავება\"")
    @Severity(SeverityLevel.NORMAL)
    public void BucketCheck13() {
        searchPageSteps.SearchBtn()
                .SearchInp(product);
        bucketPageSteps.BucketAdd();
        Assert.assertTrue(bucketPageSteps.succsecAdd.isEnabled());
        bucketPageSteps.AddProduct()
                .Bucket1()
                .AllClear();
        Assert.assertFalse(bucketPageSteps.allClear.is(Condition.visible));

    }


}