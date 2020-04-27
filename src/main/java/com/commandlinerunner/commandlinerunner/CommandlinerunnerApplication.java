package com.commandlinerunner.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.commandlinerunner.commandlinerunner.bean.ApplicationStartupRunner;
import com.commandlinerunner.commandlinerunner.config.applicationRunner.SpringBootApplicationRunner;

@SpringBootApplication
public class CommandlinerunnerApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(CommandlinerunnerApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
       // System.out.println("Application Started from main body");
    }
	@Bean
	public SpringBootApplicationRunner schedulerRunner() {
	        return new SpringBootApplicationRunner();
	 }
	
	
	/*@Bean
	public ApplicationStartupRunner schedulerRunner() {
	        return new ApplicationStartupRunner();
	 }*/
	
	
	

}
