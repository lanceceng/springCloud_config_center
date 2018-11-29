package com.attc.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient //此注解可以去掉，取消高可用
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
        System.out.println("打开：http://localhost:8881/hi，网页显示：foo version 2");
        System.out.println("config-client从config-server获取了foo的属性，而config-server是从git仓库读取的!");
    }

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi() {
        return foo;
    }
}
