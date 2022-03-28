package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.By;
import Core.MobileElement;

public class SignInWithGoogleScreen extends BaseMobileScreen {

    private final MobileElement continueButton = new MobileElement(By.Xpath, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]/android.view.View/android.widget.Button", "Continue Button");
    private final MobileElement passwordTextBox = new MobileElement(By.Id, "com.imdb.mobile:id/", "");
    private final MobileElement signInButton = new MobileElement(By.Id, "com.imdb.mobile:id/", "");

    public SignInWithGoogleScreen(){
        super();
    }

    public void clickInContinueButton(){
        findMobileElement(continueButton).click();
    }

}
