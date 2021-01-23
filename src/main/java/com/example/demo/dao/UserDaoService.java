package com.example.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.User;

@Component
public class UserDaoService {

	private static int userscount = 3;

	private static List<User> users = new ArrayList<User>();

	static {
		users.add(new User("krishna", 1, new Date()));
		users.add(new User("Kanth", 2, new Date()));
		users.add(new User("ravi", 3, new Date()));
		users.add(new User("narendra", 4, new Date()));
	}

	public List<User> findAll() {
		return users;

	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++userscount);
		}

		users.add(user);
		return user;

	}

	public User findOne(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

}
