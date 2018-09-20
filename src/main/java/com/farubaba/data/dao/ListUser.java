package com.farubaba.data.dao;

import java.util.List;

import com.farubaba.data.model.User;
import com.farubaba.root.interf.IModel;

public class ListUser implements IModel{
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
