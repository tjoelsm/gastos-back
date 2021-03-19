/**
 * 
 */
package com.gastos.back.service;

import java.util.List;

import com.gastos.back.dto.GastoDto;

/**
 * @author tiago
 *
 */
public interface GastosService {
	
	List<GastoDto> getAllGastos();
	List<GastoDto> getAllGastosByMounth(String periodo);
	
	Boolean addNewGasto(GastoDto gasto);

}
