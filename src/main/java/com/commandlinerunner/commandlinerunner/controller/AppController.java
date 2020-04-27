package com.commandlinerunner.commandlinerunner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping
	public String entryPoint(){
		return "Application up and running";
	}
}
