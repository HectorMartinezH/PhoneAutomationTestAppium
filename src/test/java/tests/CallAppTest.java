package tests;

import activities.*;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class CallAppTest {
    MainActivity mainActivity = new MainActivity();
    DialActivity dialActivity = new DialActivity();
    CallingActivity callingActivity = new CallingActivity();
    MenuBarActivity menuBarActivity = new MenuBarActivity();
    RecentsActivity recentsActivity = new RecentsActivity();

    @Test
    public void a_resent_call_is_listed_in_recents_menu() throws MalformedURLException {
        mainActivity.dialButton.click();

        dialActivity.two.click();
        dialActivity.four.click();
        dialActivity.six.click();
        dialActivity.zero.click();
        dialActivity.nine.click();
        dialActivity.one.click();
        dialActivity.two.click();
        dialActivity.callButton.click();
        callingActivity.endCallButton.click();
        menuBarActivity.recentsButton.click();

        Assert.assertTrue("ERROR! number not listed.", recentsActivity.isNumbersListed());


    }
}
