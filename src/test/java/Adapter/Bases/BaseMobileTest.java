package Adapter.Bases;

import Adapter.Screens.*;
import Core.ConfigCapabilities;
import Core.MobileAppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class BaseMobileTest {

    private AndroidDriver<AndroidElement> driver;
    public LoginScreen loginScreen;
    public GlobalNavigationScreen globalNavigationScreen;
    public SearchScreen searchScreen;
    public MovieScreen movieScreen;
    public PopUps popUps;
    public YouScreen youScreen;
    public SignInWithGoogleScreen signInWithGoogleScreen;
    public WatchlistScreen watchlistScreen;
    public RateMovieScreen rateMovieScreen;

    @BeforeSuite(alwaysRun = true)
    public void setUp(){
        driver = MobileAppDriver.getMovieAppDriver(ConfigCapabilities.getCapabilities());
        loginScreen = new LoginScreen();
        globalNavigationScreen = new  GlobalNavigationScreen();
        searchScreen = new SearchScreen();
        movieScreen = new MovieScreen();
        popUps = new PopUps();
        youScreen = new  YouScreen();
        signInWithGoogleScreen = new SignInWithGoogleScreen();
        watchlistScreen = new WatchlistScreen();
        rateMovieScreen = new RateMovieScreen();
        popUps.denyLocation();
        popUps.acceptIMDbNotification();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws IOException {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\jburgos\\OneDrive - ENDAVA\\Documents\\MobileChallenge\\ScreenshotTest.jpg"));
        if(driver != null)
            driver.quit();
    }
}
