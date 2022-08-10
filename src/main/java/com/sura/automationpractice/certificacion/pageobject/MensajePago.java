package com.sura.automationpractice.certificacion.pageobject;

import org.openqa.selenium.By;

public class MensajePago {

    By txtMensajePago = By.className("cheque-indent");

    public MensajePago() {
    }

    public By getTxtMensajePago() {
        return txtMensajePago;
    }

    public void setTxtMensajePago(By txtMensajePago) {
        this.txtMensajePago = txtMensajePago;
    }
}
