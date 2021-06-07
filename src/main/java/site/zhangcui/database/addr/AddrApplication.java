package site.zhangcui.database.addr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableScheduling
@EnableOpenApi
public class AddrApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddrApplication.class, args);
    }

}
