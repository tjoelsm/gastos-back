/**
 * 
 */
package com.gastos.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gastos.back.dto.GastoDto;
import com.gastos.back.dto.request.GastoRequestDto;
import com.gastos.back.service.GastosService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tiago
 *
 */
@RestController
@RequestMapping("/gasto")
@Slf4j
public class GastosController {
	
	@Autowired
	private GastosService gastosService;
	
	@GetMapping(value = "/getAllGastos", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllGastos(){
		log.info("#### Ruuning getAllGastos ####");
		return new ResponseEntity<>(gastosService.getAllGastos(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAllGastosByMounth", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllGastosByMounth(String anoMes){
		log.info("#### Ruuning getAllGgetAllGastosByMounthastos ####");
		return new ResponseEntity<>(gastosService.getAllGastosByMounth(anoMes), HttpStatus.OK);
	}
	
	@PostMapping(value = "/addNewGastos", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addNewGastos(@RequestBody GastoRequestDto gasto){
		log.info("#### Ruuning addNewGastos ####");
		
		return new ResponseEntity<>(gastosService.addNewGasto(gasto), HttpStatus.OK);
	}
	
}
