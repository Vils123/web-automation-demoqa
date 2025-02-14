package com.testing.pageObjects.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/webtables")
public class WebTablesPage extends ElementsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By WEB_TABLES_TITLE;
  public static By ADD_BUTTON ;
  // When user clicks add button, multiple input fields are given
  public static By AGE_FIELD;
  public static By SALARY_FIELD;
  public static By DEPARTMENT_FIELD;
  // Search field on the right side;
  public static By SEARCH_FIELD;
  // Find a selector that represents rows, should be total of 10
  public static By TABLE_ROW;
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(WEB_TABLES_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }

  public Boolean validateTableRow(DataTable data){
    String value = "";
    for (Map<String, String> map : dataToMap(data)) {
      List<WebElement> elements = getElement(TABLE_ROW).findElements(css("[role='gridcell']"));
      for (String key : map.keySet()) {
        info("Validating: " + key);
  
        switch(snakify(key)){
          case "FIRST_NAME":
          value = elements.get(0).getText();
          break;
          case "LAST_NAME":
            value = elements.get(1).getText();
            break;
          case "AGE":
            value = elements.get(2).getText();
            break;
          case "EMAIL":
            value = elements.get(3).getText();
            break;
          case "SALARY":
            value = elements.get(4).getText();
            break;
          case "DEPARTMENT":
            value = elements.get(5).getText();
            break;
        }
        if(!map.get(key).equals(value)){
          info("Expected value \"" + map.get(key) + "\" instead of \"" + value + "\"");
          return false;
        }
      }
    }
    return true;
  }
}
