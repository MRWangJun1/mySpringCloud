package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author : wangjun
 * @date : 2022/3/11  16:36
 */
@SpringBootApplication
/**
使用@ServletComponentScan注解后
 Servlet可以直接通过@WebServlet注解自动注册
 Filter可以直接通过@WebFilter注解自动注册
 Listener可以直接通过@WebListener 注解自动注册
*/
@ServletComponentScan

/**
 * @EnableDiscoveryClient和@EnableEurekaClient
 * 共同点就是：都是能够让注册中心能够发现，扫描到改服务。
 * */
@EnableDiscoveryClient

/**
 * 使用 @RefreshScope注解，实现配置文件的动态加载。
 * */
@RefreshScope
public class ConsumerClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerClientApplication.class, args);
    }
}
