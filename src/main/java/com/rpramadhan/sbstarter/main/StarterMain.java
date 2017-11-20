package com.rpramadhan.sbstarter.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author rpramadhan
 * Enter point for Starter Application
 */
@SpringBootApplication
@ComponentScan("com.rpramadhan.sbstarter")
public class StarterMain {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(StarterMain.class, args);
	}

}
