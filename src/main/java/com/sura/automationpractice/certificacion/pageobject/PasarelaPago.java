package com.sura.automationpractice.certificacion.pageobject;

import org.openqa.selenium.By;

public class PasarelaPago {

    By btnPagoUno = By.xpath("//*[@class='cart_navigation clearfix']/a");

    By btnPagoDos = By.name("processAddress");

    By btnPagoTres = By.name("processCarrier");

    By btnEntrega = By.id("cgv");

    By btnTipoPagoUno = By.className("bankwire");

    By btnConfirmarPago = By.xpath("//button[contains(.,'I confirm my order')]");

    public PasarelaPago() {
    }

    public By getBtnPagoUno() {
        return btnPagoUno;
    }

    public void setBtnPagoUno(By btnPagoUno) {
        this.btnPagoUno = btnPagoUno;
    }

    public By getBtnPagoDos() {
        return btnPagoDos;
    }

    public void setBtnPagoDos(By btnPagoDos) {
        this.btnPagoDos = btnPagoDos;
    }

    public By getBtnPagoTres() {
        return btnPagoTres;
    }

    public void setBtnPagoTres(By btnPagoTres) {
        this.btnPagoTres = btnPagoTres;
    }

    public By getBtnEntrega() {
        return btnEntrega;
    }

    public void setBtnEntrega(By btnEntrega) {
        this.btnEntrega = btnEntrega;
    }

    public By getBtnTipoPagoUno() {
        return btnTipoPagoUno;
    }

    public void setBtnTipoPagoUno(By btnTipoPagoUno) {
        this.btnTipoPagoUno = btnTipoPagoUno;
    }

    public By getBtnConfirmarPago() {
        return btnConfirmarPago;
    }

    public void setBtnConfirmarPago(By btnConfirmarPago) {
        this.btnConfirmarPago = btnConfirmarPago;
    }
}
