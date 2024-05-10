import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.google.com");
        String googleUrl = driver.getCurrentUrl();
        System.out.println("Google url is: " + googleUrl);
        String googleTitle = driver.getTitle();
        System.out.println("Google title is: " + googleTitle);
        String googleSource = driver.getPageSource();
        System.out.println("Google page source: " + googleSource);
        String googleHandle = driver.getWindowHandle();
        System.out.println("Google handle: " + googleHandle);

        /*driver.navigate().to("https://softekogradecalculator.netlify.app/calculator/grade-calculator");
        String calculatorUrl = driver.getCurrentUrl();
        System.out.println("Calculator url is: " + calculatorUrl);
        String calculatorTitle = driver.getTitle();
        System.out.println("Calculator title is: " + calculatorTitle);

        driver.navigate().back();
        googleUrl = driver.getCurrentUrl();
        System.out.println("Current url is: " + googleUrl);
        googleTitle = driver.getTitle();
        System.out.println("Current title is: " + googleTitle);
        driver.navigate().refresh();*/

        Thread.sleep(1000);
        driver.quit();
    }
}
