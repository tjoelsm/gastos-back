/**
 * 
 */
package com.gastos.back.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tiago
 *
 */
@RestController
@RequestMapping("/entidad")
@Slf4j
public class EntidadController {
	
	@GetMapping(value = "/getAllEntidad")
	public ResponseEntity<?> getAllEntidad(){
		return new ResponseEntity<>("HOLA TIAGO", HttpStatus.OK);
	}

}
