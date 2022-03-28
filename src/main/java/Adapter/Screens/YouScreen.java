package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;

public class YouScreen extends BaseMobileScreen {

    private final MobileElement usernameAccount = new MobileElement(By.Id, "com.imdb.mobile:id/user_name", "Name of account");
    private final MobileElement seeAllWatchlistButton = new MobileElement(By.Id,"com.imdb.mobile:id/see_all", "See All Watchlist Button");

    public YouScreen(){super();}

    public String getUsername(){
        return findMobileElement(usernameAccount).getText();
    }

    public void clickInSeeAllWatchList(){
        findMobileElement(seeAllWatchlistButton).click();
    }
}
