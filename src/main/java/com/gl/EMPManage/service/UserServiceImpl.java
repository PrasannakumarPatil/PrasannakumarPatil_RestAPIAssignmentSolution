package com.gl.EMPManage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.EMPManage.entities.User;
import com.gl.EMPManage.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);		
	}

}
