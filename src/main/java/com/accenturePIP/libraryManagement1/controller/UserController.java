package com.accenturePIP.libraryManagement1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenturePIP.libraryManagement1.bean.User;
import com.accenturePIP.libraryManagement1.bean.UserDues;
import com.accenturePIP.libraryManagement1.service.UserDetailService;

@RestController

public class UserController {
	@Autowired
	UserDetailService userDetailService;
	@GetMapping("/findUserById/{id}")
	public User findUserById(@PathVariable Integer id)
	{
		User user=userDetailService.findUserById(id);
		return user;
	}
	@GetMapping("/findUserByName/{name}")
	public List<User> findUserByName(@PathVariable String name)
	{
		List<User> userLst=userDetailService.findUserByName(name);
		return userLst;
	}
	@PostMapping("/userRegistration")
	public String registation(@RequestBody User user)
	{
		user=userDetailService.addUser(user);
		System.out.println(user.getName());
		return "Registation completed "+user.getId()+":   "+user.getName()+"   "+HttpStatus.OK;
	}
	@GetMapping("/find-list-of-dues-user")
	public List<UserDues> findListOFDuesUsers()
	{
		return userDetailService.findUsersDuesList();
	}

}
