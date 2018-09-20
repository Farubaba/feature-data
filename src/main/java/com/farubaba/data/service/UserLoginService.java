package com.farubaba.data.service;

import com.farubaba.data.dao.UserDao;
import com.farubaba.data.dao.UserLoginDao;
import com.farubaba.data.model.User;
import com.farubaba.json.JsonFactory;
import com.farubaba.json.JsonService;
import com.farubaba.root.interf.impl.ErrorResult;


public class UserLoginService implements LoginService{
	
	protected JsonService jsonService = JsonFactory.getInstance().getJsonService();
	protected UserDao userDao = new UserLoginDao();

	@Override
	public String login(String userName, String password) {
		User user = userDao.login(userName, password);
		//登陆逻辑判断，并返回给客户端不同的response内容
		if(user == null || !user.isLogin()){
			ErrorResult  error = new ErrorResult(1404, "USER_NOT_FOUNT", "用户："+ userName +" 不存在, 或者密码："+ password +" 错误！");
			return jsonService.toJsonString(error);
		}
		return jsonService.toJsonString(user);
	}

	@Override
	public User userLogin(String userName, String password) {
		User user = userDao.login(userName, password);
		return user;
	}

}
