package com.sura.automationpractice.certificacion.steps;

import com.sura.automationpractice.certificacion.pageobject.ElegirProducto;
import com.sura.automationpractice.certificacion.pageobject.LoginPageObject;
import com.sura.automationpractice.certificacion.pageobject.MensajePago;
import com.sura.automationpractice.certificacion.pageobject.PasarelaPago;
import com.sura.automationpractice.certificacion.utils.MetodosGenerales;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CompraProductoSteps {

    private LoginPageObject login = new LoginPageObject();
    private MetodosGenerales generales = new MetodosGenerales();
    private ElegirProducto elegirProducto = new ElegirProducto();

    private PasarelaPago pasarelaPago = new PasarelaPago();

    private MensajePago mensajePago = new MensajePago();

    private WebDriver driver;

    @Step
    public void ingresarLogin (){
        login.getDriver().get("http://automationpractice.com/index.php");
        driver = login.getDriver();
        generales.clickElemento(login.getBtnLogin(), driver);
    }

    @Step
    public void realizarLogin (String usuario, String contrasena){
        generales.ingresarDato(login.getTxtUsuario(), driver, usuario);
        generales.ingresarDato(login.getTxtContrasena(),driver,contrasena);
        generales.clickElemento(login.getBtnSingIn(), driver);
    }

    @Step
    public void seleccionarProducto(){
        generales.clickElemento(elegirProducto.getBtnDresses(),driver);
        generales.scroll(250, driver);
        generales.seleccionarElementoLista(elegirProducto.getSltSort(), driver, "Price: Lowest first");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        generales.clickElemento(elegirProducto.getBtnImagenProducto(),driver);
        generales.scroll(150, driver);
        generales.clickElemento(elegirProducto.getBtnAddToCart(),driver);
        generales.clickElemento(elegirProducto.getBtnProcederPago(), driver);
    }

    @Step
    public void pasarelaPago(){
        generales.scroll(900, driver);
        generales.clickElemento(pasarelaPago.getBtnPagoUno(),driver);
        generales.scroll(900, driver);
        generales.clickElemento(pasarelaPago.getBtnPagoDos(),driver);
        generales.scroll(500, driver);
        generales.clickElemento(pasarelaPago.getBtnEntrega(),driver);
        generales.clickElemento(pasarelaPago.getBtnPagoTres(), driver);
        generales.scroll(500, driver);
        generales.clickElemento(pasarelaPago.getBtnTipoPagoUno(), driver);
        generales.scroll(500, driver);
        generales.clickElemento(pasarelaPago.getBtnConfirmarPago(),driver);
        generales.scroll(500, driver);
    }

    @Step
    public void verificarMensajeExito(){
        Assert.assertThat(driver.findElement(mensajePago.getTxtMensajePago()).getText(), Matchers.is("Your order on My Store is complete."));
    }

}
