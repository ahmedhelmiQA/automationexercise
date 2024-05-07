package Pages;

import org.openqa.selenium.By;

public class P01_RegisterPage {
    // click button in the header
    private final By signuploginButton = By.cssSelector("a[href='/login']");
    // input feald name && email then signup button to redirect to the form page
    private final By signUpName         = By.cssSelector("input[data-qa=\"signup-name\"]");
    private final By signUpEmail        = By.cssSelector("data-qa=\"signup-email\"");
    private final By signUpButton       = By.cssSelector("button[data-qa=\"signup-button\"]");
    private final By errorMsg           = By.cssSelector("[action=\"/signup\"] p");

}
