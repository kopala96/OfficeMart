package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class OrderPage {
    public SelenideElement
            continueBtn = $(".continue"),
            legalPerson = $(".tab", 0),
            physicalPerson = $(".tab", 1),
            sendBtn = $("#btn2"),
            companyName = $(byAttribute("placeholder", "კომპანიის სახელწოდება")),
            identityCoden = $(byAttribute("placeholder", "საიდენტიფიკაციო კოდი")),
            address = $(byAttribute("placeholder", "ფაქტიური მისამართი")),
            phoneNumber = $(byAttribute("placeholder", "საკონტაქტო ნომერი")),
            reciveOrder = $(byAttribute("placeholder", "როდის გსურთ შეკვეთის მიღება?")),
            emailInput = $(byAttribute("placeholder", "ელ.ფოსტა")),
            borderColor = $(byAttribute("style", "border: 1px solid red;"), 0),
            borderColor1 = $(byAttribute("style", "border: 1px solid red;"), 1),
            borderColor2 = $(byAttribute("style", "border: 1px solid red;"), 2),
            borderColor3 = $(byAttribute("style", "border: 1px solid red;"), 3),
            borderColor4 = $(byAttribute("style", "border: 1px solid red;"), 4),
            borderColor5 = $(byAttribute("style", "border: 1px solid red;"), 5),
            borderColorNotRed = $(byAttribute("style", "border: 1px solid rgb(69, 69, 69);")),
            borderColorNotRed1 = $(byAttribute("style", "border: 1px solid rgb(69, 69, 69);"), 1),
            borderColorNotRed3 = $(byAttribute("style", "border: 1px solid rgb(69, 69, 69);"), 3),
            identityCodee = $(byName("personalId"));

}
