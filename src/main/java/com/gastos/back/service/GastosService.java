/**
 * 
 */
package com.gastos.back.service;

import java.util.List;

import com.gastos.back.dto.GastoDto;
import com.gastos.back.dto.request.GastoRequestDto;
import com.gastos.back.dto.response.ResponseGastosDto;

/**
 * @author tiago
 *
 */
public interface GastosService {
	
	List<GastoDto> getAllGastos();
	List<GastoDto> getAllGastosByMounth(String periodo);
	
	ResponseGastosDto addNewGasto(GastoRequestDto gastoEntrada);

}
