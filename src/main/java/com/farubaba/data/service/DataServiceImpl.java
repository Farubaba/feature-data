package com.farubaba.data.service;

import java.util.List;

import com.farubaba.data.dao.DataCenter;
import com.farubaba.data.dao.DataCenterImpl;
import com.farubaba.data.model.User;
import com.farubaba.json.JsonFactory;
import com.farubaba.json.JsonService;

public class DataServiceImpl implements DataService {

	private DataCenter dataCenter = new DataCenterImpl(); 
	private JsonService gson = JsonFactory.getInstance().getJsonService();
	
	@Override
	public List<User> getUsers(String apiVersion) {
		return dataCenter.getUserList(apiVersion);
	}

	@Override
	public String getUserListJson(String apiVersion) {
		return gson.toJsonString(getUsers(apiVersion));
	}

}
