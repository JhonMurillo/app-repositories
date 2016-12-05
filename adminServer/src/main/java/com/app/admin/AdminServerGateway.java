package com.app.admin;

import java.util.logging.Logger;
import javax.servlet.Filter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class AdminServerGateway {

    private static final Logger LOG = Logger.getLogger(AdminServerGateway.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(AdminServerGateway.class, args);
        LOG.info("Inicio Admin");
    }

    @Bean
    public Filter shallowEtagHeaderFilter() {
        return new SimpleCORSFilter();
    }

}
