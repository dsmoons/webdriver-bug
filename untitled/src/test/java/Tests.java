import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@Execution(ExecutionMode.CONCURRENT)
public class Tests {

    @Test
    void test1() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test2() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test3() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test4() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test5() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test6() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test7() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test8() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test9() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test10() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test11() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test12() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test13() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test14() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    @Test
    void test15() {
        var driver = getChromeDriver(true);
        driver.get("http://ya.ru");
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.quit();
    }

    private static ChromeDriver getChromeDriver(Boolean headless) {
        WebDriverManager.chromedriver().setup();
        var chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("safebrowsing.enabled", "false");
        chromeOptions.setCapability("download.default_directory", "target//downloads");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.setHeadless(headless);
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        return new ChromeDriver(chromeOptions);
    }

}
