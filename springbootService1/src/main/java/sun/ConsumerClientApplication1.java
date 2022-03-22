package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author : wangjun
 * @date : 2022/3/14  10:09
 */
@SpringBootApplication
@EnableDiscoveryClient
@ServletComponentScan
@RefreshScope
public class ConsumerClientApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerClientApplication1.class, args);
    }

}
