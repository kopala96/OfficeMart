import StepObject.SearchPageSteps;
import Utills.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static DataObject.SearchPageData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Search extends ChromeRunner {
    SearchPageSteps searchPageSteps = new SearchPageSteps();

    @Test
    @Description("1) საძიებო ღილაკზე დაკლიკებით უნდა გამოვიდეს ჩასაწერი ველი")
    @Severity(SeverityLevel.NORMAL)
    public void SearchCheck() {
        searchPageSteps.SearchBtn();
        Assert.assertTrue(searchPageSteps.search.isDisplayed());
    }
    @Test
    @Description("2) საძიებო ველში სწორი მონაცემებით ძებნა (მაგ: კალამი ბურთულიანი)")
    @Severity(SeverityLevel.NORMAL)
    public void SearchCheck1() {
        searchPageSteps.SearchBtn()
                .SearchInp(product)
                .Products();
    }
    @Test
    @Description("3)საძიებო ველში არასწორი მონაცემებით ძებნა (მაგ: satesto),ვერაფერი მოიძებნა")
    @Severity(SeverityLevel.NORMAL)
    public void SearchNegativeCheck2() {
        searchPageSteps.SearchBtn()
                .SearchInp1(incorrectPr);
        Assert.assertTrue(searchPageSteps.notFound.isDisplayed());
        Assert.assertTrue(searchPageSteps.notFound1.isDisplayed());
        Assert.assertTrue(searchPageSteps.notFound2.isDisplayed());


    }
}