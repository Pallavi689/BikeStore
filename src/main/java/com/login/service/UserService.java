package com.login.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.entity.Users;
import com.login.repository.UsersRepo;

@Service
public class UserService {
  
	  @Autowired
//	  @Autowired for create runtime object for  UsersRepo usersRepo;

	  UsersRepo usersRepo;
	  
	  public Users addUser(Users user) {
	  
		 return usersRepo.save(user);
		 //save data in database and return data
     }
}
