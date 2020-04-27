package com.commandlinerunner.commandlinerunner.config.applicationRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class SpringBootApplicationRunner implements ApplicationRunner {

	@Override
    public void run(ApplicationArguments args) {
        
		final List<String> nonOptionArgs = args.getNonOptionArgs();
        final String[] sourceArgs = args.getSourceArgs();
        final Set<String>  optionNames = args.getOptionNames();
        nonOptionArgs.forEach(nonOption -> System.out.println("Non Option Data : "+nonOption));
        optionNames.forEach(option -> System.out.println("Option Data    : "+option));
        Arrays.stream(sourceArgs).forEach(srcArgs ->System.out.println("All Source Args     : "+srcArgs));
 
    }
}
