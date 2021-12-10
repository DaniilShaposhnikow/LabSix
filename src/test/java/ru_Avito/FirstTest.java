package ru_Avito;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FirstTest extends WebDriverSettings
{
    @Test
    public void Zagolovok()
    {
        driver.get("https://www.avito.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Авито: недвижимость, транспорт, работа, услуги, вещи"));
    }

    @Test
    public void Ssylka() //Don't work
    {
        driver.get("https://www.avito.ru/");
        driver.findElement(new By.ByXPath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/label[1]")).sendKeys("iPhone");

        driver.findElement(new By.ByXPath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div[3]/button")).click();
        //WebElement myDynamicElement = (new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(new By.ByXPath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div[3]/button")));
    }
}
