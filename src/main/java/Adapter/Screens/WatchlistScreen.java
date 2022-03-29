package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;


public class WatchlistScreen extends BaseMobileScreen {

    private final MobileElement moviesInWatchlist = new MobileElement(By.Xpath, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView", "Movie title");

    public WatchlistScreen(){
        super();
    }

    public String checkTitlesInWatchlist() {
        return findMobileElement(moviesInWatchlist).getText();
    }
}
