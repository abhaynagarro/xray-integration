package com.example.xray;

import org.springframework.stereotype.Component;

@Component
public class Dummy {

	public void displaySuccess() {
		System.out.println("Hello XRay");
	}

	public String displayFailed() {
		return "fail";
	}
}
