package com.ty.game_wing_springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.game_wing_springboot.dto.Club;
import com.ty.game_wing_springboot.entity.Status;

public interface ClubRepo extends JpaRepository<Club, Integer> {

	public List<Club> findByStatus(Status status);
}
