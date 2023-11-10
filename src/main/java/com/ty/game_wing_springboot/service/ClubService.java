package com.ty.game_wing_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.game_wing_springboot.dao.ClubDao;
import com.ty.game_wing_springboot.dto.Club;

@Service
public class ClubService {
	@Autowired
	private ClubDao Dao;
	public void saveClub(Club club)
	{
		
	}

}
