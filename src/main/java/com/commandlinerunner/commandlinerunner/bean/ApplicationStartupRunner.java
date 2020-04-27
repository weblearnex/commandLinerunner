package com.commandlinerunner.commandlinerunner.bean;

import org.springframework.boot.CommandLineRunner;

public class ApplicationStartupRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application Started");
    }
}