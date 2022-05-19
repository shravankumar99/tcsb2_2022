package helloapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {
	@GetMapping(value = "/hello-message")
	String displayMessage() {
		
		return "Hello";
	}
	

}
