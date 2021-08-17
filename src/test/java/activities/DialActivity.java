package activities;

import controlAppium.Button;
import org.openqa.selenium.By;

public class DialActivity {
    public Button one = new Button(By.id("com.android.dialer:id/one"));
    public Button two = new Button(By.id("com.android.dialer:id/two"));
    public Button four = new Button(By.id("com.android.dialer:id/four"));
    public Button six = new Button(By.id("com.android.dialer:id/six"));
    public Button zero = new Button(By.id("com.android.dialer:id/zero"));
    public Button nine = new Button(By.id("com.android.dialer:id/nine"));
    public Button callButton = new Button(By.id("com.android.dialer:id/dialpad_floating_action_button"));
}
