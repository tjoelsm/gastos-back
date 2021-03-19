/**
 * 
 */
package com.gastos.back.repository.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gastos.back.dto.TipoGastoDto;
import com.gastos.back.repository.entity.TipoGastoEntity;
import com.gastos.back.repository.mapper.TipoGastosMapper;

/**
 * @author tiago
 *
 */
@Component
public class TipoGastosMapperImpl implements TipoGastosMapper{

	@Override
	public TipoGastoEntity toEntity(TipoGastoDto source) {
		TipoGastoEntity result = new TipoGastoEntity();
		result.getPk().setCodTipoGasto(source.getCodTipoGasto());
		result.getPk().setGrupoGasto(source.getGrupoGasto());
		result.setTipoGasto(source.getTipoGasto());
		result.setActivo(source.getActivo());
		result.setValoDefecto(source.getValoDefecto());
		result.setFechaBaja(source.getFechaBaja());
		return result;
	}

	@Override
	public TipoGastoDto toDto(TipoGastoEntity source) {
		TipoGastoDto result = new TipoGastoDto();
		result.setCodTipoGasto(source.getPk().getCodTipoGasto());
		result.setGrupoGasto(source.getPk().getGrupoGasto());
		result.setTipoGasto(source.getTipoGasto());
		result.setActivo(source.getActivo());
		result.setValoDefecto(source.getValoDefecto());
		result.setFechaBaja(source.getFechaBaja());
		return result;
	}

	@Override
	public List<TipoGastoEntity> toEntity(List<TipoGastoDto> source) {
		List<TipoGastoEntity> result = new ArrayList<>();
		for(TipoGastoDto element : source) {
			TipoGastoEntity elemenEntity = new TipoGastoEntity();
			elemenEntity.getPk().setCodTipoGasto(element.getCodTipoGasto());
			elemenEntity.getPk().setGrupoGasto(element.getGrupoGasto());
			elemenEntity.setTipoGasto(element.getTipoGasto());
			elemenEntity.setActivo(element.getActivo());
			elemenEntity.setValoDefecto(element.getValoDefecto());
			elemenEntity.setFechaBaja(element.getFechaBaja());
			result.add(elemenEntity);
		}
		return result;
	}

	@Override
	public List<TipoGastoDto> toDto(List<TipoGastoEntity> source) {
		List<TipoGastoDto> result = new ArrayList<>();
		for(TipoGastoEntity element : source) {
			TipoGastoDto elementDto = new TipoGastoDto();
			elementDto.setCodTipoGasto(element.getPk().getCodTipoGasto());
			elementDto.setGrupoGasto(element.getPk().getGrupoGasto());
			elementDto.setTipoGasto(element.getTipoGasto());
			elementDto.setActivo(element.getActivo());
			elementDto.setValoDefecto(element.getValoDefecto());
			elementDto.setFechaBaja(element.getFechaBaja());
			result.add(elementDto);
		}
		return result;
	}

}
