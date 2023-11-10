package com.ty.game_wing_springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.game_wing_springboot.dto.Club;
import com.ty.game_wing_springboot.entity.Status;
import com.ty.game_wing_springboot.repository.ClubRepo;

@Repository
public class ClubDao {
	@Autowired
	private ClubRepo repo;

	public Club saveClub(Club club) {
		return repo.save(club);
	}

	public Club updateClub(Club club) {
		return repo.save(club);
	}

	public boolean deleteClub(int id) {
		repo.deleteById(id);
		return true;
	}

	public Club findCludById(int id) {
		Optional<Club> optional = repo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	public List<Club> findClubByStatus(Status status) {
		return repo.findByStatus(status);
	}
}
