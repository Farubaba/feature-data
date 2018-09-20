package com.farubaba.data.dao;

import java.util.List;
import java.util.Map;

import com.farubaba.data.model.Book;
import com.farubaba.data.model.User;

public interface DataCenter {
	public User getUser(String id , String name, String address,String apiVersion);
	public List<User> getUserList(String apiVersion);
	public Map<String,User> getUserMap(String apiVersion);
	
	public Book getBook(String id, String name, String type,String apiVersion);
	public List<Book> getBookList(String apiVersion);
	public Map<String, Book> getBookMap(String apiVersion);
	

}
