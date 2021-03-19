package com.gastos.back.utils;

import org.springframework.http.HttpStatus;

import com.gastos.back.dto.response.ResponseGastosDto;

public class Commons {
	
	public static ResponseGastosDto setResponse(HttpStatus cod, String mensaje, Boolean error) {
		return new ResponseGastosDto(cod, mensaje, error);		
	}

	public Commons() {
		super();
	}

}
