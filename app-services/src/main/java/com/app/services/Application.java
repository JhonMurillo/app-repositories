package com.app.services;



import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Application {

    private static final Logger LOG = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        LOG.info(" > Inicio App ");
    }
}
