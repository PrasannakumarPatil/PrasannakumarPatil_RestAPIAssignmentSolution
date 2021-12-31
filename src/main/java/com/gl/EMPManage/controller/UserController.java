package com.gl.EMPManage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.EMPManage.entities.User;
import com.gl.EMPManage.service.UserService;

@RestController
@RequestMapping("/usercontroller")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public void save(@RequestBody User user) {
		userService.save(user);
	}

}
