package com.ty.game_wing_springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ty.game_wing_springboot.dto.Court;

public interface CourtRepo extends JpaRepository<Court, Integer> {
	@Query("SELECT c.courts from Club c where c.id=?1")
	public List<Court> findByClubId(int id);
}
