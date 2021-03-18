/**
 * 
 */
package com.gastos.back.repository.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gastos.back.dto.EntidadDto;
import com.gastos.back.dto.PeriodoDto;
import com.gastos.back.repository.entity.EntidadEntity;
import com.gastos.back.repository.entity.PeriodoEntity;
import com.gastos.back.repository.mapper.PeriodoMapper;

/**
 * @author tiago
 *
 */
@Component
public class PeriodoMapperImpl implements PeriodoMapper{

	@Override
	public PeriodoEntity toEntity(PeriodoDto source) {
		PeriodoEntity result = new PeriodoEntity();
		result.setPeriodo(source.getPeriodo());
		result.setAbierto(source.getAbierto());
		return result;
	}

	@Override
	public PeriodoDto toDto(PeriodoEntity source) {
		PeriodoDto result = new PeriodoDto();
		result.setPeriodo(source.getPeriodo());
		result.setAbierto(source.getAbierto());
		return result;
	}

	@Override
	public List<PeriodoEntity> toEntity(List<PeriodoDto> source) {
		List<PeriodoEntity> result = new ArrayList<>();
		for(PeriodoDto element : source) {
			PeriodoEntity elementEntity = new PeriodoEntity();
			elementEntity.setPeriodo(element.getPeriodo());
			elementEntity.setAbierto(element.getAbierto());
			result.add(elementEntity);
		}
		return result;
	}

	@Override
	public List<PeriodoDto> toDto(List<PeriodoEntity> source) {
		List<PeriodoDto> result = new ArrayList<>();
		for(PeriodoEntity element : source) {
			PeriodoDto elementDto = new PeriodoDto();
			elementDto.setPeriodo(element.getPeriodo());
			elementDto.setAbierto(element.getAbierto());
			result.add(elementDto);
		}
		return result;
	}

}
