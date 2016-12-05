package com.app.gateway;



import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulServer
public class Application {

    private static final Logger LOG = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
