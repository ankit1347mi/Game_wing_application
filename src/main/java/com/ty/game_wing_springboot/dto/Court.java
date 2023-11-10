package com.ty.game_wing_springboot.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Data
@Entity
public class Court {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String sportName;

	private String sportType;

	private double courtArea;

	private double duration;

	private double price;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Booking> bookings;

}
