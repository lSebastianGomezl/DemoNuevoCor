package co.com.konex.cetificacion.login.backoffice.userinterfaces.login;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PaginaBackoffice extends PageObject {

    public PaginaBackoffice() {
        super();
        String url = System.getenv("BASE_URL");
        setDefaultBaseUrl(url);
        System.out.println(url);
    }
}
