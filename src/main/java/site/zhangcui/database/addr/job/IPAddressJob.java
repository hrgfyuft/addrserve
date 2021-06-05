package site.zhangcui.database.addr.job;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class IPAddressJob {

    @Scheduled(cron = "*/2 * * * * ?")
    public void processor () {
        /*System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://2021.ip138.com");
        WebElement w = driver.findElement(By.xpath("/html/body/p[1]/a"));
        log.info(w.getText());
        driver.quit();*/
        log.info("1");
    }

}
