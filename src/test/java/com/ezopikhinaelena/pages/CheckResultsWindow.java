package com.ezopikhinaelena.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CheckResultsWindow {
    private final SelenideElement submittingWindow = $("#example-modal-sizes-title-lg");
    private final SelenideElement checkResult = $(".table-responsive");
    private final ElementsCollection checkListResult = $$(".table-responsive");
    private final SelenideElement button = $("#closeLargeModal");

    public void checkTitleWindow() {
        submittingWindow.shouldHave(text("Thanks for submitting the form"));
    }

    public void checkValue(String value) {
        checkResult.shouldHave(text(value));
    }

    public void checkValueCollection(String label, String value) {
        checkListResult.findBy(text(label)).shouldHave(text(value));
    }

    public void closeButton() {
        button.click();
    }
}
