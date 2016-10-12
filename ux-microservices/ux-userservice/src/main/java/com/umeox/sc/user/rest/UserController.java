package com.umeox.sc.user.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umeox.sc.user.domain.User;
import com.umeox.sc.user.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired private UserRepository userRepository;
	
	//注册
	@RequestMapping(value = "/regist",method = RequestMethod.POST)
	public String regist(@RequestParam(value = "username") String username,
						@RequestParam(value = "password") String password,
						@RequestParam(value = "nickname") String nickname,
						@RequestParam(value = "tel") String tel,
						@RequestParam(value = "email") String email){
		User user = userRepository.findOneByUsername(username);
		if (user != null) {
			return "fail";
		}
		user = new User(username, password, nickname, tel, email);
		userRepository.save(user);
		return "success";
	}
	
	//查找用户
	@RequestMapping(value = "findById",method = RequestMethod.GET)
	public String findById(@RequestParam(value = "userId") long userId){
		User user = userRepository.findOne(userId);
		if (user == null) {
			return null;
		}
		return user.getUsername();
	}
}
