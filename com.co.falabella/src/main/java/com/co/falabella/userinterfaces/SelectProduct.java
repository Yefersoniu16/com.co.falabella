package com.co.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.FindElement;

public class SelectProduct {
    public static final Target CLOSE_NOTICE = Target.the("Close Notice").
            located(By.xpath("//div[@class='dy-lb-close']"));
    public static final Target SEARCH = Target.the("SEARCH").
            located(By.id("testId-SearchBar-Input"));
    public static final Target  SELECT_PRODUCT = Target.the("Select product").
            located(By.xpath("(//div[@class='jsx-1327784995 jsx-97019337 pod-head'])[1]"));
    public static final Target  BUTTON_AGG_PRODUCT = Target.the("Button agg  product").
            located(By.xpath("//button[@class='jsx-2166277967 button button-primary button-primary-xtra-large']"));
    public static final Target BUTTON_SEE_PRODUCT = Target.the("Button see product").
            located(By.id("linkButton"));
}
