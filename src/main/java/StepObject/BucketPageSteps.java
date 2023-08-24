package StepObject;
import PageObject.BucketPage;
import io.qameta.allure.Step;
import org.testng.Assert;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;

public class BucketPageSteps extends BucketPage {
    @Step("კალათაში დამატება")
    public BucketPageSteps BucketAdd() {
        addBag.shouldBe(visible, Duration.ofMillis(15000)).click();
        return this;
    }

    @Step("კალათაზე გადასვლა")
    public BucketPageSteps Bucket1() {
        succsecAdd.shouldNotBe(visible,Duration.ofMillis(5000));
        bucket1.click();
        return this;
    }

    @Step("დამატებული პროდუქტის დასახელება")
    public BucketPageSteps ProductName() {
       productName.shouldBe(visible);
        return this;
    }

    @Step("დამატებული პროდუქტის ფერი")
    public BucketPageSteps ProductColor() {
        productColor.shouldBe(visible);
        return this;
    }

    @Step("დამატებული პროდუქტის კოდი")
    public BucketPageSteps ProductCode() {
        productCode.shouldBe(visible);
        return this;
    }

    @Step("დამატებული პროდუქტის რაოდენობა")
    public BucketPageSteps ProductValue() {
        productValue.shouldBe(visible);
        return this;
    }

    @Step("დამატებული პროდუქტის ფასი")
    public BucketPageSteps ProductPrice() {
        productPrice.shouldBe(visible);
        return this;
    }

    @Step("დამატებული პროდუქტის ჯამი ( \"სულ)")
    public BucketPageSteps ProductSum() {
        productSum.shouldBe(visible);
        return this;
    }
    @Step("გავზარდე რაოდენობა და შევადარე რომ ჯამი ტოლია რაოდენობა გამრავლებული ფასზე")
    public BucketPageSteps BucketCountPrice(){
        countAddBtn.click();
        String priceL = productPrice.getText().replaceAll("[^\\d.]", "");
        String countL = productValue.getValue();
        String summ = productSum.getText().replaceAll("[^\\d.]", "");
        float sum = Float.parseFloat(summ);
        int count = Integer.parseInt(countL);
        float price = Float.parseFloat(priceL);
        System.out.println(count);
        System.out.println(sum);
        System.out.println(price);
        Assert.assertTrue(count > 1);
        Assert.assertTrue(sum == (count * price), "ჯამი ტოლია რაოდენობა გამრავლებული ფასზე");
        return this;
    }
    @Step("შევამცირე რაოდენობა და შევადარე რომ ჯამი ტოლია რაოდენობა გამრავლებული ფასზე")
    public BucketPageSteps BucketCountPrice2(){
        countAddBtn.doubleClick().click();
        countMinusBtn.click();
        String priceL = productPrice.getText().replaceAll("[^\\d.]", "");
        String countL = productValue.getValue();
        String summ = productSum.getText().replaceAll("[^\\d.]", "");
        float sum = Float.parseFloat(summ);
        int count = Integer.parseInt(countL);
        float price = Float.parseFloat(priceL);
        System.out.println(count);
        System.out.println(sum);
        System.out.println(price);
        Assert.assertTrue(count > 1);
        Assert.assertTrue(sum == (count * price), "ჯამი ტოლია რაოდენობა გამრავლებული ფასზე");
        return this;
    }
    @Step("პროდუქტის წაშლა კალათიდან")
    public BucketPageSteps ClearX() {
       checkBox.click();
       clearXBtn.click();
        return this;
    }
    @Step("პროდუქტის დამატება კალათაში")
    public BucketPageSteps AddProduct() {
       addCard.click();
       addCard2.click();
       addCard3.click();
        return this;
    }
    @Step("პროდუქტის წაშლა კალათიდან")
    public BucketPageSteps AllClear() {
        allClear.click();
        return this;
    }

}
