package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;
import pages.TitlePage;

import java.util.List;

import static com.codeborne.selenide.Selenide.closeWebDriver;

@Epic("IMDb Regression Tests")
@Feature("Top Cast Validation")
public class IMDbTest {

    HomePage homePage = new HomePage();
    SearchResultsPage resultsPage = new SearchResultsPage();
    TitlePage titlePage = new TitlePage();

    @BeforeClass
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @Test(description = "Search and validate top 5 cast members")
    public void validateTop5Cast() {
        homePage.openHomePage();
        homePage.searchFor("Black Mirror");
        resultsPage.clickFirstResult();

        List<String> castList = titlePage.getTopCastMembers();

        System.out.println("\nTop 5 Cast Members:");
        for (int i = 0; i < Math.min(5, castList.size()); i++) {
            System.out.println((i + 1) + ". " + castList.get(i));
        }
    }

    @AfterClass
    public void tearDown() {
        closeWebDriver();
    }
}