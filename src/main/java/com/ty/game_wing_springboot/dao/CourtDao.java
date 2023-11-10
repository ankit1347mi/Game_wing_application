package com.ty.game_wing_springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.game_wing_springboot.dto.Court;
import com.ty.game_wing_springboot.repository.CourtRepo;

@Repository
public class CourtDao {
	@Autowired
	private CourtRepo repo;

	public Court saveCourt(Court court) {
		return repo.save(court);
	}

	public Court updateCourt(Court court) {
		return repo.save(court);
	}

	public boolean deleteCourt(int id) {
		repo.deleteById(id);
		return true;
	}

	public Court findCourtById(int id) {
		Optional<Court> optional = repo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	public List<Court> findCourtByClubId(int id) {
		return repo.findByClubId(id);
	}

	public List<Court> findAllCourt() {
		return repo.findAll();
	}

}
