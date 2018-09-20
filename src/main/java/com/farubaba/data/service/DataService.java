package com.farubaba.data.service;

import java.util.List;

import com.farubaba.data.model.User;

public interface DataService {
	
	public List<User> getUsers(String version);
	
	public String getUserListJson(String version);
	
}
