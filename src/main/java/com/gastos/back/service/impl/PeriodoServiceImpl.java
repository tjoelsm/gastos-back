/**
 * 
 */
package com.gastos.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gastos.back.dto.PeriodoDto;
import com.gastos.back.repository.entity.PeriodoEntity;
import com.gastos.back.repository.jdbc.PeriodoRepo;
import com.gastos.back.repository.mapper.PeriodoMapper;
import com.gastos.back.service.PeriodoService;

/**
 * @author tiago
 *
 */
@Service
public class PeriodoServiceImpl implements PeriodoService{

	@Autowired
	private PeriodoRepo periodoRepo;
	
	@Autowired
	private PeriodoMapper periodoMapper;
	
	@Override
	public PeriodoDto getPeriodoAbierto() {
		PeriodoEntity periodo = periodoRepo.findByAbierto(true);
		return periodoMapper.toDto(periodo);
	}

	@Override
	public List<PeriodoDto> getAllPeriodos() {
		List<PeriodoEntity> periodos = periodoRepo.findAll();
		return periodoMapper.toDto(periodos);
	}

}
