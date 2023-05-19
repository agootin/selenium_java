package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.delivery-club.ru/ekaterinburg?shippingType=delivery");

        String title = driver.getTitle();
        Assert.assertEquals("Быстрая доставка еды Delivery Club", title);
        driver.quit();
    }
}
