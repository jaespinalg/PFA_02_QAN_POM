package com.sura.automationpractice.certificacion.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MetodosGenerales {

    public MetodosGenerales() {
    }

    public void clickElemento(By elementoPagina, WebDriver driver){
        driver.findElement(elementoPagina).click();
    }

    public void ingresarDato(By elementoPagina, WebDriver driver, String data){
        driver.findElement(elementoPagina).sendKeys(data);
    }

    public void scroll (int px, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + px + ");");
    }

    public void seleccionarElementoLista(By elementoPagina, WebDriver driver, String elemento ){
        Select seleccionar = new Select(driver.findElement(elementoPagina));
        seleccionar.selectByVisibleText(elemento);
    }
}
