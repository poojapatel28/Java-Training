package com.visa.prj.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greet")
public class GreetingController {

	@GetMapping()
	public String helloGreet()
	{
		return "hello from spring boot";
	}
}
