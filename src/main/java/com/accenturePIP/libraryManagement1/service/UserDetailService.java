package com.accenturePIP.libraryManagement1.service;

import java.util.List;

import com.accenturePIP.libraryManagement1.bean.User;
import com.accenturePIP.libraryManagement1.bean.UserDues;

public interface UserDetailService {
	public User addUser(User user);
	public User findUserById(Integer id);
	public List<User> findUserByName(String name);
	public List<UserDues> findUsersDuesList();

}
