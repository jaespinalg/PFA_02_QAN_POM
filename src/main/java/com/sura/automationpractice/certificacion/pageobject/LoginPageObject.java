package com.sura.automationpractice.certificacion.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPageObject extends PageObject {

    By btnLogin = By.className("login");

    By txtUsuario = By.id("email");
    By txtContrasena = By.id("passwd");
    By btnSingIn = By.id("SubmitLogin");

    public LoginPageObject() {
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(By btnLogin) {
        this.btnLogin = btnLogin;
    }

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(By txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public By getTxtContrasena() {
        return txtContrasena;
    }

    public void setTxtContrasena(By txtContrasena) {
        this.txtContrasena = txtContrasena;
    }

    public By getBtnSingIn() {
        return btnSingIn;
    }

    public void setBtnSingIn(By btnSingIn) {
        this.btnSingIn = btnSingIn;
    }
}
