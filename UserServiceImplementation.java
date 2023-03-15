package com.example.firstproject.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.firstproject.entities.User;
@Service
public class UserServiceImplementation implements UserService {
	List<User> list;
	public UserServiceImplementation() {
		
		list=new ArrayList<User>();
		list.add(new User(1256,"anurag",22));
		list.add(new User(1248,"Uday",21));
		
	}
	
	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return list;
	}
	

	@Override
	public User getU(int userId) {
		// TODO Auto-generated method stub
//		User u=null;
		for(User c : list) {
			if(c.get_u_id()==userId) {
				return c;
			}
		}
		return null;
	}

	@Override
	public User addUser(User u) {
		// TODO Auto-generated method stub
		list.add(u);
		return u;
	}
	@Override
	public User deleteUser(int UserId) {
		for(User i: list) {
			if(i.get_u_id()==UserId) {
				list.remove(i);
			}
		}
		return null;
	}
}
