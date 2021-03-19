/**
 * 
 */
package com.gastos.back.dto;

import java.util.Date;

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
public class TipoGastoDto {
	
	private Integer codTipoGasto;
	private Integer grupoGasto;
	private String tipoGasto;
	private Boolean activo;
	private Double valoDefecto;
	private Date fechaBaja;
}
