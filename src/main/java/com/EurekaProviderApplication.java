package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description: <br/>
 *
 * @Date: 2020/9/8 10:24<br/>
 * @Author Cong ZhiZzhi<br/>
 * @Version
 * @Since JDK 1.8
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class, args);
    }

}