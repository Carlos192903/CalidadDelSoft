/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebasAstull;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

/**
 *
 * @author Lenovo
 */
public class comprarProductos extends Thread {

    @Override
    public void run() {
        WebDriver test1C = new ChromeDriver();
        // driver de Chrome
        test1C.get("http://localhost/login");
        test1C.manage().window().maximize();
        //datos de login
        String username = "homero@test.com";
        String password = "123456789";

        //localizando id
        test1C.findElement(By.id("username"));
        WebElement usernameInput = test1C.findElement(By.id("username"));
        test1C.findElement(By.id("password"));

        WebElement passwordInput = test1C.findElement(By.id("password"));
        WebElement loginbt = test1C.findElement(By.id("boton"));

        //login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);

        loginbt.click();

        test1C.get("http://localhost/preCarrito");
        
       
        
       // WebElement producto = test1C.findElement(By.id("botonProducto"));
        
       // WebElement agregar = test1C.findElement(By.id("btn btn-dark col"));
        
       // producto.click();
        test1C.get("http://localhost/veProducto/1");
        retraso();
       // agregar.click();
        test1C.get("http://localhost/carritoProducto/1?cantidad=1");
    }
    
     public static void retraso() {
        try {
            for (int i = 0; i < 1; i++) {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Sleep " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }



   }
}