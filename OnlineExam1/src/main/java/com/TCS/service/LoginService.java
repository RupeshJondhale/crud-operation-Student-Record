package com.TCS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCS.dao.LoginDAO;
import com.TCS.entity.User;

@Service
public class LoginService {

	@Autowired
	LoginDAO dao;

	public boolean validate(User user) {
		String dbPassword = dao.getPassword(user.getUsername());
		if (dbPassword == null)
			return false;

		if (dbPassword.equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

}