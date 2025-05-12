package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$x;

public class TitlePage {

    public List<String> getTopCastMembers() {
        SelenideElement castSection = $$x("//section[@data-testid='title-cast']")
                .findBy(Condition.text("Top cast"));
        castSection.scrollIntoView(true);

        return castSection.$$x(".//a[@data-testid='title-cast-item__actor']")
                .asFixedIterable()
                .stream()
                .map(SelenideElement::getText)
                .collect(Collectors.toList());
    }
}