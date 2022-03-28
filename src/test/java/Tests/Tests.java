package Tests;

import Adapter.Bases.BaseMobileTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import static org.testng.Assert.*;

public class Tests extends BaseMobileTest {

    @Test(priority = 1)
    public void checkRecentlyViewed() throws IOException {
        loginScreen.skipSignIn();
        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie("The Batman");
        assertEquals(movieScreen.getOverview(), "When the Riddler, a sadistic serial killer, begins murdering key political figures in Gotham, Batman is forced to investigate the city's hidden corruption and question his family's involvement.");
    }

    @Test(priority = 2)
    public void checkWatchlist() throws IOException {
        loginScreen.clickInSignInWithGoogleButton();
        globalNavigationScreen.goToYouOption();

        assertEquals(youScreen.getUsername(), "Juan");

        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie("The Batman");

        assertEquals(movieScreen.getMovieTitle(),"The Batman");

        movieScreen.clickInAddToWatchButton();
        globalNavigationScreen.goToYouOption();
        youScreen.clickInSeeAllWatchList();

        assertEquals(watchlistScreen.checkTitlesInWatchlist(), "The Batman");
    }

    @Test(priority = 3)
    public void rateAMovie() throws IOException {
        loginScreen.clickInSignInWithGoogleButton();
        globalNavigationScreen.goToYouOption();

        assertEquals(youScreen.getUsername(), "Juan");

        globalNavigationScreen.goToSearchOption();
        searchScreen.searchMovie("The Batman");

        movieScreen.clickRateButton();

        rateMovieScreen.rateMovie();

        assertEquals(movieScreen.checkYourRating(), "/10");

    }
}
