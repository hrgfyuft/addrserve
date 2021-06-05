package site.zhangcui.database.addr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AddrApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddrApplication.class, args);
    }

}
