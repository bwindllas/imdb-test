package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;

public class SearchResultsPage {

    public void clickFirstResult() {
        $$x("//*[@class='ipc-metadata-list-summary-item__c']").first().shouldBe(visible).click();
    }
}