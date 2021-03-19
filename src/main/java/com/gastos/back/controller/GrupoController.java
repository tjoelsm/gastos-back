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

import com.gastos.back.service.GrupoGastosService;
import com.gastos.back.service.PeriodoService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tiago
 *
 */
@RestController
@RequestMapping("/grupo")
@Slf4j
public class GrupoController {
	
	@Autowired
	private GrupoGastosService grupoGastosService;
	
	@GetMapping(value = "/getAllGrupos", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllGrupos(){
		log.info("#### Ruuning getAllGrupos ####");
		return new ResponseEntity<>(grupoGastosService.getAllGrupos(), HttpStatus.OK);
	}
	
}
