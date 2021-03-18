/**
 * 
 */
package com.gastos.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gastos.back.dto.EntidadDto;
import com.gastos.back.repository.jdbc.EntidadRepo;
import com.gastos.back.repository.mapper.EntidadMapper;
import com.gastos.back.service.EntidadService;

/**
 * @author tiago
 *
 */
@Service
public class EntidadServiceImpl implements EntidadService {

	@Autowired
	private EntidadRepo entidadRepo;
	
	@Autowired
	private EntidadMapper entidadMapper;
	
	@Override
	public List<EntidadDto> getAllEntidades() {
		// TODO Auto-generated method stub
		return null;
	}

}
