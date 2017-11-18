package com.rpramadhan.sbstarter.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author someone
 * Enter point for Secure Page Service
 */
@SpringBootApplication
@ComponentScan("com.btpn.si")
public class StarterMain {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(StarterMain.class, args);
	}

}
