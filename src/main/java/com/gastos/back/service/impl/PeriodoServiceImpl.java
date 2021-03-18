/**
 * 
 */
package com.gastos.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gastos.back.dto.PeriodoDto;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PeriodoDto> getAllPeriodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
