import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
public class MainViewTest {
    private static ChromeDriver driver;

    @BeforeAll
    public static void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:8081");
    }


    @SneakyThrows
    @Test
    public void loadPumlFile() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        File file = new File("src/test/java/activityPuml.puml");
        WebElement shadowHost = driver.findElement(By.xpath("//vaadin-upload"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.id("fileInput"));
        shadowContent.sendKeys(file.getAbsolutePath());

        var textFieldPuml = driver.findElement(By.id("pumlText"));
        var textFieldYaml = driver.findElement(By.id("yamlText"));
        var imageLayout = driver.findElement(By.id("imageLayout"));

        assertNotNull(textFieldPuml);
        assertNotNull(textFieldYaml);
        assertNotNull(imageLayout);
    }


    @AfterAll
    public static void closeDriver() {
        driver.quit();
    }
}
