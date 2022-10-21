package com.hello.helloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.helloService.HelloService;

@RestController
public class HelloController {
	
	HelloService service =  new HelloService();
	
	@GetMapping("/hello")
	public String sayHello() {
		return service.hello();
	}
	

}
