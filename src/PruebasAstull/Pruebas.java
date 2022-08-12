package PruebasAstull;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Pruebas extends Thread {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bryan\\Downloads\\Funca\\chromedriver.exe");
        
        
        Menu();
    }

    public static void Menu() {
        byte opcion;

        opcion = Byte.parseByte(JOptionPane.showInputDialog(null,
                "****MENÚ PRINCIPAL****\n\n"
                + "1.Prueba de inicio de sesion \n"
                + "2.Prueba de ver productos \n"
                + "3.Prueba de compra \n"
                + "4.Prueba de ver lista de usuarios \n"
                + "5.salir \n\n"
                + "Digite su opción:"));

        switch (opcion) {
            case 1: {
                System.out.println("Ejecutando prueba 1");
                iniciarSesion ic = new iniciarSesion();
                
                ic.start();
                
                Menu();
                break;

            }
            case 2: {
                System.out.println("Ejecutando prueba 2");
                
                verProducto cc = new verProducto();
                
                cc.start();
                Menu();
                break;
            }
            case 3: {
                System.out.println("Ejecutando prueba 3");
                comprarProductos comC = new comprarProductos();
                
                comC.start();
                
                Menu();
                break;
            }
            case 4: {
                System.out.println("Ejecutando prueba 4");
                verUsuarios fc = new verUsuarios();
                
                fc.start();
                
                Menu();
                break;
            }
            case 5: {

                break;
            }
            default: {
                Menu();

            }

        }

    }

}
