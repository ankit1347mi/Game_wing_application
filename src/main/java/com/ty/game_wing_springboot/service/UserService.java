package com.ty.game_wing_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.game_wing_springboot.dao.UserDao;
import com.ty.game_wing_springboot.dto.User;
import com.ty.game_wing_springboot.entity.ResponseStructure;
import com.ty.game_wing_springboot.exception.NoSuchUserFoundException;

@Service
public class UserService {
	@Autowired
	private UserDao dao;

	public ResponseEntity<ResponseStructure<User>> saveUser(User user) {
		User user2 = dao.saveUser(user);
		ResponseStructure<User> structure = new ResponseStructure<User>();
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setMessage("Success");
		structure.setData(user2);

		return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.CREATED);
	}

	public ResponseEntity<ResponseStructure<User>> updateUser(int id) {
		User user = dao.findUserById(id);
		if (user != null) {

			User user1 = dao.updateUser(user);
			ResponseStructure<User> structure = new ResponseStructure<User>();
			structure.setStatus(HttpStatus.CREATED.value());
			structure.setMessage("Success");
			structure.setData(user1);

			return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.CREATED);

		} else {
			throw new NoSuchUserFoundException();
		}
	}

}
