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
import com.gastos.back.service.TipoGastosService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tiago
 *
 */
@RestController
@RequestMapping("/tipos")
@Slf4j
public class TiposController {
	
	@Autowired
	private TipoGastosService tipoGastosService;
	
	@GetMapping(value = "/getAlltipos", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAlltipos(){
		log.info("#### Ruuning getAlltipos ####");
		return new ResponseEntity<>(tipoGastosService.getAllTiposGastos(), HttpStatus.OK);
	}
	
}
