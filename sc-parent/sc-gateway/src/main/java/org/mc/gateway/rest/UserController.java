package org.mc.gateway.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
	@Value("${user.name}")
	private String val; //在开发中不能用此取值，如果变量一变，刷新配置也不会改变
	@Autowired
	private Environment  env;
	
	@RequestMapping(value = "/getVal",method = RequestMethod.GET)
	public String getVal(){
		System.out.println(val);
		System.out.println(env.getProperty("user.name"));
		return val;
	}
}
