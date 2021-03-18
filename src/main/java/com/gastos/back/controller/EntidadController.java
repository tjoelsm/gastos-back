/**
 * 
 */
package com.gastos.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gastos.back.service.EntidadService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tiago
 *
 */
@RestController
@RequestMapping("/entidad")
@Slf4j
public class EntidadController {
	
	@Autowired
	EntidadService entidadService;
	
	@GetMapping(value = "/getAllEntidad")
	public ResponseEntity<?> getAllEntidad(){
		log.info("#### Ruuning getAllEntidad ####");
		return new ResponseEntity<>("HOLA TIAGO", HttpStatus.OK);
	}

}
