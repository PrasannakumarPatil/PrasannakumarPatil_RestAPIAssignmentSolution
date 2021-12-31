package com.gl.EMPManage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.EMPManage.entities.Role;
import com.gl.EMPManage.service.RoleService;

@RestController
@RequestMapping("/rolecontroller")
public class RoleController {

	@Autowired
	RoleService roleService;
	
	@PostMapping("/role")
	public void save(@RequestBody Role role) {
		roleService.save(role);
	}
	
}
