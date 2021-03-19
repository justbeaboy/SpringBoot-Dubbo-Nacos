package com.nacos;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mr.SoftRock
 * @Date 2021/3/1912:49
 **/
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.nacos")
@EnableNacosDiscovery
public class SpringBootNacosApplcation {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootNacosApplcation.class, args);
    }
}
