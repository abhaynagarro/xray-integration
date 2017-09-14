package com.example.xray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XrayIntegrationApp {

	public static void main(String[] args) {
		SpringApplication.run(XrayIntegrationApp.class, args);
	}

	public void displaySuccess() {
		System.out.println("Hello XRay");
	}

	public String displayFailed() {
		return "fail";
	}
}
