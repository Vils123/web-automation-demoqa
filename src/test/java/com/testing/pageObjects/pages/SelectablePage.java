package com.testing.pageObjects.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@DefaultUrl("/selectable")
public class SelectablePage  extends InteractionsPage {
    // Locators ----------------------------------------------------------------------------------------------------------
    public static By SELECTABLE_TITLE = text("Selectable");
    public static By LIST_TAB = id("demo-tab-list");
    public static By GRID_TAB = id("demo-tab-grid");
    public static By OPTION_ONE= xpath("//li[text()='Cras justo odio']");
    public static By OPTION_TWO= xpath("//li[text()='Dapibus ac facilisis in']");
    public static By OPTION_THREE= xpath("//li[text()='Morbi leo risus']");
    public static By OPTION_FOUR= xpath("//li[text()='Porta ac consectetur ac']");

}