/**
 * 
 */
package com.gastos.back.service;

import java.util.List;

import com.gastos.back.dto.GastoDto;
import com.gastos.back.dto.request.GastoRequestDto;

/**
 * @author tiago
 *
 */
public interface GastosService {
	
	List<GastoDto> getAllGastos();
	List<GastoDto> getAllGastosByMounth(String periodo);
	
	Boolean addNewGasto(GastoRequestDto gastoEntrada);

}
