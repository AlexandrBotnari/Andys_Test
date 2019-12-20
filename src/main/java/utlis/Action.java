package utlis;

import lombok.Getter;
import pages.*;

@Getter
public class Action {

    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();
    MenuPage menuPage = new MenuPage();
    CareerPage careerPage = new CareerPage();
    RestaurantsPage restaurantsPage = new RestaurantsPage();


    public void GetRandomCategory() {
        Logs.logger.info("Gets Random Category");
        RandomListSelect.GetRandomFromList(menuPage.getMenuList()).click();
    }

    public void GetRandomFilter() {
        Logs.logger.info("Gets Random Filter");
        RandomListSelect.GetRandomFromList(restaurantsPage.getFilter()).click();
    }

    public void GetRandomProduct() {
        Logs.logger.info("Gets Random Product");
        RandomListSelect.GetRandomFromList(menuPage.getProductList()).click();
    }

    public void RemoveRandomFromCart() {
        Logs.logger.info("Removes Random product from cart");
        RandomListSelect.GetRandomFromList(cartPage.getRemoveFromCart()).click();
    }

    public void GetRandomProductPhoto() {
        Logs.logger.info("Gets Random product photo");
        RandomListSelect.GetRandomFromList(menuPage.getProductPhotoList()).click();
    }

    public void EnterDataInRandomField() {
        Logs.logger.info("Enters data in random Field");
        RandomListSelect.GetRandomFromList(careerPage.getInformationFillList()).sendKeys("123456");
    }
    public void EnterTextField() {
        careerPage.getOfficeJobsTextBox().sendKeys("qwerqwer");
    }

    public void RestaurantJobsListRandom() {
        Logs.logger.info("Clicks on Random Restaurant Job checkbox");
        RandomListSelect.GetRandomFromList(careerPage.getRestaurantJobsList()).click();
    }

    public void FactoryJobsListRandom() {
        Logs.logger.info("Clicks on Random Factory Job checkbox");
        RandomListSelect.GetRandomFromList(careerPage.getFactoryJobsList()).click();
    }

    public void RandomCheckBoxesList() {
        Logs.logger.info("Clicks on Random miscellaneous checkbox");
        RandomListSelect.GetRandomFromList(careerPage.getRandomCheckBoxesList()).click();
    }


}
