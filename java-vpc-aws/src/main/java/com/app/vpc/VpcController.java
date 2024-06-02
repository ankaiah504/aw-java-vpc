package com.app.vpc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VpcController {

   @GetMapping("/welcome")
	public String getMsg() {
		return "welcome to our world";
	
	}
	
}
