package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import unilities.Driver;

public class AmazonAramaSD {

     AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("https://amazon.com");
    }

    @Given("Kullanici aramakutusuna iphone yazar")
    public void kullanici_aramakutusuna_iphone_yazar() {
        amazonPage.searchBox.sendKeys("iphone" + Keys.ENTER);
    }

    @Then("Kullanici sonucsayisini ekrana yazar")
    public void kullanici_sonucsayisini_ekrana_yazar() {
        String resultNumber1 = amazonPage.resultNumber.getText();
        System.out.println(resultNumber1);
    }

}
