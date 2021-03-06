package pages;


import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
@Setter
public class BanquetsPage extends AndysPage {
    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;
    @FindBy(xpath = "//h1[contains(text(),'We like to be chosen by big companies')]")
    private WebElement headerOnPageEN;
    @FindBy(xpath = "//div[@class='block-title'][contains(text(),'Chi')]")
    private WebElement RestaurantsLocationChisinau;
    @FindBy(xpath = "//div[@class='block-title'][contains(text(),'Bal')]")
    private WebElement RestaurantsLocationBalti;
    @FindBy(xpath = "(//div[@class='restaurant__act'])[1]")
    private WebElement seeMoreButtoт;
    @FindBy(xpath = "//div[@class='restaurant__contacts']")
    private List<WebElement> tellNumbers;

    public BanquetsPage() {
        super();
    }

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/events";
        return url;
    }
}
