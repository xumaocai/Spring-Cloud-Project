package com.umeox.sc.common.client.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("user")
public interface UserClient {
	
	@RequestMapping(value = "/user/findById",method = RequestMethod.GET)
	String findById(@RequestParam("userId") Long userId);
}
