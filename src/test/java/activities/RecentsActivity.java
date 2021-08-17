package activities;

import controlAppium.ElementFromList;

public class RecentsActivity {
    public ElementFromList elementFromList;


    public boolean isNumbersListed() {
        return ElementFromList.isElementFromListViewed();
    }
}
