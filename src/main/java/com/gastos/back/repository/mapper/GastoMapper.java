/**
 * 
 */
package com.gastos.back.repository.mapper;

import java.util.List;

import com.gastos.back.dto.GastoDto;
import com.gastos.back.dto.GrupoGastoDto;
import com.gastos.back.dto.TipoGastoDto;
import com.gastos.back.repository.entity.GastoEntity;

/**
 * @author tiago
 *
 */
public interface GastoMapper extends MapperCore<GastoDto, GastoEntity, TipoGastoDto, GrupoGastoDto>{

	GastoDto toDto(GastoEntity source, TipoGastoDto tipo, GrupoGastoDto grupo);
	  List<GastoDto> toDto(List<GastoEntity> source, List<TipoGastoDto> tipo, List<GrupoGastoDto> grupo);
	
}
