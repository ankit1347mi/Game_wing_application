package com.ty.game_wing_springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.game_wing_springboot.dto.User;
import com.ty.game_wing_springboot.entity.Role;
import com.ty.game_wing_springboot.repository.UserRepo;

@Repository
public class UserDao {
	@Autowired
	private UserRepo repo;

	public User saveUser(User user) {
		return repo.save(user);
	}

	public User updateUser(User user) {
		return repo.save(user);
	}

	public boolean deleteUser(int id) {
		repo.deleteById(id);
		return true;
	}

	public User findUserById(int id) {
		Optional<User> optional = repo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	public List<User> findAllUser() {
		return repo.findAll();
	}

	public User findUserByEmailAndPassword(String email, String password) {
		return repo.findByEmailAndPassword(email, password);
	}

	public List<User> findUserByRole(Role role) {
		return repo.findByRole(role);
	}
}
