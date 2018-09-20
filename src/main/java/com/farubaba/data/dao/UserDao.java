package com.farubaba.data.dao;

import com.farubaba.data.model.User;

public interface UserDao {
	User login(String username,String password);
}
