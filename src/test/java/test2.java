import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
    @Test

    public void p1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\andre\\OneDrive\\Escritorio\\Pasantias\\untitled\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\andre\\Downloads\\CamposAprendizaje.html");
        driver.manage().window().maximize();
    }
}
