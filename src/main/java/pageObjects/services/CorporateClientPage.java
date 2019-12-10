package pageObjects.services;

import pageObjects.AbstractPage;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class CorporateClientPage extends AbstractPage {
    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;
    @FindBy(xpath = "//h1//u[contains(text(),'Company')]")
    private WebElement textHeader;
}