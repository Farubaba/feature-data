package com.farubaba.data.dao;

import java.util.List;

import com.farubaba.data.model.User;
import com.farubaba.root.interf.IModel;

public class ListUser2  implements IModel{
	private List<User> data;

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}

}
