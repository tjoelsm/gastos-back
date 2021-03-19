/**
 * 
 */
package com.gastos.back.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gastos.back.dto.GastoDto;
import com.gastos.back.dto.GrupoGastoDto;
import com.gastos.back.dto.TipoGastoDto;
import com.gastos.back.dto.request.GastoRequestDto;
import com.gastos.back.repository.entity.GastoEntity;
import com.gastos.back.repository.jdbc.GastosRepo;
import com.gastos.back.repository.mapper.GastoMapper;
import com.gastos.back.service.EntidadService;
import com.gastos.back.service.GastosService;
import com.gastos.back.service.GrupoGastosService;
import com.gastos.back.service.PeriodoService;
import com.gastos.back.service.TipoGastosService;
import com.gastos.back.utils.DateUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tiago
 *
 */
@Service
@Slf4j
public class GastosServiceImpl implements GastosService{
	
	@Autowired
	private EntidadService entidadService;

	@Autowired
	private TipoGastosService tipoGastosService;
	
	@Autowired
	private GrupoGastosService grupoGastosService;
	
	@Autowired
	private PeriodoService  periodoService;
	
	@Autowired
	private GastosRepo gastosRepo;
	
	@Autowired
	private GastoMapper gastoMapper;
	
	@Override
	public List<GastoDto> getAllGastos() {
		List<GastoEntity> listaGastos = gastosRepo.findAll();
		if (listaGastos != null) {
			List<GrupoGastoDto> grupoGasto = grupoGastosService.getAllGrupos();
			List<TipoGastoDto> tipoGasto = tipoGastosService.getAllTiposGastos();
			return gastoMapper.toDto(listaGastos, tipoGasto, grupoGasto);
		} else {
			return new ArrayList<>();
		}		
	}

	@Override
	public Boolean addNewGasto(GastoRequestDto gastoEntrada) {
		GastoDto gasto = new GastoDto();
		Integer maxRegistro = gastosRepo.getMaxIdRegistroByPeriodo(gastoEntrada.getPeriodo());
			if (maxRegistro==null) {
				maxRegistro = 1;
			}
		gasto.setIdRegistro(maxRegistro);
		gasto.setCodTipoGasto(gastoEntrada.getCodTipoGasto());
		gasto.setImporte(gastoEntrada.getImporte());
		gasto.setPeriodo(gastoEntrada.getPeriodo());
		gasto.setFecha(DateUtils.generateCurrentDate());
		if (validateFieldsGastos(gasto)) {
			GastoEntity newGasto = gastoMapper.toEntity(gasto);
				try {
					gastosRepo.save(newGasto);
					return true;
				} catch (Exception e) {
					log.info("#### ERROR addNewGasto #### {}".concat(e.getMessage()));
					return false;
				}			
		} else {
			return false;
		}
	}

	@Override
	public List<GastoDto> getAllGastosByMounth(String periodo) {
		List<GastoEntity> listaGastos = gastosRepo.findAllByPk_Periodo(periodo);
		if (listaGastos != null) {
			List<GrupoGastoDto> grupoGasto = grupoGastosService.getAllGrupos();
			List<TipoGastoDto> tipoGasto = tipoGastosService.getAllTiposGastos();
			return gastoMapper.toDto(listaGastos, tipoGasto, grupoGasto);
		} else {
			return new ArrayList<>();
		}		
	}

	private Boolean validateFieldsGastos(GastoDto gasto) {
		return true;
	}
	
}
