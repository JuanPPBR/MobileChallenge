package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;
import Core.MobileAppDriver;
import io.appium.java_client.MobileBy;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


public class MovieScreen extends BaseMobileScreen {


    private final MobileElement movieOverview = new MobileElement(By.Id, "com.imdb.mobile:id/plot_overview", "Movie Overview");
    private final MobileElement movieTitle = new MobileElement(By.Id, "com.imdb.mobile:id/title", "Movie Title");
    private final MobileElement addToWatchlistButton = new MobileElement(By.Id, "com.imdb.mobile:id/state_off", "Add to Watchlist");
    private final MobileElement rateButton = new MobileElement(By.Id, "com.imdb.mobile:id/empty_user_rating", "Add a Review button");
    private final MobileElement yourRate = new MobileElement(By.Xpath, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[2]", "Your rate ");


    public MovieScreen() {
        super();
    }

    public String getOverview() throws IOException {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\jburgos\\OneDrive - ENDAVA\\Documents\\MobileChallenge\\ScreenshotTest1.jpg"));
        return findMobileElement(movieOverview).getText();
    }

    public String getMovieTitle() {
        return findMobileElement(movieTitle).getText();
    }

    public void clickInAddToWatchButton() {
        findMobileElement(addToWatchlistButton).click();
    }

    public void clickRateButton() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(.scrollable(true)).scrollIntoView(.textContains(\"From top reviewers\"))"));
        findMobileElement(rateButton).click();
    }

    public String checkYourRating() throws IOException {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\jburgos\\OneDrive - ENDAVA\\Documents\\MobileChallenge\\ScreenshotTest3.jpg"));
        return findMobileElement(yourRate).getText();
    }
}
