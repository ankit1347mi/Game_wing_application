package com.ty.game_wing_springboot.entity;

import lombok.Data;

@Data
public class ResponseStructure<T> {

	private int status;

	private String message;

	private T data;
}
