package com.app.admin;

import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class AdminServerGateway {

    private static final Logger LOG = Logger.getLogger(AdminServerGateway.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(AdminServerGateway.class, args);
        LOG.info("Inicio Admin");
    }
}
