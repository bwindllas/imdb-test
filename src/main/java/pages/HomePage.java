package pages;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    public void openHomePage() {
        open("https://www.imdb.com");
    }

    public void searchFor(String keyword) {
        $x("//input[@data-testid='suggestion-search']").setValue(keyword).pressEnter();
    }
}