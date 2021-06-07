package site.zhangcui.database.addr.job;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import site.zhangcui.database.addr.entity.IpInfo;
import site.zhangcui.database.addr.service.SystemService;

import java.util.Date;

@Component
@Slf4j
public class IPAddressJob {

    @Autowired
    SystemService service;

    @Scheduled(cron = "0 0 0/1 1/1 * ? ")
    public void processor () {

/*
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://2021.ip138.com");
        WebElement w = driver.findElement(By.xpath("/html/body/p[1]/a"));
        log.info(w.getText());

        IpInfo ipInfo = new IpInfo();
        ipInfo.setIpAddress(w.getText());
        ipInfo.setSaveTime(new Date());
        service.insert(ipInfo);
        driver.quit();
*/

        log.info( "1");
    }

}
