import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class test1{

    @Test
    public void testingU() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\andre\\OneDrive\\Escritorio\\Pasantias\\untitled\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\andre\\Downloads\\CamposAprendizaje.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/fieldset/table/tbody/tr/td[2]/input")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/ul[1]/li[4]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/ul[1]/ul[4]/li[2]/a")).click();
        Thread.sleep(5000);
        WebElement select = driver.findElement(By.id("tipoinsumo"));
        Select selectWeb = new Select(select);
        selectWeb.selectByValue("CADIS");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"data-table-cadis_wrapper\"]/div[1]/button/span")).click();
        Thread.sleep(2000);
        driver.quit();

    }
    @Test

    public void testingU2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\andre\\OneDrive\\Escritorio\\Pasantias\\untitled\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\andre\\Downloads\\CamposAprendizaje.html");
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/fieldset/table/tbody/tr/td[2]/input")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"fun01\"]/li[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"fun01_03\"]/li[1]/a")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"fun01_03_01\"]/li[1]/a")).click();
        Thread.sleep(6000);
        driver.quit();


    }
    @Test

    public void testingU3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\andre\\OneDrive\\Escritorio\\Pasantias\\untitled\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\andre\\Downloads\\CamposAprendizaje.html");
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/fieldset/table/tbody/tr/td[2]/input")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"Sidenavmenu\"]/li[3]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"fun03\"]/li[2]/a")).click();
        Thread.sleep(3000);
        WebElement select = driver.findElement(By.id("peun_id"));
        Select selectWeb = new Select(select);
        selectWeb.selectByValue("904");
Thread.sleep(3000);
WebElement select1 = driver.findElement(By.id("unid_id"));
Select selectoWeb1 = new Select(select1);
selectoWeb1.selectByValue("17");
        Thread.sleep(3000);
        WebElement select2 = driver.findElement(By.id("nied_id"));
        Select seletoWeb2 = new Select(select2);
        seletoWeb2.selectByValue("1");
        Thread.sleep(3000);
        WebElement selecto3 = driver.findElement(By.id("intm_id"));
        Select selectoWeb3 = new Select(selecto3);
        selectoWeb3.selectByValue("2");
        Thread.sleep(3000);
        WebElement selecto4 = driver.findElement(By.id("cate_id"));
        Select selectoWeb4 = new Select(selecto4);
        selectoWeb4.selectByValue("3");
        Thread.sleep(3000);
        WebElement selecto5 = driver.findElement(By.id("site_id"));
        Select selectoWeb5 = new Select(selecto5);
        selectoWeb5.selectByValue("2");
        Thread.sleep(3000);
        WebElement selecto6 = driver.findElement(By.id("unidfac"));
        Select selectoWeb6 = new Select(selecto6);
}

}