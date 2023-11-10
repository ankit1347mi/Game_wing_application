package com.ty.game_wing_springboot.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ty.game_wing_springboot.entity.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Component
@Data
@Entity
public class Club {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private Status status;
	@OneToMany
	private List<Court> courts;
	@OneToMany
	private List<User> users;
}
