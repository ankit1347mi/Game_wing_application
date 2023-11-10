package com.ty.game_wing_springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.game_wing_springboot.dto.User;
import com.ty.game_wing_springboot.entity.Role;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByEmailAndPassword(String email, String password);

	public List<User> findByRole(Role role);
}
