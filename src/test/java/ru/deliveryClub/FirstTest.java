package ru.deliveryClub;

import core.BaseSeleniumTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends BaseSeleniumTest {
    @Test
    public void firstTest() {

        driver.get("https://www.delivery-club.ru/ekaterinburg?shippingType=delivery");

        String title = driver.getTitle();
        Assert.assertEquals("Быстрая доставка еды Delivery Club", title);
    }
}
