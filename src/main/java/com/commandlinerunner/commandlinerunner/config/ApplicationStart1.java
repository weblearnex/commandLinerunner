package com.commandlinerunner.commandlinerunner.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value=4)
@Component
public class ApplicationStart1 implements CommandLineRunner {
 
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner running before load container order 4 "+args[0]);
    }
}
