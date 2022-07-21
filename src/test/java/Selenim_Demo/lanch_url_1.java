package Selenim_Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lanch_url_1
{


    public static void main(String[] arg)
    {
        System.out.println("hai team");
        WebDriverManager.chromedriver().setup();
        WebDriver dr=new ChromeDriver();
        dr.get("https://www.google.com/");



    }
}
