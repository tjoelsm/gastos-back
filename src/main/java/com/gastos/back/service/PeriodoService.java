/**
 * 
 */
package com.gastos.back.service;

import java.util.List;

import com.gastos.back.dto.PeriodoDto;

/**
 * @author tiago
 *
 */
public interface PeriodoService {
	
	PeriodoDto getPeriodoAbierto();
	
	List<PeriodoDto> getAllPeriodos();
	
}
