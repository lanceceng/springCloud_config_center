package com.attc.configeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaApplication.class, args);
        System.out.println("访问网址：http://localhost:8889/");
        System.out.println("这时发现，在读取配置文件不再写ip地址，而是服务名，这时如果配置服务部署多份，通过负载均衡，从而高可用。");
        System.out.println("依次启动config-eureka,config-server,config-client");
        System.out.println("访问http://localhost:8881/hi，浏览器显示：foo version 2");
    }
}
