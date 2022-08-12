/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebasAstull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verProducto extends Thread {

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
        
    }
}
