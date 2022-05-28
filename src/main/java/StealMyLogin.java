import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StealMyLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.stealmylogin.com/demo.html");

        WebElement loginField = driver.findElement(By.xpath("/html/body/form/input[1]"));

        loginField.sendKeys("ajhsdjh");

        WebElement passwordField = driver.findElement(By.xpath("/html/body/form/input[2]"));

        passwordField.sendKeys("123asdf");

        WebElement loginButton = driver.findElement(By.xpath("/html/body/form/input[3]"));

        loginButton.click();

        String newUrl = driver.getCurrentUrl();

        if(newUrl.equals("https://example.com/")){
            System.out.println("Nice");
        } else {
            System.out.println("Not nice");
        }

        driver.close();

    }
}
