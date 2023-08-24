package PageObject;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BucketPage {
    public SelenideElement

    addBag = $(".show_icon",0),
    succsecAdd=$(byText("პროდუქტი წარმატებით დაემატა კალათაში")),
    bucket1 = $(".header_cart"),
    productName = $(byText("კალამი ბურთულიანი \"შნაიდერი / Schneider\" TOPS ლურჯი")),
    productColor = $(byText("კალამი ბურთულიანი \"შნაიდერი / Schneider\" TOPS ლურჯი")),
    productCode = $(byText("#2/505B")),
    productValue = $( byName("quantity")),
    productPrice = $(".prod_price"),
    productSum = $(".fullPriceFor"),
    countAddBtn = $(".fa-plus"),
    countMinusBtn = $(".fa-minus"),
    clearXBtn = $(".fa-times"),
    checkBox = $(byAttribute("for","check0")),
    addCard =$(".show_icon",1),
    addCard2 =$(".show_icon",2),
    addCard3 =$(".show_icon",3),
    allClear = $(".clear_btn",1),
    emptyBucket = $(".emptyCart"),
    continueBtn = $(".continue");
}
