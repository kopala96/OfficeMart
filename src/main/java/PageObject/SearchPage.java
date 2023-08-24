package PageObject;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchPage {
    public SelenideElement
            searchBtn = $(".waves-effect"),
            search = $(".fa-search", 1),
            searchInput = $(byName("search")),
            firstname = $(".prod_title", 0).$(withText("კალამი ბურთულიანი"), 0),
            notFound = $(byText("ვერაფერი მოიძებნა")),
            notFound1 = $(byText("საძიებო სიტყვა")),
            notFound2 = $(byText("'satesto'")),
            popUp = $(".page_header");


    public ElementsCollection
            productCount = $$(".prod_img");
}