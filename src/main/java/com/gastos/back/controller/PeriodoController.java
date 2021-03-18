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
@RequestMapping("/periodo")
@Slf4j
public class PeriodoController {
	
	@GetMapping(value = "/getAllPeriodos")
	public ResponseEntity<?> getAllPeriodos(){
		return new ResponseEntity<>("HOLA TIAGO Periodo", HttpStatus.OK);
	}

}
