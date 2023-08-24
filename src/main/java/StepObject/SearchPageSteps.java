package StepObject;
import DataObject.SearchPageData;
import PageObject.SearchPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import java.time.Duration;
import static DataObject.SearchPageData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class SearchPageSteps extends SearchPage {

    @Step(" საძიებო ღილაკზე დაკლიკება")
    public SearchPageSteps SearchBtn() {
//        modall.doubleClick();
        searchBtn.click();
        searchBtn.shouldBe(visible);
        return this;
    }

    @Step(" საძიებო ღილაკზე დაკლიკება")
    public SearchPageSteps Search() {
        search.shouldBe(visible);
        return this;
    }

    @Step(" საძიებო ველში პროდუქტის მოძებნა")
    public SearchPageSteps SearchInp(String product) {
        searchInput.click();
        searchInput.setValue(product);
        search.click();
        firstname.shouldBe(visible, Duration.ofMillis(15000));
        return this;
    }
    @Step(" საძიებო ველში პროდუქტის მოძებნა")
    public SearchPageSteps SearchInp1(String product) {
        searchInput.click();
        searchInput.setValue(product);
        search.click();
        return this;
    }

    @Step("დაბრუნებული მონაცემების სახელებში უნდა იყოს ძებნისას გადაცემული სიტყვა")
    public SearchPageSteps Products() {
        int ProductCount = productCount.size();
        System.out.println(ProductCount);
        String productName = firstname.getText();
        String FirstName = productName;
        System.out.println(FirstName);
        for (int i = 1; i < ProductCount; i++) {
            String secondName = $(".prod_title",i).$(withText("კალამი ბურთულიანი")).getText();
            String SecondName = secondName;
            System.out.println(SecondName);
            Assert.assertTrue(secondName.contains(product));
        }
        return this;
    }

    @Step("საძიებო ველში არასწორი მონაცემებით ძებნა (მაგ: satesto)")
    public SearchPageSteps IncorrectSearch(String incorrectPr) {
        searchInput.click();
        searchInput.setValue(incorrectPr);
        search.shouldBe(visible, Duration.ofMillis(15000)).click();
        return this;
    }
    @Step("popup_ის გათიშვა")
    public SearchPageSteps PopUp() {
        popUp.doubleClick();
        return this;
    }
}