/**
 * 
 */
package com.gastos.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gastos.back.dto.TipoGastoDto;
import com.gastos.back.repository.entity.TipoGastoEntity;
import com.gastos.back.repository.jdbc.TipoGastosRepo;
import com.gastos.back.repository.mapper.TipoGastosMapper;
import com.gastos.back.service.TipoGastosService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tiago
 *
 */
@Service
@Slf4j
public class TipoGastosServiceImpl implements TipoGastosService{
	
	@Autowired
	private TipoGastosRepo tipoGastosRepo;
	
	@Autowired
	private TipoGastosMapper tipoGastoMapper;
	
	@Override
	public List<TipoGastoDto> getAllTiposGastos() {
		List<TipoGastoEntity> tipoGastos = tipoGastosRepo.findAll();
		return tipoGastoMapper.toDto(tipoGastos);
	}

}
