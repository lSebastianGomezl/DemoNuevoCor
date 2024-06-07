package co.com.konex.cetificacion.login.backoffice.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CambiarAtributoType {

    public static void cambiarAtributo(String id) {
        // Configuración del sistema para el controlador de Chrome.
        System.setProperty("webdriver.chrome.driver", "ruta/al/chromedriver");

        // Inicializar el WebDriver (en este caso, ChromeDriver).
        WebDriver driver = new ChromeDriver();

        // Encontrar el elemento por su selector (puede necesitar ajustes según la estructura de tu página).
        WebElement inputElement = driver.findElement(By.id(id));

        // Modificar el atributo 'type' del elemento a 'file'.
        ((JavascriptExecutor) driver).executeScript("arguments[0].type='file';", inputElement);

        // Realizar otras operaciones o acciones según sea necesario.

        // Cerrar el navegador al finalizar.
        driver.quit();
    }
}
