/**
 * 
 */
package com.gastos.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gastos.back.service.PeriodoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tiago
 *
 */
@RestController
@RequestMapping("/periodo")
@Slf4j
public class PeriodoController {
	
	@Autowired
	private PeriodoService periodoService;
	
	@GetMapping(value = "/getAllPeriodos", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllPeriodos(){
		log.info("#### Ruuning getAllPeriodos ####");
		return new ResponseEntity<>(periodoService.getAllPeriodos(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/getPeriodoAbierto", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getPeriodoAbierto(){
		log.info("#### Ruuning getPeriodoAbierto ####");
		return new ResponseEntity<>(periodoService.getPeriodoAbierto(), HttpStatus.OK);
	}

}
