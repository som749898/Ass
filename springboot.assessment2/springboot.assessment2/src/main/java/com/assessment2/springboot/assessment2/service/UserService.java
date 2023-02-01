package com.assessment2.springboot.assessment2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment2.springboot.assessment2.repository.UserRepository;
import com.assessment2.springboot.assessment2.response.ResponseUser;
import com.assessment2.springboot.assessment2.user.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public ResponseUser addOneUser(User user) {
		// TODO Auto-generated method stub
		ResponseUser response = new ResponseUser();
		User user1 = repository.save(user);
		if(user1.getUserName() == null) {
			response.setStatus(-1);
			response.setStatusDesc("Failure");
			
		} else {
			response.setStatus(0);
			response.setStatusDesc("Successfully added");
		}
		return response;
	}

}
