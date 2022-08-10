package com.sura.automationpractice.certificacion.pageobject;

import org.openqa.selenium.By;

public class ElegirProducto {

    By btnDresses = By.xpath("//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]");
    By sltSort = By.id("selectProductSort");

    By btnImagenProducto = By.className("product_img_link");
    By btnAddToCart = By.name("Submit");
    By btnProcederPago = By.xpath("//*[@title='Proceed to checkout']");

    public ElegirProducto() {
    }

    public By getBtnDresses() {
        return btnDresses;
    }

    public void setBtnDresses(By btnDresses) {
        this.btnDresses = btnDresses;
    }

    public By getBtnImagenProducto() {
        return btnImagenProducto;
    }

    public void setBtnImagenProducto(By btnImagenProducto) {
        this.btnImagenProducto = btnImagenProducto;
    }

    public By getSltSort() {
        return sltSort;
    }

    public void setSltSort(By sltSort) {
        this.sltSort = sltSort;
    }

    public By getBtnAddToCart() {
        return btnAddToCart;
    }

    public void setBtnAddToCart(By btnAddToCart) {
        this.btnAddToCart = btnAddToCart;
    }

    public By getBtnProcederPago() {
        return btnProcederPago;
    }

    public void setBtnProcederPago(By btnProcederPago) {
        this.btnProcederPago = btnProcederPago;
    }
}
