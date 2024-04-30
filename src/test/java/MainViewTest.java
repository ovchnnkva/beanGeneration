import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.testbench.UploadElement;
import elemental.json.Json;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.time.Duration;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

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

        assertNotNull(textFieldPuml);
        assertNotNull(textFieldYaml);
    }


    @AfterAll
    public static void closeDriver() {
        driver.quit();
    }
}
