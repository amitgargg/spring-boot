package com.boot.command.line.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoadConfigurationJustAfterServerStarted implements CommandLineRunner{

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("=============CommandLineRunner Interface is Implemented Successfully===================");
		System.out.println("=============I am running Just after Application Got Started=======================");
		System.out.println("=============Please start the application and check the logs to see CommandLineRunner running===========");
		System.out.println("=============Thankyou very much for your attention: CommandLineRunner END===========");
	}

}
