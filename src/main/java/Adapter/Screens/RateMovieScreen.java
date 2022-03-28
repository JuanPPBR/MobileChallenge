package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;
import io.appium.java_client.touch.WaitOptions;

import java.util.concurrent.TimeUnit;

public class RateMovieScreen extends BaseMobileScreen {

    private final MobileElement oneStarButton = new MobileElement(By.Id, "com.imdb.mobile:id/star_1", "Rate 1 star");
    private final MobileElement twoStarButton = new MobileElement(By.Id, "com.imdb.mobile:id/star_2", "Rate 1 star");
    private final MobileElement threeStarButton = new MobileElement(By.Id, "com.imdb.mobile:id/star_3", "Rate 1 star");
    private final MobileElement fourStarButton = new MobileElement(By.Id, "com.imdb.mobile:id/star_4", "Rate 1 star");
    private final MobileElement fiveStarButton = new MobileElement(By.Id, "com.imdb.mobile:id/star_5", "Rate 1 star");
    private final MobileElement sixStarButton = new MobileElement(By.Id, "com.imdb.mobile:id/star_6", "Rate 1 star");
    private final MobileElement sevenStarButton = new MobileElement(By.Id, "com.imdb.mobile:id/star_7", "Rate 1 star");
    private final MobileElement eightStarButton = new MobileElement(By.Id, "com.imdb.mobile:id/star_8", "Rate 1 star");
    private final MobileElement nineStarButton = new MobileElement(By.Id, "com.imdb.mobile:id/star_9", "Rate 1 star");
    private final MobileElement tenStarButton = new MobileElement(By.Id, "com.imdb.mobile:id/star_10", "Rate 1 star");
    private final MobileElement rateButton = new MobileElement(By.Id, "com.imdb.mobile:id/rate_title_button", "Rate button");

    public RateMovieScreen(){
        super();
    }

    public void rateMovie(){
        findMobileElement(nineStarButton).click();
        findMobileElement(rateButton).click();
    }
}
