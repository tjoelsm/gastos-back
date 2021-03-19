/**
 * 
 */
package com.gastos.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gastos.back.dto.GrupoGastoDto;
import com.gastos.back.repository.entity.GrupoGastoEntity;
import com.gastos.back.repository.jdbc.GrupoGastosRepo;
import com.gastos.back.repository.mapper.GrupoGastosMapper;
import com.gastos.back.service.GrupoGastosService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tiago
 *
 */
@Service
@Slf4j
public class GrupoGastosServiceImpl implements GrupoGastosService{
	
	@Autowired
	private GrupoGastosRepo grupoGastosRepo;
	
	@Autowired
	private GrupoGastosMapper grupoGastosMapper;
	
	@Override
	public List<GrupoGastoDto> getAllGrupos() {
		List<GrupoGastoEntity> gruposGastos = grupoGastosRepo.findAll();
		return grupoGastosMapper.toDto(gruposGastos);
	}

}
