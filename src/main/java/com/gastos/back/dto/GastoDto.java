/**
 * 
 */
package com.gastos.back.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gastos.back.repository.entity.pk.GastosEntityPk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author tiago
 *
 */
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class GastoDto {
	
	private Integer idRegistro;
	private Integer codTipoGasto;
	private String periodo;
	private Double importe;
	@JsonFormat(pattern = "dd-MM-YYYY")
	private Date fecha;
	
	private GrupoGastoDto grupo;
	private TipoGastoDto tipoGasto;
}
