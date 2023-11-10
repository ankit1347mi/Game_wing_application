package com.ty.game_wing_springboot.exception;

public class NoSuchUserFoundException extends RuntimeException {

	@Override
	public String getMessage() {
		return "No Such User Exists";
	}

}
