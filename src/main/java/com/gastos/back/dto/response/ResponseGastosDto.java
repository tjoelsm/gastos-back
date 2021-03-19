package com.gastos.back.dto.response;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ResponseGastosDto {

	private HttpStatus cod;
	private String mensaje;
	private Boolean error;
	
}
