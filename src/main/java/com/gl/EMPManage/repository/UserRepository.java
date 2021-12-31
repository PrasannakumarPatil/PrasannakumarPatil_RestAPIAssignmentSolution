package com.gl.EMPManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.EMPManage.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User getByUsername(String username);
	
}
