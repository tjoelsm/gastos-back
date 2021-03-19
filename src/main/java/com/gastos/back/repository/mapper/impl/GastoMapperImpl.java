/**
 * 
 */
package com.gastos.back.repository.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gastos.back.dto.GastoDto;
import com.gastos.back.dto.GrupoGastoDto;
import com.gastos.back.dto.TipoGastoDto;
import com.gastos.back.repository.entity.GastoEntity;
import com.gastos.back.repository.mapper.GastoMapper;

/**
 * @author tiago
 *
 */
@Component
public class GastoMapperImpl implements GastoMapper {

	@Override
	public GastoEntity toEntity(GastoDto source) {
		GastoEntity result = new GastoEntity();
		result.getPk().setIdRegistro(source.getIdRegistro());
		result.getPk().setCodTipoGasto(source.getCodTipoGasto());
		result.getPk().setPeriodo(source.getPeriodo());
		result.setImporte(source.getImporte());
		result.setFecha(source.getFecha());
		return result;
	}

	@Override
	public GastoDto toDto(GastoEntity source) {
		GastoDto result = new GastoDto();
		result.setIdRegistro(source.getPk().getIdRegistro());
		result.setCodTipoGasto(source.getPk().getCodTipoGasto());
		result.setPeriodo(source.getPk().getPeriodo());
		result.setImporte(source.getImporte());
		result.setFecha(source.getFecha());
		result.setGrupo(new GrupoGastoDto());
		result.setTipoGasto(new TipoGastoDto());
		return result;
	}

	@Override
	public List<GastoEntity> toEntity(List<GastoDto> source) {
		List<GastoEntity> result = new ArrayList<>();
		for (GastoDto element : source) {
			GastoEntity elementEntity = new GastoEntity();
			elementEntity.getPk().setIdRegistro(element.getIdRegistro());
			elementEntity.getPk().setCodTipoGasto(element.getCodTipoGasto());
			elementEntity.getPk().setPeriodo(element.getPeriodo());
			elementEntity.setImporte(element.getImporte());
			elementEntity.setFecha(element.getFecha());
			result.add(elementEntity);
		}
		return result;
	}

	@Override
	public List<GastoDto> toDto(List<GastoEntity> source) {
		List<GastoDto> result = new ArrayList<>();
		for (GastoEntity element : source) {
			GastoDto elementDto = new GastoDto();
			elementDto.setIdRegistro(element.getPk().getIdRegistro());
			elementDto.setCodTipoGasto(element.getPk().getCodTipoGasto());
			elementDto.setPeriodo(element.getPk().getPeriodo());
			elementDto.setImporte(element.getImporte());
			elementDto.setFecha(element.getFecha());

			elementDto.setGrupo(new GrupoGastoDto());
			elementDto.setTipoGasto(new TipoGastoDto());

			result.add(elementDto);
		}
		return result;
	}

	@Override
	public GastoDto toDto(GastoEntity source, TipoGastoDto tipo, GrupoGastoDto grupo) {
		GastoDto result = new GastoDto();
		result.setIdRegistro(source.getPk().getIdRegistro());
		result.setCodTipoGasto(source.getPk().getCodTipoGasto());
		result.setPeriodo(source.getPk().getPeriodo());
		result.setImporte(source.getImporte());
		result.setFecha(source.getFecha());
		result.setGrupo(grupo);
		result.setTipoGasto(tipo);
		return result;
	}

	@Override
	public List<GastoDto> toDto(List<GastoEntity> source, List<TipoGastoDto> tipo, List<GrupoGastoDto> grupo) {
		List<GastoDto> result = new ArrayList<>();
		for (GastoEntity element : source) {
			GastoDto elementDto = new GastoDto();
			elementDto.setIdRegistro(element.getPk().getIdRegistro());
			elementDto.setCodTipoGasto(element.getPk().getCodTipoGasto());
			elementDto.setPeriodo(element.getPk().getPeriodo());
			elementDto.setImporte(element.getImporte());
			elementDto.setFecha(element.getFecha());

			TipoGastoDto tipoGasto = tipo.stream()
					.filter(codTipoGasto -> codTipoGasto.getCodTipoGasto().equals(element.getPk().getCodTipoGasto()))
					.findFirst()
					.orElse(new TipoGastoDto());
			elementDto.setTipoGasto(tipoGasto);
			
			GrupoGastoDto grupoGasto = grupo.stream()
					.filter(codGrupo -> codGrupo.getCodGrupo().equals(elementDto.getTipoGasto().getGrupoGasto()))
					.findFirst()
					.orElse(new GrupoGastoDto());
			elementDto.setGrupo(grupoGasto);
			result.add(elementDto);
		}
		return result;
	}

}
