package org.mc.gateway.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
	@Value("${user.name}")
	private String val;
	
	@RequestMapping(value = "/getVal",method = RequestMethod.GET)
	public String getVal(){
		System.out.println(val);
		return val;
	}
}
