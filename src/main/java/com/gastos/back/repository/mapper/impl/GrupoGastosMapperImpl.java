/**
 * 
 */
package com.gastos.back.repository.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gastos.back.dto.GrupoGastoDto;
import com.gastos.back.repository.entity.GrupoGastoEntity;
import com.gastos.back.repository.mapper.GrupoGastosMapper;

/**
 * @author tiago
 *
 */
@Component
public class GrupoGastosMapperImpl implements GrupoGastosMapper {

	@Override
	public GrupoGastoEntity toEntity(GrupoGastoDto source) {
		GrupoGastoEntity result = new GrupoGastoEntity();
		result.setCodGrupo(source.getCodGrupo());
		result.setGrupoGasto(source.getGrupoGasto());
		result.setAhorro(source.getAhorro());
		return result;
	}

	@Override
	public GrupoGastoDto toDto(GrupoGastoEntity source) {
		GrupoGastoDto result = new GrupoGastoDto();
		result.setCodGrupo(source.getCodGrupo());
		result.setGrupoGasto(source.getGrupoGasto());
		result.setAhorro(source.getAhorro());
		return result;
	}

	@Override
	public List<GrupoGastoEntity> toEntity(List<GrupoGastoDto> source) {
		List<GrupoGastoEntity> result = new ArrayList<>();
		for(GrupoGastoDto element : source) {
			GrupoGastoEntity elementEntity = new GrupoGastoEntity();
			elementEntity.setCodGrupo(element.getCodGrupo());
			elementEntity.setGrupoGasto(element.getGrupoGasto());
			elementEntity.setAhorro(element.getAhorro());
			result.add(elementEntity);
		}
		return result;
	}

	@Override
	public List<GrupoGastoDto> toDto(List<GrupoGastoEntity> source) {
		List<GrupoGastoDto> result = new ArrayList<>();
		for(GrupoGastoEntity element : source) {
			GrupoGastoDto elementDto = new GrupoGastoDto();
			elementDto.setCodGrupo(element.getCodGrupo());
			elementDto.setGrupoGasto(element.getGrupoGasto());
			elementDto.setAhorro(element.getAhorro());
			result.add(elementDto);
		}
		return result;
	}

}
