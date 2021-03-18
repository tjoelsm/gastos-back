/**
 * 
 */
package com.gastos.back.repository.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gastos.back.dto.EntidadDto;
import com.gastos.back.repository.entity.EntidadEntity;
import com.gastos.back.repository.mapper.EntidadMapper;

/**
 * @author tiago
 *
 */
@Component
public class EntidadMapperImpl implements EntidadMapper{

	@Override
	public EntidadEntity toEntity(EntidadDto source) {
		EntidadEntity elementEntity = new EntidadEntity();
		elementEntity.setCodEntidad(source.getCodEntidad());
		elementEntity.setNombre(source.getNombre());
		elementEntity.setWeb(source.getWeb());
		return elementEntity;
	}

	@Override
	public EntidadDto toDto(EntidadEntity source) {
		EntidadDto elementDto = new EntidadDto();
		elementDto.setCodEntidad(source.getCodEntidad());
		elementDto.setNombre(source.getNombre());
		elementDto.setWeb(source.getWeb());
		return elementDto;
	}

	@Override
	public List<EntidadEntity> toEntity(List<EntidadDto> source) {
		List<EntidadEntity> result = new ArrayList<>();
		for(EntidadDto element : source) {
			EntidadEntity elementEntity = new EntidadEntity();
			elementEntity.setCodEntidad(element.getCodEntidad());
			elementEntity.setNombre(element.getNombre());
			elementEntity.setWeb(element.getWeb());
			result.add(elementEntity);
		}
		return result;
	}

	@Override
	public List<EntidadDto> toDto(List<EntidadEntity> source) {
		List<EntidadDto> result = new ArrayList<>();
		for(EntidadEntity element : source) {
			EntidadDto elementDto = new EntidadDto();
			elementDto.setCodEntidad(element.getCodEntidad());
			elementDto.setNombre(element.getNombre());
			elementDto.setWeb(element.getWeb());
			result.add(elementDto);
		}
		return result;
	}

}
