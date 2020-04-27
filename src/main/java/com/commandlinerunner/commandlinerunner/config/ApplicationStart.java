package com.commandlinerunner.commandlinerunner.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value=3)
@Component
public class ApplicationStart implements CommandLineRunner {
 
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner running before load container order 3  "+args[0]);
    }
}
