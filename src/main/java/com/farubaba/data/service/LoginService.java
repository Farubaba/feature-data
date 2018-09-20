package com.farubaba.data.service;

import com.farubaba.data.model.User;

public interface LoginService{
	String login(String userName, String password);
	User userLogin(String userName, String password);
}
