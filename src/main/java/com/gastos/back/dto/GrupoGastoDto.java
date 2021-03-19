/**
 * 
 */
package com.gastos.back.dto;

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
public class GrupoGastoDto {
	
	private Integer codGrupo;
	private String grupoGasto;	
	private Boolean ahorro;
}
