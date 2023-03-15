package com.example.firstproject.services;
import java.util.*;

import com.example.firstproject.entities.User;

public interface UserService {
	public List<User> getUser();
	public User getU(int userId);
	public User addUser(User u);
	public User deleteUser(int UserId);
}
