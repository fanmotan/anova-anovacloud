

package com.anova.anovacloud.cucumber.util;

import java.lang.reflect.Field;

import javax.inject.Inject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class AnovaCloudElementLocatorFactory implements ElementLocatorFactory {
    private final WebDriver driver;

    @Inject
    public AnovaCloudElementLocatorFactory(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public ElementLocator createLocator(Field field) {
        return new AnovaCloudElementLocator(driver, field);
    }
}
