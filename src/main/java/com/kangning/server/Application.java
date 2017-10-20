package com.kangning.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by kieren on 17/10/20.
 */
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class Application {
    public static void main (String args[]) {
        SpringApplication.run(Application.class,args);
    }
}
