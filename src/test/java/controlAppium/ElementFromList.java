package controlAppium;

import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class ElementFromList extends Control{
    private static String phoneNumber = "com.android.dialer:id/primary_action_view";

    private ElementFromList(By locator) {
        super(locator);
    }

    public static boolean isElementFromListViewed() {
        try {
            By elementFormList = By.id(phoneNumber);
            ElementFromList element = new ElementFromList(elementFormList);
            element.findControlWithWait();
            return element.isVisible();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
