package com.testing.pageObjects.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("/interaction")
public class InteractionsPage extends HomePage {
    // Locators ----------------------------------------------------------------------------------------------------------
    public static By SORTABLE_OPTION = css("div.show #item-0");
    public static By SELECTABLE_OPTION = css("div.show #item-1");
    public static By RESIZABLE_OPTION = css("div.show #item-2");
    public static By DROPPABLE_OPTION = css("div.show #item-3");
    public static By DRAGGABLE_OPTION = css("div.show #item-4");

    // Public methods ----------------------------------------------------------------------------------------------------
    public void waitForPageToLoad() {
        getElement(INTERACTIONS).waitUntilPresent();
        logWeAreOnPage();
    }
}